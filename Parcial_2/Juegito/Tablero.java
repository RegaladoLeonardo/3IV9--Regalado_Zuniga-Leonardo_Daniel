import java.util.*;
import java.util.ArrayList;

class Tablero{
              Scanner entrada = new Scanner(System.in);
              private ArrayList<ArrayList<Casilla>> casillas = new ArrayList<ArrayList<Casilla>>();
              /* public String Tabla[][]={{"-","-","-","-","-","-"},
                                          {"-","-","-","-","-","-"},
                                          {"-","-","-","-","-","-"},
                                          {"-","-","-","-","-","-"},
                                          {"-","-","-","-","-","-"},
                                          {"-","-","-","-","-","-"}};
                                          */                         
              Casilla matriz[][] = new Casilla[6][6];
              private int continuar;
              private int Boom, x, y;
              //private int x1,x2,x3,x4,x5,y1,y2,y3,y4,y5;

              public void setx(int x){
                            this.x=x; 
              }
              public int getx(){
                            return x;
              }

              public void Cordenadas(){
                            
                            for(int i =0 ; i <6 ; i++){
                                          System.out.println(""); 
                                          for(int j = 0 ; j< 6 ; j++){
                                                        if(this.casillas.get(i).get(j).getSeleccionado()){
                                                                      System.out.print(" 0 ");
                                                        }
                                                        else{
                                                                      System.out.print(" X ");
                                                        }  
                                                        
                                          }
                            }
                            /* 
                            System.out.println(" ");
                            System.out.println("Jugador A: escriba las cordenadas donde quiera poner 5 minas!!");
                            int x,y ;
                            for(int i=0; i<5; i++){
                                          int b=i+1 ;
                                          System.out.println("Mina----"+b);
                                          System.out.println("Escriba el numero de la fila");
                                          y=entrada.nextInt();
                                          System.out.println("Escriba el numero de la columna");
                                          x=entrada.nextInt();
                                          x=x-1;
                                          y=y-1;
                            }
                            
                            for(int j =0 ; j <6 ; j++){
                                          System.out.println(""); 
                                          for(int i = 0 ; i< 6 ; i++){
                                                        System.out.print(this.Tabla2[j][i]+" ");  
                                                        
                                          }
                            }
                            */
              }

              public Tablero(){

                            for(int i=0; i<6; i++){
                                          this.casillas.add(new ArrayList<Casilla>());
                                          for (int j = 0; j<6; j++) {
                                                        Casilla ar= new Casilla(i, j);
                                                        this.casillas.get(i).add(ar);
                                          }
                            }
                            Cordenadas();
              }

              public void Minas(){

                            System.out.println(" ");
                            System.out.println("Jugador A: escriba las cordenadas donde quiera poner 7 minas!!");
                            int x,y ;
                            for(int i=0; i<6; i++){
                                          int b=i+1 ;
                                          System.out.println("Mina----"+b);
                                          System.out.println("Escriba el numero de la fila");
                                          y=entrada.nextInt();
                                          System.out.println("Escriba el numero de la columna");
                                          x=entrada.nextInt();
                                          x=x-1;
                                          y=y-1;
                                          this.casillas.get(x).get(y).getTieneBonba();
                            }
              }

}