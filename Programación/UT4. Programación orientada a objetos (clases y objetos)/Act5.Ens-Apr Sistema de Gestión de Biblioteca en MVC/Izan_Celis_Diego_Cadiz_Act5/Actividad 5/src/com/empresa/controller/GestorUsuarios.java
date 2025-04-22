package com.empresa.controller;

import java.util.ArrayList; // Importamos la clase ArrayList

import com.empresa.model.Libro; // Importamos la clase Libro
import com.empresa.model.Usuario; // Importamos la clase Usuario

public class GestorUsuarios {
    // Atributos ------------------------------
    private ArrayList<Usuario> listaUsuarios;
    // ----------------------------------------

    // Constructor --------------
    public GestorUsuarios() {
        this.listaUsuarios = new ArrayList<>();
    }
    // --------------------------------------------

    // Métodos ------------------------------------------
    // Método para añadir usuario
    public void añadirUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    // Método para comprobar si un usuario tiene un libro prestado
    public boolean tieneLibroPrestado(Usuario usuario, Libro libro) {
        return usuario.getListaLibrosPrestados().contains(libro);
    }

    // Método para buscar usuario por nombre
    public Usuario buscarUsuarioNombre(String nombre) {
        Usuario usuarioEncontrado = null;
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombre().equalsIgnoreCase(nombre)) { // Comparamos el nombre
                usuarioEncontrado = usuario;
                return usuarioEncontrado;
            }
        }
        return usuarioEncontrado;
    }
    // ---------------------------------------------------------------------------

    // Getters -----------------------------------------
    public ArrayList<Usuario> getListaUsuarios() {
        return this.listaUsuarios;
    }
    // ------------------------------------------------
}
