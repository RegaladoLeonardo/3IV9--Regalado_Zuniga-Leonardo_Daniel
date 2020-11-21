import java.util.Scanner;

public class MenuP{
              
              public static void main(String[] args){
                            Scanner entrada = new Scanner(System.in);
                            int option;
                            String a = "si", b;
                            do{
                                          System.out.println("");
                                          System.out.println("---------------------");
                                          System.out.println("1-CALCULAR EL SUELDO DE UN EMPLEADO");
                                          System.out.println("2-COMPRAR PRODUCTOS");
                                          System.out.println("3-MINI BIBLIOTECA");
                                          System.out.println("4-Salir *_*"); 
                                          System.out.println("---------------------");
                                          option = entrada.nextInt();
                                          
                                          switch (option) {
                                                        case 1:
                                                                      LecSueldo aver = new LecSueldo();
                                                                      aver.ValorEmpleado();
                                                                      
                                                                      break;
                                                        case 2:
                                                                      //Figuras formas = new Figuras();
                                                                      //formas.menu();
                                                                      break;
                                                        case 3:
                                                                      Biblioteca local= new Biblioteca();
                                                                      local.MiMenu();
                                                                      break;
                                                        default:
                                                                      break;
                                          }
                            }while(option != 4);
              }
}