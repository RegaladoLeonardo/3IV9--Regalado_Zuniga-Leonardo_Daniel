import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Edad{
              public String dia ;
              public String mes; 
              public String anio;
              public String fecha;
              public String c = "/" ;
              Scanner entrada = new Scanner(System.in);

              public String lectorFechita(){
                            c = "/" ;
                            System.out.println("Ecribe tus datos con la siguiente nomencaltura (dd/MM/yyyy)");
                            System.out.println("Escribe tu dia de nacimiento");
                            dia = entrada.nextLine();
                            System.out.println("Escribe tu mes de nacimiento");
                            mes = entrada.nextLine();
                            System.out.println("Escribe tu anio de nacimiento");
                            anio = entrada.nextLine();
                            fecha=  dia +c+ mes +c+ anio;

                            return fecha ;
              }

              public void calculinFecha(String a){
                            a = lectorFechita();
                            DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                            LocalDate nacimiento = LocalDate.parse(a, forma);
                            LocalDate ahora = LocalDate.now();
                            
                            Period periodo = Period.between(nacimiento, ahora);
                            System.out.printf("Tu edad es: %s anios, %s meses y %s dias",
                            periodo.getYears(), periodo.getMonths(), periodo.getDays());

              }
}