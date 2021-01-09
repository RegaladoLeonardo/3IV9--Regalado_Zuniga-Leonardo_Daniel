/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypersona;

/**
 *
 * @author levar
 */
import java.util.*;

public class Manipular {
    Scanner entrada=new Scanner(System.in);
    
    Controlador crud= new Controlador();
    
   public void Principal(){
       System.out.println("Bienvenido a la administracion de la empresa patito");
       System.out.println("Por favor elija la opcion deseada");
       System.out.println("1-Mostrar lista de persona");
       System.out.println("2-Registrar una nueva persona");
       System.out.println("3-Editar datos de una perosna");
       System.out.println("4-Borrar registro de una persona");
       System.out.println("5-Salir");
       
       
       int opcion=Integer.parseInt(entrada.nextLine());
       switch(opcion){
       case 1:
           ArrayList<Persona> listaPersonas = crud.mostrarPersonas();
                   
           for(Persona objeto: listaPersonas){
               
               System.out.println("El id: "+ objeto.getId()
                                    + " El nombre: "+ objeto.getEdad()+"\n");
           }
           break;
        
       case 2:
           System.out.println("Ingresa el identificador de la persona: ");
           int idpersona = Integer.parseInt(entrada.nextLine());
           System.out.println("Ingresa el nombre:");
           String nombrepersona = entrada .nextLine();
           System.out.println("Ingresa la edad:");
           int edadpersona = Integer.parseInt(entrada.nextLine());
           
           Persona personaNueva = new Persona(idpersona, nombrepersona, edadpersona);
           
           crud.registrarPersona(personaNueva);
           
        break;
        
       case 3:
           break;
         
       case 4:
           break;
           
       default:
           break;
        
   }
   }
}
