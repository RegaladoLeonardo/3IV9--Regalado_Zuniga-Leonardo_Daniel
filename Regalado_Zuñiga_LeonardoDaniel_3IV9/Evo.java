import java.util.Scanner;
import java.util.Random;

class Evo{

              public static void main(String[] args) {
                            int option1 ; 
              //El menu principal
              do{ 
                            Scanner entrada = new Scanner(System.in);
                            
                            long r = Math.round(Math.random()*3);
                            System.out.println( "Regalado Zuñiga Leonardo Daniel");
                            System.out.println( "Elija un pokemon para vern sus estadisticas!!!!");
                            System.out.println( "1-Charmander");
                            System.out.println( "2-Bulbasor");
                            System.out.println( "3-Squartle");
                            System.out.println( "4-Empezar la batalla!!!");
                            System.out.println( "5-Salir ");
                            option1 =entrada.nextInt();

                            int ataco1 =29;
                            int ataco2 =24;
                            int ataco3 =19;
                            


                            //El menu secundario
                            switch (option1) {
                                          case 1:
                                          
                                                        System.out.println( "ID: 1A");
                                                        System.out.println( "nombre :Chamander");
                                                        System.out.println( "fuerza : 44 ");
                                                        System.out.println( "defensa : 230");
                                                        System.out.println( "vida : 204");
                                                        System.out.println( "ataque principal : 50");
                                                        System.out.println( "ataque secundario: 29");
                                                        
                                                        
                                                        
                                                        break;
                                          case 2:
                                                        System.out.println( "ID: 2A");
                                                        System.out.println( "nombre :Bulbasor");
                                                        System.out.println( "fuerza : 40 ");
                                                        System.out.println( "defensa : 203");
                                                        System.out.println( "vida : 189");
                                                        System.out.println( "ataque principal : 49");
                                                        System.out.println( "ataque secundario: 24");
                                                        System.out.println( "pa ir al menu escriba 0");
                                                        break;
                                          
                                          case 3:
                                                        System.out.println( "ID: 3A");
                                                        System.out.println( "nombre :Squartle");
                                                        System.out.println( "fuerza : 34 ");
                                                        System.out.println( "defensa : 300");
                                                        System.out.println( "vida : 230");
                                                        System.out.println( "ataque principal : 46");
                                                        System.out.println( "ataque secundario: 19");
                                                        System.out.println( "pa ir al menu escriba 0");
                                                        break;
                                          case 4:
                                                        int atac1 =0;
                                                        int v1 = 0;
                                                        String po1 =" ";
                                                        int caso =(int)r;
                                                        switch(caso){
                                                                      case 0:
                                                                                    po1 = "Charmander" ;
                                                                                    v1 = 230;
                                                                                    atac1 =44;
                                                                      break;
                                                                      case 1:
                                                                                    atac1=40;
                                                                                    po1 = "Charmander" ;
                                                                                    v1 = 203 ;
                                                                      break;
                                                                      case 2:
                                                                                    v1 = 300 ;
                                                                                    po1 = "Charmander" ;
                                                                                    atac1 =34;
                                                                      break;
                                                        }
                                                        System.out.println( "Batalla con :" + po1);
                                                        System.out.println( "Fuerza :" + atac1);
                                                        System.out.println( "Defensa :"+ v1 );
                                                        int v2 = 340;
                                                        do{
                                                                      
                                                                      System.out.println( "Haga su primer ataque!!");
                                                                      System.out.println( "Siquiere ataque principal oprima 1");         
                                                                      System.out.println( "Siquiere ataque secundario oprima 2"); 
                                                                      int fase =entrada.nextInt();
                                                                      if( fase ==1 ){
                                                                                    v2 = v2 - (v1*1.5) ;
                                                                      }else{
                                                                                    v2 = v2 - v1 ;
                                                                      }
                                                                      
                                                                      
                                                        }while(v2 >0);
                                                        


                                                        break;
                                                        
                            
                                          default:
                                                        break;
                            }
                            
              }while( option1 != 5);
              
              }   
              
}