import java.util.Scanner;

class Sub{ 

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int option = 0 ;
        do{ 
            System.out.println(" ");
            System.out.println("3IV9_REGALADO_ZUÑIGA_LEONARDODABNIEL");
            System.out.println("Elija una de las siguientes opciones:");
            System.out.println("1-Descuento de abono segun la edad del usuario");
            System.out.println("2-Transformador de decimales a Binario");
            System.out.println("3-Tramsformador de grados FAHRENHEIT , CELSIUS, KELVINE y RANKINE");
            System.out.println("4-Calculador de cantidad de numeros negativos y positivos");
            System.out.println("5-Cantidad a pagar por un numero de productos que desee");
            System.out.println("6-Calculo de areas y perimetros de un rectangulo y triangulo ademas el volumen de una esfera y cilindro");
            System.out.println("7-Tabla de valores 1-10000");
            System.out.println("8-Calculo del factorial de un entero natural ");
            System.out.println("9-cuadrado hecho con asteriscos ");
            System.out.println("10-Cuadrado hueco con asteriscos ");
            System.out.println("11-Patron de asteriscos ");
            System.out.println("12-Diamante de asteriscos ");
            System.out.println("13-Calculadora");
            System.out.println("14-salir");

            int positivo = 0 ;
            int negativo = 0;
            int regreso ;
            option= entrada.nextInt();
            System.out.println("--------------------");

            switch (option) {
                case 1:
                    do{ 
                        double total = 0;
                        int edad = 0 ;
                        int abono = 0;
                        System.out.println("Ingrese la cantidad a abonar");
                        abono  = entrada.nextInt();
                        System.out.println("Ingrese su edad");
                        edad = entrada.nextInt();
                        
                        if( edad > 65 ){
                            total = abono * .40;
                            System.out.println("El abono total es de:  $" + total);
                        } else if( edad < 21 ) {
                            int pregunta =0 ;
                            System.out.println("Si sus padres son socios socios escriba 1");
                            pregunta = entrada.nextInt();

                            if( pregunta == 1){
                                total = abono * .45;
                                System.out.println("El abono total es de:  $" + total);
                            } else{
                                total = abono * .25;
                                System.out.println("El abono total es de:  $" + total);
                            }
                        } else {
                            total = abono ;
                            System.out.println("El abono total es de:  $" + total);
                        }
                        System.out.println("Si quiere regresar al menu principal oprima 0 de lo contario cualquier otro numero ");
                        regreso =entrada.nextInt();
                    }while(regreso != 0);
                break;

                case 2:
                    do{ 
                        String valorBi="" ;
                        int moduloRE , numdeci ;
                            System.out.println("Ingrese el numero decimal");

                            numdeci = entrada.nextInt();
                            if( numdeci > 0){
                                while (numdeci > 0){
                                    moduloRE = numdeci%2;
                                    numdeci = numdeci / 2;
                                    valorBi = moduloRE + valorBi  ;
                                }
                            }else {
                                System.out.println("Ingrese un numero valido");
                            }
                            System.out.println("El numero binario es: " + valorBi);
                            System.out.println("Si quiere regresar al menu principal oprima 0 de lo contario cualquier otro numero ");
                            regreso =entrada.nextInt();
                    }while(regreso != 0);
                break;

                case 3:
                    do{ 
                            double grados = 0;
                            System.out.println("Escriba el numero de la opcion a elejir");
                            System.out.println("1-CELSIUS a FAHRENHEIT");
                            System.out.println("2-CELSIUS a KELVINE");
                            System.out.println("3-CELSIUS a RANKINE");
                            System.out.println("4-KELVINE a FAHRENHEIT");
                            System.out.println("5-KELVINE a CELSIUS");
                            System.out.println("6-KELVINE a RANKINE");
                            System.out.println("7-FAHRENHEIT a CELSIUS");
                            System.out.println("8-FAHRENHEIT a KELVINE");
                            System.out.println("9-FAHRENHEIT a RANKINE");
                            System.out.println("10-RANKINE a CELSIUS");
                            System.out.println("11-RANKINE a FAHRENHEIT");
                            System.out.println("12-RANKINE a KELVINE");

                            int eleccion = entrada.nextInt();
                            double f ;
                            switch (eleccion){
                                case 1:
                                System.out.println("Escriba los grados que de sea convertir");
                                grados = entrada.nextInt();
                                f = (grados * 9/5) + 32 ;
                                System.out.println("Equivale a " + f + " grados  FAHRENHEIT");
                                break;
                                case 2:
                                System.out.println("Escriba los grados que de sea convertir");
                                grados = entrada.nextInt();
                                f = grados + 273.15 ;
                                System.out.println("Equivale a " + f + " grados  KELVINE");
                                break;
                                case 3:
                                System.out.println("Escriba los grados que de sea convertir");
                                grados = entrada.nextInt();
                                f = (grados * 9/5) + 491.67 ;
                                System.out.println("Equivale a " + f + " grados  RANKINE");
                                break;
                                case 4:
                                System.out.println("Escriba los grados que de sea convertir");
                                grados = entrada.nextInt();
                                f = ( grados - 273.15) * 9/5 + 32 ;
                                System.out.println("Equivale a " + f + " grados  FAHRRENHIET");
                                break;
                                case 5:
                                System.out.println("Escriba los grados que de sea convertir");
                                grados = entrada.nextInt();
                                f =  grados - 273.15 ;
                                System.out.println("Equivale a " + f + " grados  CELSIUS");
                                break;
                                case 6:
                                System.out.println("Escriba los grados que de sea convertir");
                                grados = entrada.nextInt();
                                f =  grados - 273.15 ;
                                System.out.println("Equivale a " + f + " grados  RANKINE");
                                break;
                                case 7:
                                System.out.println("Escriba los grados que de sea convertir");
                                grados = entrada.nextInt();
                                f = ( grados - 32) * 5/9 ;
                                System.out.println("Equivale a " + f + " grados  CELSIUS");
                                break;
                                case 8:
                                System.out.println("Escriba los grados que de sea convertir");
                                grados = entrada.nextInt();
                                f = ( grados - 32) * 5/9 + 273.15;
                                System.out.println("Equivale a " + f + " grados KELVINE");
                                break;
                                case 9:
                                System.out.println("Escriba los grados que de sea convertir");
                                grados = entrada.nextInt();
                                f = grados + 459.67 ;
                                System.out.println("Equivale a " + f + " grados  RANKINE");
                                break;
                                case 10:
                                System.out.println("Escriba los grados que de sea convertir");
                                grados = entrada.nextInt();
                                f = ( grados - 491.67) * 5/9 ;
                                System.out.println("Equivale a " + f + " grados  CELSIUS");
                                break;
                                case 11:
                                System.out.println("Escriba los grados que de sea convertir");
                                grados = entrada.nextInt();
                                f = grados - 459.67;
                                System.out.println("Equivale a " + f + " grados  FAHRENHEIT");
                                break;
                                case 12:
                                System.out.println("Escriba los grados que de sea convertir");
                                grados = entrada.nextInt();
                                f = grados * 5/9 ;
                                System.out.println("Equivale a " + f + " grados  KELVINE");
                                break;
                                
                                default:
                            break;
                            } 
                            System.out.println("Si quiere regresar al menu principal oprima 0 de lo contario cualquier otro numero ");
                            regreso =entrada.nextInt();
                    }while(regreso !=0);
                break; 

                case 4: 
                    do{                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
                        int cost ;
                        System.out.println("Introduzca la cantidad de numeros ");
                        cost = entrada.nextInt();
                        System.out.println("----------------------- ");
                        while( cost > 0 ){
                            cost = cost - 1 ;
                            int  numero = entrada.nextInt();
                            
                            if(numero > 0){
                                positivo = 1 + positivo;
                            } else if(numero < 0){
                                negativo = 1 + negativo;
                            }
                        }
                        System.out.println("Hay "+positivo+ " positivos y " +negativo+ " negativos");
                        System.out.println("Si quiere regresar al menu principal oprima 0 de lo contario cualquier otro numero ");
                            regreso =entrada.nextInt();
                    }while(regreso != 0);
                break;

                case 5:
                    do{ 
                        int indice ;
                        int pro1 = 15 ;
                        int pro2 = 4 ;
                        int pro3 = 20 ;
                        int cuenta =0 ;
                        do{ 
                            System.out.println("Elija el producto");
                            System.out.println("1-Coca-Cola--$15");
                            System.out.println("2-Mazapan----$4");
                            System.out.println("3-Torta------$20");
                            System.out.println("4--Imprimir el Ticket");
                            indice = entrada.nextInt();
                            if( indice < 4){  
                            System.out.println("Escriba la cantidad del producto");
                            int cantidad = entrada.nextInt();
                            if( indice == 1){
                                cuenta = cuenta + (pro1*cantidad) ;
                            } else if( indice == 2){
                                cuenta = cuenta + (pro2*cantidad) ;
                            } else if( indice == 3){
                                cuenta = cuenta + (pro3*cantidad);
                            } 
                            }
                        } while( indice < 4);
                        System.out.println("----------------");
                        System.out.println("Total: $" + cuenta);
                        System.out.println("Si quiere regresar al menu principal oprima 0 de lo contario cualquier otro numero ");
                            regreso =entrada.nextInt();
                    }while(regreso !=0);
                break;
                
                case 6:
                    do{  
                        String tipo ;
                        System.out.println( "Elija que calculo quiere hacer" );
                        System.out.println("------------------------");
                        System.out.println( "A.Area y perimetro de un rectangulo" );
                        System.out.println( "B.Area y perimetro de un triangulo" );
                        System.out.println( "C.Volumen de una esfera" );
                        System.out.println( "E.Volumen de un cilindro" );
                        tipo = System.console().readLine();
                        double l1 ;
                        double l2 ;
                        double area = 0 ;
                        double perimetro = 0 ;
                        
                        switch( tipo ){
                            case "A":
                                System.out.println( "Ingrese el valor del lado mayor" );
                                l1 =entrada.nextInt();
                                System.out.println( "Ingrese el valor del lado menor" );
                                l2 =entrada.nextInt();
                                perimetro = (l1*2)+(l2*2) ;
                                area = l1 * l2 ;
                                System.out.println( "El perimetro es de: " + perimetro );
                                System.out.println( "El area es de: " + area );
                            break;

                            case "B":
                                    int l3 ;
                                    int l4 ;
                                    System.out.println( "Ingrese la altura" );
                                    l1 =entrada.nextInt();
                                    System.out.println( "Ingrese la base" );
                                    l2 =entrada.nextInt();
                                    System.out.println( "Ingrese el valor del lado 2" );
                                    l3 =entrada.nextInt();
                                    System.out.println( "Ingrese el valor del lado 3" );
                                    l4 =entrada.nextInt();
                                    perimetro = l2 + l3 + l4 ;
                                    area = (l1 * l2) / 2 ;
                                    System.out.println( "El perimetro es de: " + perimetro );
                                    System.out.println( "El area es de: " + area );
                            break;

                            case "C":
                                System.out.println( "Ingrese el radio " );
                                l1 = entrada.nextInt();
                                area = (l1*l1*l1) * 3.1416 + 3/4 ;
                                System.out.println( "El volumen es de: " + area );
                                break;
                                case "D":
                            break;
                            case "E":
                                System.out.println( "Ingrese el radio" );
                                l1 = entrada.nextInt();
                                System.out.println( "Ingrese la altura" );
                                l2 = entrada.nextInt();
                                area = l1 * l1 * l2 * 3.1416 ;
                                System.out.println( "El volumen es de: " + area );
                            
                        }
                        System.out.println("Si quiere regresar al menu principal oprima 0 de lo contario cualquier otro numero ");
                            regreso =entrada.nextInt();
                    }while(regreso !=0 );
                break; 
                
                case 7: 
                        int nm1, nm2, nm3 ,multi, vale;
                    do{
                        System.out.println("De que tamaño quiere su tabla??");
                        vale = entrada.nextInt();
                        multi=1;
                        do{
                            nm3 = multi*1000;
                            nm2 = multi*100;
                            nm1 = multi*10;

                            multi=multi + 1;
                            System.out.print(" "+multi);
                            System.out.print(" "+nm1);
                            System.out.print(" "+nm2);
                            System.out.println(" "+nm3);
                        }while(multi<=vale);
                        System.out.println("Si quiere regresar al menu principal oprima 0 de lo contario cualquier otro numero ");
                            regreso =entrada.nextInt();
                    }while(regreso!=0);
                    
                    
                break;

                case 8:
                    do{  
                        int normal ;
                        long cambio = 1 ;
                        System.out.println("Escriba un numero positivo");
                        normal = entrada.nextInt();

                        while( normal > 0){
                            
                            cambio= cambio * normal ;
                            normal = normal -1 ;
                        }
                        System.out.println("Su factorial es: " + cambio );
                        System.out.println("Si quiere regresar al menu principal oprima 0 de lo contario cualquier otro numero ");
                            regreso =entrada.nextInt();
                    }while( regreso != 0);
                break;

                case 9:
                    do{ 
                        int i ;
                        int k ;
                        System.out.print("Escriba la resolucion de su cuadrado del 1 al 20");
                        System.out.println("");
                        int medida = entrada.nextInt();
                        
                        for(k =0 ; k < medida ; k++){ 
                            System.out.println(""); 
                            for( i = 0 ; i< medida ; i++){
                                System.out.print("*   ");    
                            }
                        }
                        System.out.println(" ");
                        System.out.println("Si quiere regresar al menu principal oprima 0 de lo contario cualquier otro numero ");
                        regreso =entrada.nextInt();
                    }while( regreso != 0);
                break;

                case 10:
                    do{ 
                        int i ;
                        int k ;
                        System.out.print("Escriba la resolucion de su cuadrado del 1 al 20");
                        System.out.println("");
                        int medida = entrada.nextInt();
                        
                        for(k =0 ; k < medida ; k++){ 
                            System.out.println(""); 
                            for( i = 0 ; i< medida ; i++){
                                System.out.print("*");    
                            }
                        }
                        System.out.println(" ");
                        System.out.println("Si quiere regresar al menu principal oprima 0 de lo contario cualquier otro numero ");
                        regreso =entrada.nextInt();
                    }while( regreso != 0);
                break;

                case 11:
                    
                break;

                case 12:
                    for(int i = 0 ; i < 2 ; i++){
                        System.out.println("*");
                        for(int j = 0 ; j < 2 ; j++){
                            System.out.println("/");
                            for(int k = 0 ; k < 2 ; k++){
                                System.out.print("|");
                                for(int l = 0 ; l < 2 ; l++){
                                    System.out.print("#");
                                }
                            }
                        }

                    }
                break;

                case 13:
                    do{ 
                        int valor ;
                        float resultado;
                        int nums ;
                        int nums2 ;
                        System.out.println("Elija la operacion que desee");
                        System.out.println("1-Suma");
                        System.out.println("2-Resta");
                        System.out.println("3-multiplicacion");
                        System.out.println("4-Division");
                        valor = entrada.nextInt();
                        
                        switch(valor){ 
                            
                            case 1:
                                System.out.println("Escriba el primer numero");
                                nums =entrada.nextInt();
                                System.out.println("Escriba el segundo numero");
                                nums2 =entrada.nextInt();

                                resultado = nums + nums2 ;
                                System.out.println("La suma total " + resultado);
                            break;
                            
                            case 2:
                            System.out.println("Escriba el minuendo");
                                nums =entrada.nextInt();
                                System.out.println("Escriba el sustraendo");
                                nums2 =entrada.nextInt();

                                resultado = nums - nums2 ;
                                System.out.println("La resta es de: " + resultado);
                            break;
                            case 3:
                                System.out.println("Escriba el primer numero");
                                nums =entrada.nextInt();
                                System.out.println("Escriba el segundo numero");
                                nums2 =entrada.nextInt();
                                resultado = nums * nums2 ;
                                System.out.println("La multiplicacion es de: " + resultado);
                            break;
                            case 4:
                                System.out.println("Escriba el numero dividendo");
                                nums =entrada.nextInt();
                                System.out.println("Escriba el numero divisor");
                                nums2 =entrada.nextInt();

                                double division = (double)nums/nums2;

                                System.out.println("La division es de: " + division);
                            break;
                        }
                        System.out.println("Si quiere regresar al menu principal oprima 0 de lo contario cualquier otro numero ");
                            regreso =entrada.nextInt();
                    }while(regreso !=0);
                break;

                    default:
                    break;
            }
        }while(option != 14);
        System.out.println("Gracias por vernir!!!!");
        
    }
}                                 