import java.util.Scanner;
public class LecSueldo{
              Scanner entrada = new Scanner(System.in);
              private long IdEmpleado= 2020060346 ;
              private String NombreEmpleado ;
              private String Puesto = "Administrador" ;
              private int SueldoQuincenal[] ;

              public void ValorEmpleado(){

                            System.out.println("¡Escriba su ID de empleado!");
                            long IdEmpleado1 = entrada.nextLong();
                            System.out.println("¿Que puesto ocupa?");
                            String Puesto1=  entrada.nextLine();

                            // son iguales
                            if (Puesto.equalsIgnoreCase(Puesto1)) {
                                          if(IdEmpleado == IdEmpleado1){
                                                        System.out.println("UWU");
                                          }
                            }
                            //Lo de arriba inmediato va en una clase aparte
              }
}