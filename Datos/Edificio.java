package Datos;


import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiante
 */
public class Edificio {
    private int id;
    private String nombre;

    public Edificio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Edificio(int id) {
        this.id = id;
    }

    public Edificio(String nombre) {
        this.nombre = nombre;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Edificio{" + "id=" + id + ", nombre=" + nombre + '}';
    }
