import java.util.Scanner;

public class Figuras{
              public double area;
              public double base;
              public double perimetro=0 ;
              public double altura =0 ;
              Scanner entrada = new Scanner(System.in);

              public void menu(){
                            int op;
                            do{ 
                                          System.out.println("-----------------");
                                          System.out.println("Elija a que figura desea calcular su area y perimetro");
                                          System.out.println("1-Circulo");
                                          System.out.println("2-rectangulo");
                                          System.out.println("3-cuadrado");
                                          System.out.println("4-Triangulo");
                                          System.out.println("5-Regresar");
                                          op = entrada.nextInt();
                                          switch(op){
                                                        case 1:
                                                                      circulo();
                                                                      break;
                                                        case 2:
                                                                      rectangulo();
                                                                      break;
                                                        case 3:
                                                                      cuadrado();
                                                                      break;
                                                        case 4:
                                                                      triangulo();
                                                                      break;
                                          }
                            }while( op!= 5);
              }
              public void circulo(){
                            System.out.println("Ingrese el valor del radio");
                            altura = entrada.nextDouble();
                            if(altura > 0){ 
                                          perimetro = 2 * altura * 3.1416 ;
                                          area =  altura * altura * 3.1416;
                                          System.out.println("El perimetro del circulo es de : " + perimetro  );
                                          System.out.println("El area del circulo es de : " + area );
                            } else{
                                          System.out.println("El valor es invalido");
                            }
              }

              public void rectangulo(){
                            System.out.println("Ingrese el valor del lado menor");
                            altura = entrada.nextDouble();
                            System.out.println("Ingrese el valor del lado mayor");
                            base = entrada.nextDouble();
                            if( altura > 0 & base > 0){ 
                                          perimetro = altura + altura + base + base ;
                                          area = altura * base ;
                                          System.out.println("El perimetro del rectangulo es de : " + perimetro  );
                                          System.out.println("El area del rectangulo es de : " + area );
                            } else{
                                          System.out.println("Uno de los valores es invalido");
                            }
              }

              public void cuadrado(){
                            System.out.println("Ingrese el valor de cualquier lado");
                            altura = entrada.nextDouble();
                            if( altura > 0 ){
                                          base = altura ;
                                          perimetro = altura * 4 ;
                                          area = base * base; 
                                          System.out.println("El perimetro del cuadrado es de : " + perimetro  );
                                          System.out.println("El area del cuadrado es de : " + area );
                            } else{
                                          System.out.println("El valor es inavlido");
                            }
              }

              public void triangulo(){
                            System.out.println("Ingrese el valor de la altura");
                                          altura = entrada.nextDouble();
                                          System.out.println("Ingrese el valor de la base");
                                          base = entrada.nextDouble();
                                          if( altura > 0 & base > 0){ 
                                                        perimetro = base * 3 ;
                                                        area = (base * altura) / 2; 
                                                        System.out.println("El perimetro del triangulo es de : " + perimetro  );
                                                        System.out.println("El area del triangulo es de : " + area );
                                          } else{
                                                        System.out.println("Uno de los valores es invalido");
                                          }
              }

}