package com.example.nordshop;

import com.example.nordshop.exception.IncorrectPasswordException;
import com.example.nordshop.exception.UserNotFoundException;

import java.util.HashMap;

public class Login {
    private static final Usuario USUARIO_NAO_ENCONTRADO = null;

    private static HashMap<String, Usuario> usuarios = new HashMap<>();

    static {
        Usuario admin = new Usuario("admin", "admin");

        usuarios.put(admin.getUsuario(), admin);
    }

    public static Usuario entrar(String usuario, String senha) throws UserNotFoundException, IncorrectPasswordException {
        Usuario usuarioBuscado = usuarios.get(usuario);

        if(usuarioBuscado == USUARIO_NAO_ENCONTRADO) throw new UserNotFoundException();

        if(!usuarioBuscado.getSenha().equals(senha)) throw new IncorrectPasswordException();

        return usuarioBuscado;
    }
}
