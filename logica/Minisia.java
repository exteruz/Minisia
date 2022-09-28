
package logica;
import java.util.Scanner;

import interfaz.Funciones;
import Datos.Profesor;
import Datos.Estudiante;
import Datos.Nota;

public class Minisia {

    /**
     * @param args the command line arguments
     */
 
    
    public static void main(String[] args) {
       Estudiante[] estudiante_lista = {null,null,null,null,null};
        for (int i = 0; i < estudiante_lista.length; i++) {
            String[] nombre = {"valentina","samuel","daniel","rafael","alexei"};
            String[] apellido = {"Pereira","rodriguez","martinez","barbosa","sanchez"};
             String usuario = nombre[i].substring(0,2) + apellido;
            estudiante_lista[i] =  new Estudiante(i,nombre[i],apellido[i],usuario,"derecho");     
        }
        
        for (int i = 0; i < estudiante_lista.length; i++) {
            System.out.println(estudiante_lista[i]);            
            
        }
        
        Scanner lectura = new Scanner(System.in);

       
        System.out.println("Bienvenido al sia");
        System.out.println("Si usted se encuentra registrado  1 si desea registrarse 2");
        int registro = lectura.nextInt();
        
        if(registro == 1 ){
            System.out.println("Por favor ingrese su usuario");
            String prueba = lectura.nextLine();
            String registro_usuario = lectura.nextLine();
        
            

         

            
            if(Funciones.comprobar_usuario(registro_usuario, estudiante_lista)){
                Funciones.menu_estudiante();
            
            }else{
                System.out.println("No se encuentra registrado");
                
            
            
            
 
            
        
            }}else if(registro == 2 ){
                    Estudiante estudiante = Funciones.registrar_estudiante();
                    System.out.println(estudiante.toString());
                    

        
        }else{
            System.out.println("No se ha encontrado el numero");
        }
        

        
        


    }
    
}
