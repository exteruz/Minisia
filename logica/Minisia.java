
package logica;
import java.util.Scanner;
import java.util.Arrays;


import interfaz.Funciones;
import Datos.Profesor;
import Datos.Estudiante;
import Datos.Nota;
import Datos.Curso;
import java.util.*;   

public class Minisia {

    /**
     * @param args the command line arguments
     */
 
    
    public static void main(String[] args) {
       Profesor profesor_uno = new Profesor(0, "profesor generico", "generico", "apellido");
       Profesor profesor_dos = new Profesor(1,"pedro","alexander","pereira");
       Profesor profesor_tres = new Profesor(1,"pedro","alexander","dante");

       Curso calculo = new Curso(0,"calculo","6:00", profesor_dos);
       Curso calculo_diferencial = new Curso(1,"calculo diferencial","lunes: 10:00-12:00", profesor_uno);
       Curso calculo_integral = new Curso(2,"calculo_integral","martes: 8:00-10:00",profesor_tres);              
       Curso calculo_vectorial = new Curso(3,"calculo_vectorial","martes: 8:00-10:00",profesor_uno);

       Curso catedra = new Curso(4,"catedra corrupcion","miercoles: 8:00-10:00",profesor_dos);
       List<Curso> materias = new ArrayList<>(); 
       materias.add(calculo);
       materias.add(calculo_diferencial);
       materias.add(calculo_integral);
       materias.add(catedra);
       materias.add(calculo_vectorial);


       Estudiante[] estudiante_lista = {null,null,null,null,null};
       List<String> usuarios = new ArrayList<>(); 
        for (int i = 0; i < estudiante_lista.length; i++) {
            String[] nombre = {"valentina","samuel","daniel","rafael","alexei"};
            String[] apellido = {"Pereira","rodriguez","martinez","barbosa","sanchez"};
             String usuario = nombre[i].substring(0,2) + apellido[i];
             
             usuarios.add(usuario);
            estudiante_lista[i] =  new Estudiante(i,usuario,apellido[i],nombre[i],"derecho");     
        }
        
       
        
        Scanner lectura = new Scanner(System.in);

       
        System.out.println("Bienvenido al sia");
        System.out.println("Si usted se encuentra registrado  1 si desea registrarse 2 ");

        int registro = lectura.nextInt();
        
        if(registro == 1 ){
            System.out.println("Por favor ingrese su usuario");
            Scanner sc = new Scanner(System.in);

            String registro_usuario = sc.nextLine();
        
            if(usuarios.contains(registro_usuario)){
                int posicion = usuarios.indexOf(registro_usuario);
                Estudiante estudiante_registrado = estudiante_lista[posicion];
                while(true){
                      int menu_eleccion = Funciones.menu_estudiante();
                      switch(menu_eleccion){
                
                    case 1:
                        Funciones.inscribir_materias(estudiante_registrado, materias);
                        break;
                    case 2:
                        System.out.println("usuario: "+ estudiante_registrado.getUsuario());;
                        System.out.println("nombre: "+ estudiante_registrado.getNombre());;
                        System.out.println("apellido: "+ estudiante_registrado.getApellido());;
                        System.out.println("carrera: "+ estudiante_registrado.getCarrera());;
                        
                        break;
                     
                    case 3: 
                        for (int i = 0; i < estudiante_registrado.getCursos().size() ; i++) {
                            System.out.println("materia= "+ estudiante_registrado.getCursos().get(i));
                            
                        }
                        break;
                        
                    case 4:
                        System.out.println("Ha salido del SIA");
                        System.exit(0);
                        break;
                
                
                
                }
                }   
            }else{
                System.out.println("No se encuentra registrado");
                 
            }}else if(registro == 2 ){
                    Estudiante estudiante = Funciones.registrar_estudiante();
            while(true){
                      int menu_eleccion = Funciones.menu_estudiante();
                      switch(menu_eleccion){
                
                    case 1:
                        Funciones.inscribir_materias(estudiante, materias);
                        break;
                    case 2:
                        System.out.println("usuario: "+ estudiante.getUsuario());;
                        System.out.println("nombre: "+ estudiante.getNombre());;
                        System.out.println("apellido: "+ estudiante.getApellido());;
                        System.out.println("carrera: "+ estudiante.getCarrera());;
                        
                        break;
                     
                    case 3: 
                        
                        for (int i = 0; i < estudiante.getCursos().size() ; i++) {
                            System.out.println("materia= "+ estudiante.getCursos().get(i));
                        }
                        break;
                        
                    case 4:
                        System.out.println("Ha salido del SIA");
                        System.exit(0);
                        break;
                
                }              
                }
                           
        }else if(registro == 3){
            
            
        
        
        }
        else if (registro == 4){
        
        }
            
            else{
            System.out.println("No se ha encontrado el numero");
        }
        

        
        


    }
