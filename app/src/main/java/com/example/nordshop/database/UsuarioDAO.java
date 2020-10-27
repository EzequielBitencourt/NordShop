package com.example.nordshop.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.nordshop.Usuario;

public class UsuarioDAO {
    private Conection conection;
    private SQLiteDatabase banco;

    public UsuarioDAO(Context context){
        conection = new Conection(context);
        banco = conection.getWritableDatabase();
    }

    public long inserir(Usuario usuario){
        ContentValues values = new ContentValues();
        values.put("userName",usuario.getUsuario());
        values.put("senha",usuario.getSenha());
       return banco.insert("usuario",null,values);
    }


}
