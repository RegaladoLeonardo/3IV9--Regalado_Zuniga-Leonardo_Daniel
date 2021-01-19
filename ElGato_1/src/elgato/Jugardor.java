 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgato;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

/**
 *
 * @author levar
 */
public class Jugardor {
    private ArrayList<Registrar> listaJ = new ArrayList<Registrar>();
    
    public void Jugador(){
      
    }
    
    public void AgregarJugador(){
        
        Registrar jugador = new Registrar();
        
            jugador.DatosJugador1();
            jugador.getX();
            listaJ.add(jugador);
            
            jugador.DatosJugador2();
            jugador.getX();
            listaJ.add(jugador);
       
    }
    
    public void Tabla(){
        
    }
    
     
    public void BorrarJugador(int a){
        
        try {
            listaJ.remove(a);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Porfavor lea las instrucciones");
        }
    }
    
    public void ModificarJugador(String Option, int lugar){
        Registrar aux;
        aux = listaJ.get(lugar);
        
        try{
            
            switch(Option){
                case "Nombre":
                  
                       aux.setNombre(showInputDialog(null, "Escriba el nuevo nombre del jugador"));
                    break;
                case "Edad":
                        aux.setEdad (Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la nueva edad del jugador")));
                        
                    break;
                default:
                    break;
                }  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Porfavor lea las instrucciones");
        }
    }
   
}
