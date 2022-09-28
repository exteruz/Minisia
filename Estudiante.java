package Datos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiante
 */

import java.util.Date;

public class Estudiante extends Datos.Usuario {
  
    private String carrera;
    private Profesor[] profesores;
    private Nota[] notas;
    private Grupo[] grupos;

    

    public Estudiante( int id, String usuario, String nombre, String apellido,String carrera) {
        super(id, usuario, nombre, apellido);
        this.carrera = carrera;
   
    }

    public Estudiante(String carrera, Profesor[] profesores, Nota[] notas, Grupo[] grupos, int id, String usuario, String nombre, String apellido, Date fecha_nacimiento, String correo) {
        super(id, usuario, nombre, apellido, fecha_nacimiento, correo);
        this.carrera = carrera;
        this.profesores = profesores;
        this.notas = notas;
        this.grupos = grupos;
    }

    public Estudiante(Nota[] notas, int id, String usuario, String nombre, String apellido) {
        super(id, usuario, nombre, apellido);
        this.notas = notas;
    }
    
     

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Profesor[] getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }

    public Nota[] getNotas() {
        return notas;
    }

    public void setNotas(Nota[] notas) {
        this.notas = notas;
    }

    public Grupo[] getGrupos() {
        return grupos;
    }

    public void setGrupos(Grupo[] grupos) {
        this.grupos = grupos;
    }
    
    
     public void inscribir(){
        System.out.println("No hay fechas de inscripciones para profesores");
    };

    @Override
    public String toString() {
        return super.toString() + "Estudiante{" + "carrera=" + carrera + ", profesores=" + profesores + ", notas=" + notas + ", grupos=" + grupos + '}';
    }
     
    
   



    
    
}
