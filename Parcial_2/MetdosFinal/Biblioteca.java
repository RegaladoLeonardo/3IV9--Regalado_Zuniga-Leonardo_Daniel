import java.util.Scanner;

public class Biblioteca{
              Scanner entrada = new Scanner(System.in);
              private String[] Titulo = new String[3];
              private String[] Autor = new String[3];
              private int[] Ejemplares = new int[3];
              private int[] EjemplaresPre = new int[3];

              public void setMisLibros(String[] Titulo, String[] Autor, int[] Ejemplares, int[] EjemplaresPre){
                            this.Titulo= Titulo ;
                            this.Autor= Autor ;
                            this.Ejemplares= Ejemplares ;
                            this.EjemplaresPre= EjemplaresPre ;
              }
              
              public String[] getTitulo(){
                            return Titulo;
              }
              public String[] getAutor(){
                            return Autor;
              }
              public int[] getEjemplares(){
                            return Ejemplares;
              }
              public int[] getEjemplaresPre(){
                            return EjemplaresPre;
              }

              public void MiMenu(){

                            Estante coleccion = new Estante();

                            coleccion.MiEstante();
              }

}