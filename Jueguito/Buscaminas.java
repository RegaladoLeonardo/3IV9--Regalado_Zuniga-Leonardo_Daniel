import java.util.*;
import java.util.Scanner;

public class Buscaminas{

              Scanner leer = new Scanner(System.in);
              int tablero [][] = new int[15][15];
              double w=0;
              double z=0;
              int ntminas=0;
              int intento=3;
              int tminas=10;
              int x;
              int y;

              public void tablero(Scanner entrada){

                            for(int j=0; j<15;j++)
                            for(int i=0; i<15;i++)
                            tablero[j][i]=0;
                            do{
                            w=Math.random()*15;
                            z=Math.random()*15;
                            w=(int)w;
                            z=(int)z;
                            if(z!=0 && w!=0 && z!=15-1 && w!=15-1){
                                          tablero[(int)w][(int)z]=1;
                                          ntminas++;
                            }
                            
                            }while(ntminas<=10);

                            //for(int xx=0;xx<15;xx++)
                            //for(int yy=0;yy<15;yy++)
                            //    if(tablero [xx][yy]==1)
                            //    System.out.println("Fila "+(xx+1)+" columna "+(yy+1));
                            
                            System.out.println(" El tablero es de 6x6");
                            do {
                                          int x=0,y=0;
                                          int nminas = 0;
                            
                                          do{
                                                        System.out.println("\n-x----------------------------------------------------x-");
                                                        System.out.println("\n	Intento :"+intento+" , Cual es su coordenada? \n");
                                                        System.out.print("		Fila:  ");
                                                        x=leer.nextInt();
                                                        System.out.println();
                                                        System.out.print("		Columna:  ");
                                                        y=leer.nextInt();
                                                        
                                                        if(x==0 || y==0 || x>15 || y>15)
                                                        System.out.println("\n	==>Coordenadas incorrectas<== \n"); 
                                          }while(x==0 || y==0 || x>15 || y>15);
                                          x=x-1;
                                          y=y-1;

                                          if(tablero [x][y]==0){

                                                        if (x==0&&y==0){
                                                                                    if(x+1>=0 && x+1<15 && y<15)
                                                                                                  nminas=nminas+tablero [x+1][y];
                                                                                    if(x+1>=0 && x+1<15 && y+1<15 && y+1>=0)
                                                                                                  nminas=nminas+tablero [x+1][y+1];
                                                                                    if(x>=0 && x<15 && y+1<15 && y+1>= 0)
                                                                                                  nminas=nminas+tablero [x][y+1];
                                                        }
                                                                      else {
                                                                                    if(y==0){
                                                                                                  if(x+1>=0 && x+1<15 && y<15)
                                                                                                                nminas=nminas+tablero [x+1][y];
                                                                                                  if(x-1>=0 && x-1<15 && y<15)
                                                                                                                nminas=nminas+tablero [x-1][y];
                                                                                                  if(x-1>=0 && x-1<15 && y+1<15 && y+1>=0)
                                                                                                                nminas=nminas+tablero [x-1][y+1];
                                                                                                  if(x>=0 && x<15 && y+1<15 && y+1>= 0)
                                                                                                                nminas=nminas+tablero [x][y+1];
                                                                                                  if(x+1>=0 && x+1<15 && y+1<15 && y+1>=0)
                                                                                                                nminas=nminas+tablero [x+1][y+1];
                                                                                                  
                                                                                    }
                                                                                    
                                                                                    else{
                                                                                    
                                                                                                  if(x-1>=0 && x-1<15 && y-1<15)
                                                                                                                nminas=nminas+tablero [x-1][y-1];
                                                                                                  if(x>=0 && x<15 && y-1<15)
                                                                                                                nminas=nminas+tablero [x][y-1];
                                                                                                  if(x+1>=0 && x+1<15 && y-1<15)
                                                                                                                nminas=nminas+tablero [x+1][y-1];
                                                                                                  if(x+1>=0 && x+1<15 && y<15)
                                                                                                                nminas=nminas+tablero [x+1][y];
                                                                                                  if(x-1>=0 && x-1<15 && y<15)
                                                                                                                nminas=nminas+tablero [x-1][y];
                                                                                                  if(x-1>=0 && x-1<15 && y+1<15 && y+1>=0)
                                                                                                                nminas=nminas+tablero [x-1][y+1];
                                                                                                  if(x>=0 && x<15 && y+1<15 && y+1>= 0)
                                                                                                                nminas=nminas+tablero [x][y+1];
                                                                                                  if(x+1>=0 && x+1<15 && y+1<15 && y+1>=0)
                                                                                                                nminas=nminas+tablero [x+1][y+1];
                                                                                                  }
                                                                      }
                                                        
                                                        if(intento>0)
                                                        System.out.print("\n  Mina no encontrada. ");
                                                        System.out.print(" Alrededor hay: "+tminas);
                                                        System.out.println("\n Intentos restantes: "+(intento-1));
                                                        intento=intento-1;
                                                        }else{
                                                        tminas = tminas-1;
                                                        System.out.println("\n Acertaste!, Mina Eliminada Restan "+tminas+" Minas");
                                                        }

                            }while(intento>0 && intento>0 && tminas>0);

                            if(tminas==0)
                            System.out.println("		GANASTE! :D");

                            if(intento==0)
                                          System.out.println("		PERDISTE!");    
              }
              public static void main(String[] args){
              Buscaminas buscaminas = new Buscaminas();
              Scanner entrada = new Scanner(System.in);
              buscaminas.tablero(entrada);
              }
}