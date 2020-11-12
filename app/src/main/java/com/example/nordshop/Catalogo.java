package com.example.nordshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.nordshop.R;
import com.example.nordshop.model.Category;
import com.example.nordshop.model.Game;
import com.example.nordshop.presenters.GameContract;
import com.example.nordshop.presenters.GamePresenter;
import com.example.nordshop.services.CategoryFW;
import com.example.nordshop.services.Constants;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Catalogo extends AppCompatActivity implements Response.Listener<JSONObject>, GameContract.GameView {
    private ImageButton buttonCatalogoBackLogin;

    GameContract.GamePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);
        this.presenter = new GamePresenter(this);
        presenter.warning("teste");
        Constants.requestQueue.start();
        String url = "";
        int type = this.getIntent().getIntExtra("GameType",1);
        switch (type){
            case Category
                    .TYPE_SURVIVALHORROR: url = Constants.URLAPI
                    + "genre/movie/list?language=pt-BR&api_key="
                    + Constants.URLAPIKEY;
            break;
        }

        JsonObjectRequest jor = new JsonObjectRequest(Request.Method.GET, url, null,
                this, null);

        Constants.requestQueue.add(jor);


        //LinearLayout layout = findViewById(R.id.)
        CategoryFW cfw = CategoryFW.getInstance();
        //RecyclerView rv = findViewById(R.id.)
        StaggeredGridLayoutManager  lmm = new StaggeredGridLayoutManager(3,
                LinearLayout.VERTICAL);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        //rv.setLayoutManager(llm);
    }

    @Override
    public void onResponse(JSONObject response) {
        CategoryFW cfw = CategoryFW.getInstance();
        try {
            JSONArray genres = response.getJSONArray("genres");
            for(int i = 0; i < genres.length(); i++) {
                cfw.addCategory(new Category(genres.getJSONObject(i)
                        .getInt("id"),genres.getJSONObject(i)
                        .getString("name")));
            }
        } catch (JSONException ex) {}
       /* CategoryAdapter adap = new CategoryAdapter(new ArrayList<Category>(cfw
                .getCategory()));
        RecyclerView rv = findViewById(R.id.reclyclerCategory);
        rv.setAdapter(adap);
    */}

    @Override
    public void changeText(String text) {
        Toast.makeText(this,text,Toast.LENGTH_LONG).show();}

    @Override
    public void favoriteGame(List<Game> gamesList) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onDestroy();
        this.presenter.destroy();
    }
}