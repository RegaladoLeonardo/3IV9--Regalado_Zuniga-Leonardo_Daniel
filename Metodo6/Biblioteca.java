import java.util.Scanner;

class Biblioteca{
              Scanner entrada = new Scanner(System.in);
              String[] Titulo = new String[3];
              String[] Autor = new String[3];
              int[] Ejemplares = new int[3];
              int[] EjemplaresPre = new int[3];

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

                            Estante coleccion= new Estante();
                            int a , cual;
                            try{
                                          do{  
                                                        System.out.println("----------");
                                                        System.out.println("Bienvenid0!!");
                                                        System.out.println("Que desas hacer?");
                                                        System.out.println("1-Pedir un libro");
                                                        System.out.println("2-Devolver un libro");
                                                        System.out.println("3-Salir al menu principal");
                                                        System.out.println("----------");
                                                        a=entrada.nextInt();
                                                        
                                                        coleccion.IntercambioLibro(a);
                                          }while(a!=3);
                                          
                            }catch(Exception e){
                                          System.out.println("Ingrese un numero valido!!");
                            }
              }
}
