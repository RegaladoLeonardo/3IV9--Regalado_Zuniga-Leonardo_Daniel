import java.util.Scanner;

class q{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int IdEmpleado= 2020060346 ;
        String NombreEmpleado ;
        String Puesto = "Gerente" ;
        double[] SueldoQuincenal=new double[4];
        
        System.out.println("Que puesto ocupa?");
        String Puesto1=  entrada.nextLine();
        System.out.println("¡Escriba su ID de empleado!");
        long IdEmpleado1 = entrada.nextInt();
        
        // son iguales
        if (Puesto.equalsIgnoreCase(Puesto1) && IdEmpleado == IdEmpleado1){
                int  a ;
                System.out.println("Que tipo de empleado es?");
                System.out.println("1-Empleado trabador");
                System.out.println("2-Empleado supervisor");
                a = entrada.nextInt();

                switch (a) {
                    case 1:
                        SueldoQuincenal[0]=5000.0;
                        SueldoQuincenal[1]=50.0;
                        SueldoQuincenal[2]=60.0;
                        SueldoQuincenal[3]=0;
                        
                        break;

                    case 2:
                        SueldoQuincenal[0]=8000.0;
                        SueldoQuincenal[1]=0.2;
                        SueldoQuincenal[2]=0.1;
                        SueldoQuincenal[3]=0.16;
                        
                        break;
                
                    default:
                        break;
                }

        }
        //Lo de arriba inmediato va en una clase aparte
    }
}


