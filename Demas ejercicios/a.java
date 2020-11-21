import java.util.Scanner;

class a{
              public static void main(String[] args){
                            Scanner entrada = new Scanner(System.in);
                            String NombreCliente ;
                            String[] Productos = new String[10];
                            int[] Costo = new int[10];
                            int[] ProductoExistente = new int[10];

                            Productos[0]="Ventilador";
                            Productos[1]="Bocina";
                            Productos[2]="Pantalla";
                            Productos[3]="Radio";
                            Productos[4]="LapTop";
                            Productos[5]="Audifonos";
                            Productos[6]="Control Inalambrico";
                            Productos[7]="Camara";
                            Productos[8]="Reloj";
                            Productos[9]="Taladro";

                            Costo[0]=750;
                            Costo[1]=690;
                            Costo[2]=7850;
                            Costo[3]=560;
                            Costo[4]=15100;
                            Costo[5]=2900;
                            Costo[6]=1550;                                                         //Esto seria todas la declaracion
                            Costo[7]=1230;
                            Costo[8]=1900;
                            Costo[9]=2500;
                            Costo[0]=890;

                            ProductoExistente[0]= 5;
                            ProductoExistente[1]= 9;
                            ProductoExistente[2]= 3;
                            ProductoExistente[3]= 4;
                            ProductoExistente[4]= 6;
                            ProductoExistente[5]= 2;
                            ProductoExistente[6]= 8;
                            ProductoExistente[7]= 10;
                            ProductoExistente[8]= 4;
                            ProductoExistente[9]= 1;

                            int op,pro,total=0 ;
                            String[] Provedores= new String[10];
                            System.out.println("Hola ingresa tu nombre");
                            NombreCliente=entrada.nextLine();
                            System.out.println("Bienvenido "+NombreCliente+"!!");
                            do{                                                                                 //menu ???????????
                                          
                                          System.out.println("Que deseas hacer?");
                                          System.out.println("1-Anadir al carro");
                                          System.out.println("2-Pagar");
                                          System.out.println("3-Regresar");
                                          op=entrada.nextInt();
                                                        
                                                        switch (op) {
                                                                      case 1:
                                                                                    for(int i=0; i<10 ;i++){
                                                                                                  int b=i+1;
                                                                                                  System.out.println("El producto "+b+"-"+Productos[i]+" cuesta "+Costo[i]+"$");
                                                                                    }
                                                                                    System.out.println("Escriba el numero del producto quen quiera comprar :3");
                                                                                    pro =entrada.nextInt();

                                                                                    switch (pro) {
                                                                                                  case 1:
                                                                                                                if(ProductoExistente[0]>0){
                                                                                                                              ProductoExistente[0]=ProductoExistente[0]-1;
                                                                                                                              total=total+Costo[0];
                                                                                                                }
                                                                                                                Provedores[0]="ECOJET";
                                                                                                                break;
                                                                                                                
                                                                                                  case 2:
                                                                                                                if(ProductoExistente[1]>0){
                                                                                                                              ProductoExistente[1]=ProductoExistente[1]-1;
                                                                                                                              total=total+Costo[0];
                                                                                                                }
                                                                                                                Provedores[1]="Bose";
                                                                                                                break;
                                                                                                  case 3:
                                                                                                                if(ProductoExistente[2]>0){  
                                                                                                                              ProductoExistente[2]=ProductoExistente[2]-1;
                                                                                                                              total=total+Costo[2];
                                                                                                                }
                                                                                                                Provedores[2]="SAMSUNG";
                                                                                                                break;
                                                                                                  case 4:
                                                                                                                if(ProductoExistente[3]>0){  
                                                                                                                              ProductoExistente[3]=ProductoExistente[3]-1;
                                                                                                                              total=total+Costo[3];
                                                                                                                }
                                                                                                                Provedores[3]="Panasonic";
                                                                                                                break;
                                                                                                  case 5:
                                                                                                                if(ProductoExistente[4]>0){  
                                                                                                                              ProductoExistente[4]=ProductoExistente[4]-1;
                                                                                                                              total=total+Costo[4];
                                                                                                                }
                                                                                                                Provedores[4]="HP";
                                                                                                                break;                                                  //El total
                                                                                                  case 6:
                                                                                                                if(ProductoExistente[5]>0){  
                                                                                                                              ProductoExistente[5]=ProductoExistente[5]-1;
                                                                                                                              total=total+Costo[5];
                                                                                                                }
                                                                                                                Provedores[5]="SONIC";
                                                                                                                break;
                                                                                                  case 7:
                                                                                                                if(ProductoExistente[6]>0){  
                                                                                                                ProductoExistente[6]=ProductoExistente[6]-1;
                                                                                                                total=total+Costo[6];
                                                                                                                }
                                                                                                                Provedores[6]="MICROSOFT";
                                                                                                                break;
                                                                                                  case 8:
                                                                                                                if(ProductoExistente[7]>0){  
                                                                                                                ProductoExistente[7]=ProductoExistente[7]-1;
                                                                                                                total=total+Costo[7];
                                                                                                                }
                                                                                                                Provedores[7]="Wyze Labs";
                                                                                                                break;
                                                                                                  case 9:
                                                                                                                if(ProductoExistente[8]>0){  
                                                                                                                ProductoExistente[8]=ProductoExistente[8]-1;
                                                                                                                total=total+Costo[8];
                                                                                                                }
                                                                                                                Provedores[8]="Armitron";
                                                                                                                break;
                                                                                                  case 10:
                                                                                                                if(ProductoExistente[9]>0){  
                                                                                                                ProductoExistente[9]=ProductoExistente[9]-1;
                                                                                                                total=total+Costo[9];
                                                                                                                }
                                                                                                                Provedores[9]="TEENO";
                                                                                                                break;
                                                                                                  default:
                                                                                                                break;
                                                                                    }
                                                                                    break;
                                                                      case 2:
                                                                                    System.out.println("El total a pagar es:"+ total);


                                                                                    break;
                                                                      default:
                                                                                    
                                                                                    break;
                                                        }
                            }while(op!=3);
                            
                            
              }
}