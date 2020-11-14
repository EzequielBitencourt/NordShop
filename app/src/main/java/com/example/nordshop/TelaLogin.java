package com.example.nordshop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nordshop.database.Conection;
import com.example.nordshop.exception.IncorrectPasswordException;
import com.example.nordshop.exception.UserNotFoundException;

public class TelaLogin extends AppCompatActivity {
    private Button buttonLogin;
    private Button buttonCadastrar;
//    private EditText inputUsuario;
//    private EditText inputSenha;
//    Conection db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity_login);
        this.getSupportActionBar().hide();
//        db = new Conection(this);

        buttonCadastrar = (Button) findViewById(R.id.buttonCadastrar);

//        buttonLogin = (Button) findViewById(R.id.buttonLogin);
//        inputUsuario = (EditText) findViewById(R.id.username);
//        inputSenha = (EditText) findViewById(R.id.password);
//
//
//        buttonLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                actionLogin();
//            }
//        });
        buttonCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCadastro();
            }
        });

    }

//    private void actionLogin() {
//
//        try {
//            db.CheckUserNameAndPass(inputUsuario.getText().toString(), inputSenha.getText().toString());
//            openCatalogo();
//        } catch (UserNotFoundException e) {
//
//        }
//    }

//    private void openCatalogo() {
//        Intent intent = new Intent(this, Catalogo.class);
//        startActivity(intent);
//    }

    private void openCadastro() {
        Intent intent = new Intent(this, CadastroUsuarioActivity.class);
        startActivity(intent);
    }

}
