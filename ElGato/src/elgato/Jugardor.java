/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgato;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author levar
 */
public class Jugardor {
    
    private String nombre ;
    private int edad;
    private int puntaje;

    public Jugardor(String nombre, int edad, int puntaje, ArrayList<Registrar> listaJ) {
        this.nombre = nombre;
        this.edad = edad;
        this.puntaje = puntaje;
        this.listaJ = listaJ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public ArrayList<Registrar> getListaJ() {
        return listaJ;
    }

    public void setListaJ(ArrayList<Registrar> listaJ) {
        this.listaJ = listaJ;
    }
    
    
    
    private ArrayList<Registrar> listaJ;
    
    public void Jugador(){
      
    }
    
    public void AgregarJugador(){
        
        Registrar jugador = new Registrar();
        
            jugador.DatosJugador1();
            jugador.getX();
            listaJ.add(jugador);
            
            jugador.DatosJugador2();
            jugador.getY();
            listaJ.add(jugador);
       
    }
    
    public void Tabla(){
        
    }
    
     
    public void BorrarJugador(int a){
        
        try {
            listaJ.remove(a);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Porfavor escoja una tarea");
        }
    }
    
    public void ModificarJugador(String Option, int lugar){
        Registrar aux;
        aux = listaJ.get(lugar);
        
        try{
            
            switch(Option){
                case "Nombre":
                    //if((lugar mod 2)==0{
                    
                //}
                        nombre1 = JOptionPane.showInputDialog("Escriba el nuevo nombre del jugador");
                        aux.setName();
                    break;
                case "Edad":
                       edad = JOptionPane.showInputDialog("Escriba la nueva edad del jugador");
                    break;
                
        }
            
        }catch(Exception e){
            
        }
    }
   
}
