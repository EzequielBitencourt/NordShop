package com.example.nordshop;

import java.io.Serializable;

public class Usuario implements Serializable {


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    private String usuario;
    private String senha;

    /*public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }*/


}


