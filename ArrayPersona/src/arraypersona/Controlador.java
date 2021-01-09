
package arraypersona;

/**
 *
 * @author levar
 */
import java.util.*;

public class Controlador {
    
    public static ArrayList<Persona> listaPersona = new ArrayList<Persona>();
    
    //metodo para mostrar a  todas las persona
    
    public ArrayList<Persona> mostrarPersonas(){
        return listaPersona;
    }
    
    public static void registrarPersona(Persona p){
        listaPersona.add(p);
    }
    
    public static Persona buscarPersona( int id){
        Persona encontrada= new Persona();
        //recorre la lista de personas hasta que termine
        for(Persona p : listaPersona){
            if(id==p.getId()){
                encontrada=p;
            }else{
                System.out.println("Persona no encontrada, registro ivalido!");
            }
        }
        return encontrada;
    }
    
    public static void actualizarPersona(Persona personaActualizada){
        Persona PersonaActualizar = buscarPersona(personaActualizada.getId());
        listaPersona.remove(PersonaActualizar);
        listaPersona.add(personaActualizada);
    }
    
    public static void eliminarPersona(Persona EliminarPersona){
        listaPersona.remove(EliminarPersona);
    }
}
    