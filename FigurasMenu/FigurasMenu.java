import java.util.Scanner;

class FigurasMenu{

    public static void main(String[] args) {
        
        /* 
        Vamos a realizar un programa para calcular el area y perimetro de diferentes figuras geometricas
        */

        Scanner entrada = new Scanner(System.in);
        String opcion;
        int altura , base , diagonal ;
        double  perimetro , area ;
        boolean bandera = true ;

                do{ 
        System.out.println("Bienvenido al programa de calculo de areas y perimetros");
        System.out.println("Elija una de las siguientes opciones");
        System.out.println("1-Calcular el area y perimetro de un cuadrado");
        System.out.println("2-Calcular el area y perimetro de un triangulo");
        System.out.println("3-Calcular el area y perimetro de un circulo");
        System.out.println("4-Calcular el area y perimetro de un rectangulo");
        System.out.println("5-Calcular el area y perimetro de un rombo");
        System.out.println("6-Calcular el area y perimetro de un hexagono");
        System.out.println("7-Salir");
        System.out.println("Gracias uwu");


        opcion = System.console().readLine();
        
        base = 0 ;
        area = 0;
        perimetro = 0 ;
        
        switch(opcion){

            case "1":
                System.out.println("Ingrese el valor de cualquier lado");
                altura = entrada.nextInt();
                if( altura > 0 ){
                    base = altura ;
                    perimetro = altura * 4 ;
                    area = base * base; 
                    System.out.println("El perimetro del cuadrado es de : " + perimetro  );
                    System.out.println("El area del cuadrado es de : " + area );
                } else{
                    System.out.println("El valor es inavlido");
                }

                break;

            case "2":
                System.out.println("Ingrese el valor de la altura");
                altura = entrada.nextInt();
                System.out.println("Ingrese el valor de la base");
                base = entrada.nextInt();
                if( altura > 0 & base > 0){ 
                perimetro = base * 3 ;
                area = (base * altura) / 2; 
                System.out.println("El perimetro del triangulo es de : " + perimetro  );
                System.out.println("El area del triangulo es de : " + area );
                } else{
                    System.out.println("Uno de los valores es invalido");
                }
                break;
            
            case "3":
                System.out.println("Ingrese el valor del radio");
                altura = entrada.nextInt();
                if(altura > 0){ 
                perimetro = 2 * altura * 3.1416 ;
                area =  altura * altura * 3.1416; 
                System.out.println("El perimetro del circulo es de : " + perimetro  );
                System.out.println("El area del circulo es de : " + area );
                } else{
                    System.out.println("El valor es invalido");
                }
                break;

            case "4":
                System.out.println("Ingrese el valor del lado menor");
                altura = entrada.nextInt();
                System.out.println("Ingrese el valor del lado mayor");
                base = entrada.nextInt();
                if( altura > 0 & base > 0){ 
                perimetro = altura + altura + base + base ;
                area = altura * base ;
                System.out.println("El perimetro del rectangulo es de : " + perimetro  );
                System.out.println("El area del rectangulo es de : " + area );
                } else{
                    System.out.println("Uno de los valores es invalido");
                }
                break;

            case "5":
                System.out.println("Ingrese el valor de la diagonal mayor");
                altura = entrada.nextInt();
                System.out.println("Ingrese el valor de la diagonal menor");
                base = entrada.nextInt();
                System.out.println("Ingrese el valor de cualquier lado ");
                diagonal = entrada.nextInt();
                if( altura > 0 & base > 0 & diagonal > 0){ 
                perimetro = diagonal * 4 ;
                area = (altura * base) / 2 ;
                System.out.println("El perimetro del rombo es de : " + perimetro  );
                System.out.println("El area del rombo es de : " + area );
                } else{
                    System.out.println("Uno de los valores es invalido");
                }
                break;

            case "6":
                System.out.println("Ingrese el valor de cualquier lado");
                altura = entrada.nextInt();
                System.out.println("Ingrese el valor del apotema ");
                diagonal = entrada.nextInt();
                if( altura > 0 & diagonal > 0){ 
                perimetro = 6 * altura ;
                area = (perimetro * diagonal) / 2 ;
                System.out.println("El perimetro del hexagono es de : " + perimetro  );
                System.out.println("El area del hexagono es de : " + area );
                } else{
                    System.out.println("Uno de los valores es invalido");
                } 


                break;
            
            default:
                
            break;
            


        }

        if(opcion.equals("S")  ||  opcion.equals("s") || opcion.equals("7") ){
            
            bandera = false ;
        } 
        
                
                } while( bandera );                                                                                                        

    }
}