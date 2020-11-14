package com.example.nordshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageButton;


public class TelaSplash extends AppCompatActivity {


    private ImageButton imageButtonMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity_splash);
        this.getSupportActionBar().hide();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                openLogin();
            }
        },1000);

    }

    private void openLogin() {
        Intent intent = new Intent(this, Detalhe.class);
        startActivity(intent);
        finish();
    }

    private void openCadastro() {
        Intent intent = new Intent(this, CadastroUsuarioActivity.class);
        startActivity(intent);
        finish();
    }



}