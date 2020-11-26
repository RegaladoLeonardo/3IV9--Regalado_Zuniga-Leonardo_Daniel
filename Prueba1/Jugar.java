import java.util.*;

class Jugar{

              public static void main(String[] args){
                            Scanner entrada = new Scanner(System.in);
                            String continuar ;

                            System.out.println("Ese es el tablero donde jugara!!!");
                            do{
                                          Tablero mesa=new Tablero();
                                          mesa.Cordenadas();
                                          System.out.println("Quiere jugar de nuevo?");
                                          continuar=entrada.nextLine();
              
                            }while(continuar.equalsIgnoreCase("Si"));
              }
}