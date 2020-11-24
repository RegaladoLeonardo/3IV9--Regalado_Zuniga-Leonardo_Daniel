import java.util.Scanner;
import java.util.ArrayList;

class Tablero{
              Scanner entrada = new Scanner(System.in);
              ArrayList<String> Tablero = new ArrayList<String>();
              public String[][] Tabla= new String[6][6];

              public static void main(String[] args){

                            String Tabla[][]={{"-","-","-","-","-","-"},
                                              {"-","-","-","-","-","-"},
                                              {"-","-","-","-","-","-"},
                                              {"-","-","-","-","-","-"},
                                              {"-","-","-","-","-","-"},
                                              {"-","-","-","-","-","-"}};
                                          
                                          
                                          for(int j =0 ; j <6 ; j++){
                                                        System.out.println(""); 
                                                        for(int i = 0 ; i< 6 ; i++){
                                                                      System.out.print(Tabla[j][i]+" ");  
                                                                      
                                                        }
                                          }
              }
              


              public void Eleccion(){

              }


}