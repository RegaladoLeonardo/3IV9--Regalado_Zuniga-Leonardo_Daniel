import java.util.Scanner;

class Libro{

              public static void main(String[] args){
                            Scanner entrada = new Scanner(System.in);
                            String[] Titulo = new String[3];
                            String[] Autor = new String[3];
                            int[] Ejemplares = new int[3];
                            int[] EjemplaresPre = new int[3]; 

                            Titulo[0]= "IT";
                            Titulo[1]= "1984";
                            Titulo[2]= "UNDER THE DOME";

                            Autor[0]="STEPHEN KING";
                            Autor[1]="GEORGE ORWELL";
                            Autor[2]="STEPHEN KING";

                            Ejemplares[0]=3;
                            Ejemplares[1]=5;
                            Ejemplares[2]=1;

                            EjemplaresPre[0]=0;
                            EjemplaresPre[1]=0;
                            EjemplaresPre[2]=0;

                            int a , cual;
                            do{  
                                          System.out.println("----------");
                                          System.out.println("Bienvenid0!!");
                                          System.out.println("Que desas hacer?");
                                          System.out.println("1-Pedir un libro");
                                          System.out.println("2-Devolver un libro");
                                          System.out.println("3-Salir al menu");
                                          System.out.println("----------");
                                          a=entrada.nextInt();

                                          switch (a) {
                                                        case 1:
                                                                      do{ 
                                                                                    System.out.println("Escriba el indice del libro se quiere llevar?");
                                                                                    for(int i=0 ; i<3 ; i++){
                                                                                                  int b=i+1;
                                                                                                  System.out.println(b+"-"+Titulo[i]+" de "+Autor[i]);
                                                                                    }
                                                                                    System.out.println("Consultar ejemplares");
                                                                                    System.out.println("5-Regresar");
                                                                                    cual = entrada.nextInt();

                                                                                    switch (cual) {
                                                                                                  case 1:
                                                                                                                if(Ejemplares[0]>0){  
                                                                                                                              EjemplaresPre[0]= EjemplaresPre[0]+1 ;
                                                                                                                              Ejemplares[0]=Ejemplares[0]-1;
                                                                                                                }else{
                                                                                                                              System.out.println("Upps!!, ya no hay libros de este ejemplara!");
                                                                                                                }
                                                                                                                break;
                                                                                                  case 2:
                                                                                                                if(Ejemplares[1]>0){  
                                                                                                                              EjemplaresPre[1]= EjemplaresPre[1]+1 ;
                                                                                                                              Ejemplares[1]=Ejemplares[1]-1;
                                                                                                                }else{
                                                                                                                              System.out.println("Upps!!, ya no hay libros de este ejemplara!");
                                                                                                                }
                                                                                                                break;
                                                                                                  case 3:
                                                                                                                if(Ejemplares[2]>0){  
                                                                                                                              EjemplaresPre[2]= EjemplaresPre[2]+1 ;
                                                                                                                              Ejemplares[2]=Ejemplares[2]-1;
                                                                                                                }else{
                                                                                                                              System.out.println("Upps!!, ya no hay libros de este ejemplara!");
                                                                                                                }
                                                                                                                break;
                                                                                                  case 4:
                                                                                                                for(int i=0; i<3 ; i++){
                                                                                                                              System.out.println("Hay "+EjemplaresPre[i]+" libros prestados del libro "+ Titulo[i]+" y "+Ejemplares[i]+" disponibles");
                                                                                                                }
                                                                                                                break;
                                                                                                  case 5:
                                                                                                                cual = 5 ;
                                                                                                                break;
                                                                                    
                                                                                                  default:
                                                                                                                break;
                                                                                    }
                                                                      }while(cual!=5);
                                                                      break;
                                                        case 2:
                                                                      do{ 
                                                                      System.out.println("Que libro va a devolover?");
                                                                      System.out.println("1-IT");
                                                                      System.out.println("2-1984");
                                                                      System.out.println("2-UNDER THE DOME");
                                                                      System.out.println("4-Regresar");
                                                                      cual = entrada.nextInt();

                                                                                    switch (cual) {
                                                                                                  case 1:
                                                                                                                if(EjemplaresPre[0]>0){  
                                                                                                                              Ejemplares[0]= Ejemplares[0]+1 ;
                                                                                                                              EjemplaresPre[0]= EjemplaresPre[0]-1 ;
                                                                                                                }else{
                                                                                                                              System.out.println("No se han prestado libros de este ejemplar!");
                                                                                                                }
                                                                                                                break;
                                                                                                  case 2:
                                                                                                                if(EjemplaresPre[1]>0){  
                                                                                                                              Ejemplares[1]= Ejemplares[1]+1 ;
                                                                                                                              EjemplaresPre[1]= EjemplaresPre[1]-1 ;
                                                                                                                }else{
                                                                                                                              System.out.println("No se han prestado libros de este ejemplar!");
                                                                                                                }
                                                                                                                break;
                                                                                                  case 3:
                                                                                                                if(EjemplaresPre[2]>0){  
                                                                                                                              Ejemplares[2]= Ejemplares[2]+1 ;
                                                                                                                              EjemplaresPre[2]= EjemplaresPre[2]-1 ;
                                                                                                                }else{
                                                                                                                              System.out.println("No se han prestado libros de este ejemplar!");
                                                                                                                }
                                                                                                                break;
                                                                                                  case 4:
                                                                                                                cual = 4 ;
                                                                                                                break;
                                                                                    
                                                                                                  default:
                                                                                                                break;
                                                                                    }
                                                                      }while(cual!=4);
                                                                      break;

                                                        default:
                                                                      break;
                                          }
                            }while(a!=3);
              }
}