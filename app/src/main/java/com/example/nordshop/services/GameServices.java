package com.example.nordshop.services;

import android.widget.ImageView;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import org.json.JSONObject;

import java.io.InputStream;
public class GameServices {

    public static void loadImage(ImageView imageView, String urlImage){
        new DonwloadImageTask(imageView).execute(urlImage);
    }

    public static void searchImageGame(String url, Response.Listener<Bitmap> listener){

        Constants.requestQueue.start();
        Log.v("request", "create request");

        ImageRequest imgReq = new ImageRequest(url, listener,0,0,
                null, null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("request", error.getMessage());
            }
        });
        Constants.requestQueue.add(imgReq);
    }

    public static void searchGameId(int id, Response.Listener<JSONObject> listener){
        Constants.requestQueue.start();

        String url = Constants.URLAPI+""+id+""+ Constants.URLAPIKEY;

        JsonObjectRequest jor = new JsonObjectRequest(Request.Method.GET, url, null, listener, null);

        Constants.requestQueue.add(jor);
    }


    private static class DonwloadImageTask extends AsyncTask<String, Void, Bitmap>{
        ImageView bmImage;

        public  DonwloadImageTask (ImageView bmImage){ this.bmImage = bmImage; }

        protected Bitmap doInBackground(String... urls){
            String urldisplay = urls[0];
            Bitmap mIcon = null;
            try{
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon = BitmapFactory.decodeStream(in);
            }catch (Exception e){
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon;
        }
        protected void onPostExecute(Bitmap result) { bmImage.setImageBitmap(result);}
    }

}
