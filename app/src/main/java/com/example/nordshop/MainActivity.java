package com.example.nordshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;



public class MainActivity extends AppCompatActivity {


    private ImageButton imageButtonMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




/*


 */

        imageButtonMenu = (ImageButton) findViewById(R.id.imageButtonMenu);
        imageButtonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogin();
            }
        });


    }

    private void openLogin() {
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
    }





}