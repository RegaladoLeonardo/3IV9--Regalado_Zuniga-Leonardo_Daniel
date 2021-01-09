
package sesion;

import java.io.*;

public class Usuarios implements Serializable {
    
    private String nombre;
    private String apellido;
    private String contra;
    private String id;

    public Usuarios(){
        
    }
    
    public Usuarios(String nombre, String apellido, String contra, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contra = contra;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
