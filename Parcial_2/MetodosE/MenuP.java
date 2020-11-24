import java.util.Scanner;

public class MenuP{
              
              public static void main(String[] args){
                            Scanner entrada = new Scanner(System.in);
                            int option=0;
                            String a = "si", b;
                            try{ 
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
                                                                                    Empleado CalSueldo= new Empleado();
                                                                                    CalSueldo.MiSalario();
                                                                                    
                                                                                    break;
                                                                      case 2:
                                                                                    Puesto compra = new Puesto();
                                                                                    compra.Local();
                                                                                    break;
                                                                      case 3:
                                                                                    Biblioteca local= new Biblioteca();
                                                                                    local.MiMenu();
                                                                                    break;
                                                                      case 4:
                                                                                    option=4;
                                                                                    break;
                                                                      default:
                                                                                    break;
                                                        }
                                          }while(option != 4);
                                          System.exit(0);
                            }catch(Exception e){
                                          System.out.println("Selecciona una opcion valida la proxima vez!");
                            }

              }
}