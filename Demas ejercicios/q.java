import java.util.Scanner;

class q{
              public static void main (String[] args){
                            Scanner entrada = new Scanner(System.in);
                            int[] listaNumeros = new int[10];
                            System.out.println("Escriba sus 10 numeros");
                            for(int i=0 ; i<10 ; i++){
                                          listaNumeros[i] = entrada.nextInt();
                            } 

                            System.out.println("Elija un ejercicio");
                            int a = entrada.nextInt();
                            switch (a) {
                                          case 1:
                                                        
                                                        double contador1 = 0;
                                                        double contador2 =0 ;
                                                        int identificador = 0;
                                                        double proPositivo = 0;
                                                        double proNegativo = 0; 

                                                        for( int k=0 ; k<listaNumeros.length ; k++){
                                                        identificador = listaNumeros[k];

                                                        if(identificador>0){
                                                                      proPositivo = proPositivo + identificador;
                                                                      contador1= contador1 + 1 ;
                                                        }else{
                                                                      proNegativo = proNegativo + identificador ;
                                                                      contador2 = contador2 + 1 ;
                                                        }
                                                        }
                                                        double pro1= 0;
                                                        double pro2=0;
                                                        if(contador1!=0){
                                                        pro1 = (proPositivo / contador1)  ;
                                                        }if(contador2!=0){
                                                                      pro2 = (proNegativo / contador2)  ;
                                                                      
                                                        }   
                                                        
                                                        System.out.println("El promedio de numeros positivos es: "+ pro1);
                                                        System.out.println("El promedio de numeros negativos es: "+ pro2);
                                                        System.out.println("Presione 0 para repetir");
                                                        System.out.println("Presione 0 para repetir");
                                                        break;
                                          case 2:
                                                        double cont =0;
                                                        double promedio;
                                                        double acumulador =0; 
                                                        for( int k=0 ; k<listaNumeros.length ; k++){
                                                                      if(k%2 ==0){
                                                                                    acumulador = acumulador + listaNumeros[k];
                                                                                    cont = cont + 1;
                                                                      }
                                                        }
                                                        promedio = acumulador / cont ;
                                                        System.out.println("El promedio es: "+ promedio);
                                                                      break;
                                          case 3:
                                                        acumulador = 0;
                                                        promedio = 0;
                                                        int numeroMenor=listaNumeros[0];
                                                        int aprobados= 0 ,reprobados= 0 ,sobrePromedio=0 , numeroMayor= 0;
                                                        System.out.println("Esas son sus 10 calificaciones");
                                                        for( int k=0 ; k<listaNumeros.length ; k++){
                                                                      System.out.println("En la posicion "+k+" la calificacion es: "+listaNumeros[k]);
                                                                      acumulador = acumulador + listaNumeros[k];
                                                                      promedio = acumulador / 10;
                                                                      if (listaNumeros[k]>numeroMayor) {
                                                                                    numeroMayor= listaNumeros[k];

                                                                      }if(listaNumeros[k] <numeroMenor){
                                                                                    numeroMenor = listaNumeros[k];
                                                                      }
                                                                      if(listaNumeros[k] >= 6){
                                                                                    aprobados = aprobados + 1;
                                                                      }else if(listaNumeros[k]<6){
                                                                                    reprobados =reprobados + 1;
                                                                      }
                                                        }
                                                        for( int k=0 ; k<listaNumeros.length ; k++){
                                                                      if(listaNumeros[k]>promedio){
                                                                                    sobrePromedio = sobrePromedio + 1;
                                                                      }
                                                        }
                                                        System.out.println("El promedio es: " + promedio);
                                                        System.out.println("La calificacion mas alta es: " +numeroMayor);
                                                        System.out.println("La calificacion mas baja es: " +numeroMenor);
                                                        System.out.println("El numero de calificaciones sobre el promedio son: " + sobrePromedio);
                                                        System.out.println("Hay " +aprobados+ " alumnos aprobados");
                                                        System.out.println("Hay " +reprobados+ " alumnos reprobados");
                                                        break;
                                          case 4:
                                                        int A[][] = new int[3][3];
                                                        int B[][] = new int[3][3];
                                                        int S[][] = new int[3][3];
                                                        System.out.println("Para la matriz A");
                                                        for (int i = 0; i<A.length; i++) {
                                                                      for (int j = 0; j<B.length; j++) {
                                                                                    System.out.print("Escriba el valor de la posicion "+ i+"--"+j);
                                                                                    System.out.print(" ");
                                                                                    A[i][j] = entrada.nextInt();
                                                                      }
                                                        }
                                                        System.out.println("Para la matriz B");
                                                        for (int i = 0; i<A.length; i++) {
                                                                      for (int j = 0; j<B.length; j++) {
                                                                                    System.out.print("Escriba el valor de la posicion "+ i+"--"+j );
                                                                                    System.out.print(" ");
                                                                                    B[i][j] = entrada.nextInt();
                                                                      }
                                                        }
                                                        System.out.println("Para la matriz S");
                                                        for (int i = 0; i<3; i++) {
                                                                      for (int j = 0; j<3; j++) {
                                                                                    System.out.print("En la posicion "+ i+"--"+j+" la suma es: " );
                                                                                    System.out.print( A[i][j] + B[i][j] );
                                                                                    System.out.print("\n");
                                                                      }
                                                        }
                                                        break;
                            }
              }
}
