package com.example.nordshop;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.nordshop.database.UsuarioDAO;

public class CadastroUsuarioActivity extends AppCompatActivity {
        private DrawerLayout mDrawerLayout;
        private ActionBarDrawerToggle toggle;
        private EditText cadastroNome;

        private EditText usuario;
        private EditText senha;
        private EditText conSenha;
        private UsuarioDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity_cadastro);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION, WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout_cadastro);
        toggle = new ActionBarDrawerToggle(this, mDrawerLayout,R .string.open, R.string.close);

        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

/*
        usuario = findViewById(R.id.editTextPersonUsername);
        senha = findViewById(R.id.editTextPersonPassword);
        conSenha = findViewById(R.id.editTextPersonConfirmPassword);
        dao = new UsuarioDAO(this);
*/
    }

    public void salvar(View view){
        Usuario u = new Usuario();
        String usuarioString = usuario.getText().toString();
        String senhaString = senha.getText().toString();
        String conSenhaString = conSenha.getText().toString();


        if(usuarioString.equals("")||senhaString.equals("")||conSenhaString.equals("")){
            Toast.makeText(getApplicationContext(),"Os campos estão vazios",Toast.LENGTH_SHORT).show();
        }else {
            if(senhaString.equals(conSenhaString)){
                u.setUsuario(usuarioString);
                u.setSenha(senhaString);
                dao.inserir(u);
                openLogin();
                Toast.makeText(getApplicationContext(),"Usuario cadastrado com sucesso",Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(getApplicationContext(),"Não foi possivel confirmar a senha",Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void openLogin() {
        Intent intent = new Intent(this, TelaLogin.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(toggle.onOptionsItemSelected(item)){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
