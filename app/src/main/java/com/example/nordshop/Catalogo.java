package com.example.nordshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.nordshop.R;

public class Catalogo extends AppCompatActivity {
    private ImageButton buttonCatalogoBackLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

        // buttonCatalogoBackLogin = (ImageButton) findViewById(R.id.imageButton);
      /*  buttonCatalogoBackLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogin();
            }
        });
    }
    private void openLogin() {
        Intent intent = new Intent(this, TelaLogin.class);
        startActivity(intent);
    }
    */
    }
}