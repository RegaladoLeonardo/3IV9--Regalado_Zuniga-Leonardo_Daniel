import java.util.*;


class Tablero{
              Scanner entrada = new Scanner(System.in);
              //private Casilla[][] casillas;
              public String Tabla[][]={{"-","-","-","-","-","-"},
                                          {"-","-","-","-","-","-"},
                                          {"-","-","-","-","-","-"},
                                          {"-","-","-","-","-","-"},
                                          {"-","-","-","-","-","-"},
                                          {"-","-","-","-","-","-"}};
              /*
                                          Casilla matriz[][] = new Casilla[6][6];
              private int continuar;
              private int Boom, x, y;
              //private int x1,x2,x3,x4,x5,y1,y2,y3,y4,y5;
              
              public void setx(int x){
                            this.x=x; 
              }
              public int getx(){
                            return x;
                            */
              

              public void Cordenadas(){
                            /*
                            for(int j =0 ; j <6 ; j++){
                                          System.out.println(""); 
                                          for(int i = 0 ; i< 6 ; i++){
                                                        if(this.matriz[j][i].getSeleccionado()){
                                                                      System.out.print("0");
                                                        }
                                                        else{
                                                                      System.out.print("X");
                                                        }  
                                                        
                                          }
                            }
                            */ 
                            System.out.println(" ");
                            for(int j =0 ; j <6 ; j++){
                                          System.out.println(""); 
                                          for(int i = 0 ; i< 6 ; i++){
                                                        System.out.print(this.Tabla[j][i]+" ");  
                                                        
                                          }
                            }
                            System.out.println("\nJugador A: escriba las cordenadas donde quiera poner 5 minas!!");
                            int x,y ;
                            for(int i=0; i<5; i++){
                                          int b=i+1 ;
                                          System.out.println("Mina----"+b);
                                          System.out.println("Escriba el numero de la Fila");
                                          x=entrada.nextInt();
                                          System.out.println("Escriba el numero de la Columna");
                                          y=entrada.nextInt();
                                          x=x-1;
                                          y=y-1;
                                          this.Tabla[x][y]="X";
                                          MiTabla();
                            }

                            
                            
              }
/*
              public Tablero(){

                            for(int i=0; i<6; i++){
                                          for (int j = 0; j<6; j++) {
                                                        Casilla ar= new Casilla(i, j);
                                                        this.casillas[i][j] = ar;
                                          }
                            }
                            Cordenadas();
              }
*/
              public void MiTabla(){

                            for(int j =0 ; j <6 ; j++){
                                          System.out.println(""); 
                                          for(int i = 0 ; i< 6 ; i++){
                                                        System.out.print(this.Tabla[j][i]+" ");  
                                                        
                                          }
                            }
              }
}