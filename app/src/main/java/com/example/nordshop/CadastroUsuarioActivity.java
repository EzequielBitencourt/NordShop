package com.example.nordshop;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.example.nordshop.database.UsuarioDAO;

public class CadastroUsuarioActivity extends AppCompatActivity {
        private EditText usuario;
        private EditText senha;
        private UsuarioDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);

        usuario = findViewById(R.id.editTextPersonUsername);
        senha = findViewById(R.id.editTextPersonPassword);
        dao = new UsuarioDAO(this);
    }

    public void salvar(View view){
        Usuario u = new Usuario();
        u.setUsuario(usuario.getText().toString());
        u.setSenha(senha.getText().toString());
        long id = dao.inserir(u);
        Toast.makeText(this,"Usuario inserido com id: "+id,Toast.LENGTH_SHORT).show();
    }
}
