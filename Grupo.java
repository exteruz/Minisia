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
public class Grupo {
    private int id;
    private String nombre;
    private Date dias;
    private String semestre;
    private Curso curso;
    private Edificio salon;
    private Profesor profesor;
    private Carrera carrera;
    private Estudiante[] estudiantes;

    public Grupo(int id, String nombre, Date dias, String semestre, Curso curso, Edificio salon, Profesor profesor, Carrera carrera, Estudiante[] estudiantes) {
        this.id = id;
        this.nombre = nombre;
        this.dias = dias;
        this.semestre = semestre;
        this.curso = curso;
        this.salon = salon;
        this.profesor = profesor;
        this.carrera = carrera;
        this.estudiantes = estudiantes;
    }

    public Grupo(int id, String nombre, Date dias, String semestre) {
        this.id = id;
        this.nombre = nombre;
        this.dias = dias;
        this.semestre = semestre;
    }

    public Grupo(int id, String nombre) {
        this.id = id;
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

    public Date getDias() {
        return dias;
    }

    public void setDias(Date dias) {
        this.dias = dias;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Edificio getSalon() {
        return salon;
    }

    public void setSalon(Edificio salon) {
        this.salon = salon;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Grupo{" + "id=" + id + ", nombre=" + nombre + ", dias=" + dias + ", semestre=" + semestre + ", curso=" + curso + ", salon=" + salon + ", profesor=" + profesor + ", carrera=" + carrera + ", estudiantes=" + estudiantes + '}';
    }
   
    
}
