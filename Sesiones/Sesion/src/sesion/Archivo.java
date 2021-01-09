
package sesion;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Archivo {
    
    ArrayList<Usuarios> listaUsuarios = new ArrayList();
    Usuarios usuario = new Usuarios();
    
    public void leer() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream users = new FileInputStream("users.dat");
        ObjectInputStream entrada = new ObjectInputStream(users);
        listaUsuarios = (ArrayList)entrada.readObject();
        entrada.close();
    }
    
    public void registrarUsuario(String nombre, String apellido, String id, String contra) throws FileNotFoundException, IOException, ClassNotFoundException{
        try{
            leer();
        }catch (IOException | ClassNotFoundException e){
            
        }
        usuario = new Usuarios(nombre,apellido,contra,id);
        listaUsuarios.add(usuario);
        FileOutputStream users = new FileOutputStream("users.dat");
        ObjectOutputStream salida = new ObjectOutputStream(users);
        salida.writeObject(listaUsuarios);
        salida.close();
        
    }
    
    public boolean iniciarSesion(String usuario, String contra) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream users = new FileInputStream("users.dat");
        ObjectInputStream entrada = new ObjectInputStream(users);
        listaUsuarios = (ArrayList)entrada.readObject();
        boolean x = false;
        
        for(int i=0; i<listaUsuarios.size();i++){
            Usuarios obj = (Usuarios)listaUsuarios.get(i);
            String u = obj.getId();
            String c = obj.getContra();
            if(usuario.equals(u)&&contra.equals(c)){
                System.out.println(obj.getId());
                x = true;
            }
        }
        return x;
    }
}
