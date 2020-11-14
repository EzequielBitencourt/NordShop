/*package com.example.nordshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.ImageView;

import com.example.nordshop.model.Game;
import com.example.nordshop.services.GameServices;

import org.json.JSONException;
import org.json.JSONObject;

import retrofit2.Response;

public class ActivityGame extends AppCompatActivity implements Response.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_game);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
    }

    int idGame = 0;

    Intent intent = getIntent();
        if(Intent.ACTION_VIEW.equals(intent.getAction()))

    {
        Uri uri = intent.getData();
        String id = uri.getQueryParameter("id");
        idGame = Integer.parseInt(id);
    } else

    {
        if (intent.getType().equals("application/json")) {
            try {
                Log.d("intent", intent.getExtras().toString());
                for (String k : intent.getExtras().keySet()) {
                    Log.d("intent", k);
                }
                JSONObject json = new JSONObject(intent.getExtras().getString("json"));
                Log.e("intent", json.toString());
                idGame = json.getInt("id");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            idGame = this.getIntent().getIntExtra("idFilme", 0);
        }
        GameServices.searchGameId(idGame, this);
    }





    // importante para apresentar o menu na tela da Activity
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu., menu);
        return true;
    }

    @Override
    public void onResponse(Object response) {
        Log.v("request",response.getClass().getCanonicalName());

        if( response.getClass() == JSONObject.class) {
            Log.v("request","Recebi JSON"+((JSONObject)response).toString());
            Game game = new Game(((JSONObject) response));
            binding.setFilme(Game);
            GameServices.searchImageGame("https://image.tmdb.org/t/p/w300" +
                    game.getImage(), this);

        }

        if( response.getClass() == Bitmap.class) {
            Log.v("request","recebi imagem "+(response));

            ImageView tv = findViewById(R.id.);
            tv.setImageBitmap((Bitmap) response);
        }
    }
}*/