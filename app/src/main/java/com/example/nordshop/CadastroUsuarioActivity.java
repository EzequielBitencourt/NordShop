package com.example.nordshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.example.nordshop.database.UsuarioDAO;

public class CadastroUsuarioActivity extends AppCompatActivity {
        private EditText usuario;
        private EditText senha;
        private EditText conSenha;
        private UsuarioDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);

        usuario = findViewById(R.id.editTextPersonUsername);
        senha = findViewById(R.id.editTextPersonPassword);
        conSenha = findViewById(R.id.editTextPersonConfirmPassword);
        dao = new UsuarioDAO(this);

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

}
