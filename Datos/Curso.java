package Datos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiante
 */
public class Curso {
    private int id;
    private String nombre;
    private Grupo[] grupos;
    private Carrera[] carreras;

    public Curso(int id, String nombre, Grupo[] grupos, Carrera[] carreras) {
        this.id = id;
        this.nombre = nombre;
        this.grupos = grupos;
        this.carreras = carreras;
    }

    public Curso(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Curso(int id, String nombre, Carrera[] carreras) {
        this.id = id;
        this.nombre = nombre;
        this.carreras = carreras;
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

    public Grupo[] getGrupos() {
        return grupos;
    }

    public void setGrupos(Grupo[] grupos) {
        this.grupos = grupos;
    }

    public Carrera[] getCarreras() {
        return carreras;
    }

    public void setCarreras(Carrera[] carreras) {
        this.carreras = carreras;
    }

    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", nombre=" + nombre + ", grupos=" + grupos + ", carreras=" + carreras + '}';
    }
    
    
    
}
