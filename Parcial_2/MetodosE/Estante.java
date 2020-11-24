import java.util.Scanner;

public class Estante{
              Scanner entrada = new Scanner(System.in);
              private String[] Libro = new String[3];
              private String[] AuNombre = new String[3];
              private int[] Existente = new int[3];
              private int[] NoExistentes = new int[3];
              
              public Estante(){

                            Biblioteca var1 = new Biblioteca();
                            this.Libro=var1.getTitulo();
                            
                            Biblioteca var2 = new Biblioteca();
                            this.AuNombre=var2.getAutor();
                            
                            Biblioteca var3 = new Biblioteca();
                            this.Existente=var3.getEjemplares();

                            Biblioteca var4 = new Biblioteca();
                            this.NoExistentes=var4.getEjemplaresPre();
              }
              
              public void   IntercambioLibro(int a){
                            this.Libro[0]= "IT";
                            this.Libro[1]= "1984";
                            this.Libro[2]= "UNDER THE DOME";
                            
                            this.AuNombre[0]="STEPHEN KING";
                            this.AuNombre[1]="GEORGE ORWELL";
                            this.AuNombre[2]="STEPHEN KING";

                            this.Existente[0]=3;
                            this.Existente[1]=5;
                            this.Existente[2]=1;

                            this.NoExistentes[0]=0;
                            this.NoExistentes[1]=0;
                            this.NoExistentes[2]=0;

                            int cual;
                            switch (a) {
                                                        case 1:
                                                                      try{ 
                                                                                    do{ 
                                                                                                  System.out.println("Escriba el indice del libro se quiere llevar?");
                                                                                                  
                                                                                                  for(int i=0 ; i<3 ; i++){
                                                                                                                int b=i+1;
                                                                                                                System.out.println(b+"-"+this.Libro[i]+" de "+this.AuNombre[i]);
                                                                                                  }
                                                                                                  System.out.println("4-Consultar ejemplares");
                                                                                                  System.out.println("5-Regresar");
                                                                                                  
                                                                                                                cual = entrada.nextInt();

                                                                                                                switch (cual) {
                                                                                                                              case 1:
                                                                                                                                            if(Existente[0]>0){  
                                                                                                                                                          NoExistentes[0]= NoExistentes[0]+1 ;
                                                                                                                                                          Existente[0]=Existente[0]-1;
                                                                                                                                            }else{
                                                                                                                                                          System.out.println("Upps!!, ya no hay libros de este ejemplara!");
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                              case 2:
                                                                                                                                            if(Existente[1]>0){  
                                                                                                                                                          NoExistentes[1]= NoExistentes[1]+1 ;
                                                                                                                                                          Existente[1]=Existente[1]-1;
                                                                                                                                            }else{
                                                                                                                                                          System.out.println("Upps!!, ya no hay libros de este ejemplara!");
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                              case 3:
                                                                                                                                            if(Existente[2]>0){  
                                                                                                                                                          NoExistentes[2]= NoExistentes[2]+1 ;
                                                                                                                                                          Existente[2]=Existente[2]-1;
                                                                                                                                            }else{
                                                                                                                                                          System.out.println("Upps!!, ya no hay libros de este ejemplara!");
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                              case 4:
                                                                                                                                            for(int i=0; i<3 ; i++){
                                                                                                                                                          System.out.println("Hay "+NoExistentes[i]+" libros prestados del libro "+ AuNombre[i]+" y "+Existente[i]+" disponibles");
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                              case 5:
                                                                                                                                            cual = 5 ;
                                                                                                                                            break;
                                                                                                                
                                                                                                                              default:
                                                                                                                                            break;
                                                                                                                }
                                                                                    }while(cual!=5);
                                                                      
                                                                      }catch(Exception e){
                                                                                    System.out.println("Ingrese un numero valido!!");
                                                                      }
                                                                                    break;
                                                        case 2:
                                                                      try{ 
                                                                                    do{ 
                                                                                    System.out.println("Que libro va a devolover?");
                                                                                    System.out.println("1-IT");
                                                                                    System.out.println("2-1984");
                                                                                    System.out.println("3-UNDER THE DOME");
                                                                                    System.out.println("4-Regresar");
                                                                                    cual = entrada.nextInt();

                                                                                                  switch (cual) {
                                                                                                                case 1:
                                                                                                                              if(NoExistentes[0]>0){  
                                                                                                                                            Existente[0]= Existente[0]+1 ;
                                                                                                                                            NoExistentes[0]= NoExistentes[0]-1 ;
                                                                                                                              }else{
                                                                                                                                            System.out.println("No se han prestado libros de este ejemplar!");
                                                                                                                              }
                                                                                                                              break;
                                                                                                                case 2:
                                                                                                                              if(NoExistentes[1]>0){  
                                                                                                                                            Existente[1]= Existente[1]+1 ;
                                                                                                                                            NoExistentes[1]= NoExistentes[1]-1 ;
                                                                                                                              }else{
                                                                                                                                            System.out.println("No se han prestado libros de este ejemplar!");
                                                                                                                              }
                                                                                                                              break;
                                                                                                                case 3:
                                                                                                                              if(NoExistentes[2]>0){  
                                                                                                                                            Existente[2]= Existente[2]+1 ;
                                                                                                                                            NoExistentes[2]= NoExistentes[2]-1 ;
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
                                                                                    System.exit(0);
                                                                      }catch(Exception e){
                                                                                    System.out.println("Ingrese un numero valido!!");
                                                                      }
                                                                      break;
                                                        default:
                                                                      break;
                                          }
              }
}