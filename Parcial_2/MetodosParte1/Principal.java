import java.util.Scanner;

public class Principal{
              
              public static void main(String[] args){
                            Scanner entrada = new Scanner(System.in);
                            int option;
                            String a = "si", b;
                            do{
                                          System.out.println("");
                                          System.out.println("---------------------");
                                          System.out.println("Elija uno de los 3 programas");
                                          System.out.println("1-Calcular edad");
                                          System.out.println("2-Menu de figuras");
                                          System.out.println("3-Costo de total de llamdas ");
                                          System.out.println("4-Salir *_*"); 
                                          System.out.println("---------------------");
                                          option = entrada.nextInt();
                                          
                                          switch (option) {
                                                        case 1:
                                                                                    Edad fecha = new Edad();
                                                                                    fecha.calculinFecha("");
                                                                      
                                                                      break;
                                                        case 2:
                                                                                    Figuras formas = new Figuras();
                                                                                    formas.menu();
                                                                      break;
                                                        case 3:
                                                                      Telefono llamadas = new Telefono();
                                                                      llamadas.directorio();
                                                                      break;
                                                        default:
                                                                      break;
                                          }
                            }while(option != 4);
              }
}