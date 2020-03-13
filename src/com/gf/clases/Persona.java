/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.clases;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author cissanal
 */
public class Persona {
    private String nombre;
    private String apellidos;
    List <String> telefonos = new LinkedList<>();
    private boolean favorito;

    public Persona(String nombre, String apellidos, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.favorito = false;
        telefonos.add(telefono); //comprobar que el telefono no existe
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public List<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<String> telefonos) {
        this.telefonos = telefonos;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", telefonos=" + telefonos + ", favorito=" + favorito + '}';
    }
    
    
    
    
    
    
}























