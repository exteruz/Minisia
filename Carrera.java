package Datos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiante
 */
public class Carrera {
    
    private int id;
    private String nombre;
    private Estudiante[] estudiantes;
    private Curso[] cursos;
    private Profesor[] profesores;

    public Carrera(int id, String nombre, Estudiante[] estudiantes, Curso[] cursos, Profesor[] profesores) {
        this.id = id;
        this.nombre = nombre;
        this.estudiantes = estudiantes;
        this.cursos = cursos;
        this.profesores = profesores;
    }

    public Carrera(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Carrera(int id, String nombre, Estudiante[] estudiantes) {
        this.id = id;
        this.nombre = nombre;
        this.estudiantes = estudiantes;
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

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    public Profesor[] getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }

    @Override
    public String toString() {
        return "Carrera{" + "id=" + id + ", nombre=" + nombre + ", estudiantes=" + estudiantes + ", cursos=" + cursos + ", profesores=" + profesores + '}';
    }

  
    
    

    
    
}
