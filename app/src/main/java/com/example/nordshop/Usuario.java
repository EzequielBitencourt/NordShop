package com.example.nordshop;

import java.io.Serializable;

public class Usuario implements Serializable {


    private String usuario;

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    private String senha;

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }


}


