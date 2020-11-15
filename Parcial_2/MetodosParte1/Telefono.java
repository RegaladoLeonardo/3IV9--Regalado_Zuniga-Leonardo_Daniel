import java.util.Scanner;

public class Telefono{
              String a="si", b =" " ;
              public int  credito ;
              public double saldo ;
              public long numCelular ;
              public int caso , caso1  ;
              public double localesNacionales=0.5 , localesInternacionales=0.6, celulares=0.2;
              Scanner entrada = new Scanner(System.in);

              public void directorio(){
                            System.out.println("¡Bienvenido!");
                            System.out.println("Ingresa tu numero de celular");
                            numCelular = entrada.nextLong();
                            System.out.println("Ingresa tu numero de credito");
                            credito = entrada.nextInt();
                            saldo = credito ;
              
                            do{ 
                                          System.out.println("Que desas hacer?");
                                          System.out.println("1-Realzar una llamada");
                                          System.out.println("2-Consultar credito");
                                          System.out.println("3-Regresar");
                                          caso = entrada.nextInt();
                                          
                                          switch(caso){
                                                        case 1:
                                                                      do{
                                                                                    System.out.println("¿Que tipo de llamada va a realiza?");
                                                                                    System.out.println("1-LocalNacional");
                                                                                    System.out.println("2-LocalInternacional");
                                                                                    System.out.println("3-celular");
                                                                                    System.out.println("4-Regresar");
                                                                                    caso1 = entrada.nextInt();
                                                                                    if(this.saldo> 0){
                                                                                                  switch(caso1){
                                                                                                                case 1:
                                                                                                                              this.saldo = this.saldo - this.localesNacionales ;
                                                                                                                              
                                                                                                                              break;
                                                                                                                case 2:
                                                                                                                              this.saldo = this.saldo - this.localesInternacionales ;
                                                                                                                              break;
                                                                                                                case 3:
                                                                                                                              this.saldo = this.saldo - this.celulares ;
                                                                                                                              break;
                                                                                                  }
                                                                                    }else{
                                                                                                  System.out.println("Upppps! ya no tienes credito T_T ");
                                                                                                  System.out.println("----------------");
                                                                                                  caso1 = 4 ;
                                                                                    }

                                                                      }while(caso1 != 4 );

                                                                      break;

                                                        case 2:
                                                                      Consulta();
                                                                      break;
                                          }
                            }while(caso != 3);
              }
              

              public void Consulta(){
                            
                            System.out.println("Tu credito es de: " + this.saldo);
                            
              }
}