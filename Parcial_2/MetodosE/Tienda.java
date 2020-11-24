import java.util.Scanner;

public class Tienda{
              Scanner entrada = new Scanner(System.in);
              private String[] Nombre = new String[10];
              private String[] Provedores = new String[10];
              private int[] ProductosDis = new int[10];
              private int[] Precio = new int[10];
              private int Total; 
              private String[] MasMenos;
              private int cont;
              
              public void Estancia(){

                            Puesto var1 = new Puesto();
                            this.Nombre=var1.getProductos();
                            
                            Puesto var2 = new Puesto();
                            this.Precio=var2.getCosto();
                            
                            Puesto var3 = new Puesto();
                            this.ProductosDis=var3.getProductosExistentes();

              }
              
              public void  IntercambioLibro(int a){
                            this.Nombre[0]="Ventilador";
                            this.Nombre[1]="Bocina";
                            this.Nombre[2]="Pantalla";
                            this.Nombre[3]="Radio";
                            this.Nombre[4]="LapTop";
                            this.Nombre[5]="Audifonos";
                            this.Nombre[6]="Control Inalambrico";
                            this.Nombre[7]="Camara";
                            this.Nombre[8]="Reloj";
                            this.Nombre[9]="Taladro";
                            
                            this.Precio[0]=750;
                            this.Precio[1]=690;
                            this.Precio[2]=7850;
                            this.Precio[3]=560;
                            this.Precio[4]=12100;
                            this.Precio[5]=2900;
                            this.Precio[6]=1550;                                                         //Esto seria todas la declaracion
                            this.Precio[7]=1230;
                            this.Precio[8]=1900;
                            this.Precio[9]=2500;

                            this.ProductosDis[0]= 5;
                            this.ProductosDis[1]= 9;
                            this.ProductosDis[2]= 3;
                            this.ProductosDis[3]= 4;
                            this.ProductosDis[4]= 6;
                            this.ProductosDis[5]= 2;
                            this.ProductosDis[6]= 8;
                            this.ProductosDis[7]= 10;
                            this.ProductosDis[8]= 4;
                            this.ProductosDis[9]= 1;

                            int cual, con;
                            switch (a) {
                                          case 1:
                                                        try{ 
                                                                      do{ 
                                                                                    
                                                                                    System.out.println("----------------------------------------------------");
                                                                                    System.out.println("Escriba el indice del producto se quiere llevar!!");
                                                                                    for(int j=0 ; j<10 ; j++){
                                                                                                  int b=j+1;
                                                                                                  System.out.println("El producto "+b+"-"+this.Nombre[j]+" cuesta "+this.Precio[j]+" $");
                                                                                    }
                                                                                    System.out.println("11-Regresar");
                                                                                    System.out.println("----------------------------------------------------");
                                                                                    
                                                                                    cual = entrada.nextInt();

                                                                                                  switch (cual) {
                                                                                                                case 1:
                                                                                                                              if(this.ProductosDis[0]>0){
                                                                                                                                            this.ProductosDis[0] =this.ProductosDis[0]-1 ;
                                                                                                                                            this.Total=this.Total+this.Precio[0];
                                                                                                                                            this.cont=this.cont+1;
                                                                                                                              }else{
                                                                                                                                            System.out.println("Upps!, ya no contamos con este producto ");
                                                                                                                              }
                                                                                                                              break;
                                                                                                                case 2:
                                                                                                                              if(this.ProductosDis[1]>0){
                                                                                                                                            this.ProductosDis[1] =this.ProductosDis[1]-1 ;
                                                                                                                                            this.Total=this.Total+this.Precio[1];
                                                                                                                                            this.cont=this.cont+1;
                                                                                                                              }else{
                                                                                                                                            System.out.println("Upps!, ya no contamos con este producto ");
                                                                                                                              }
                                                                                                                              break;
                                                                                                                case 3:
                                                                                                                              if(this.ProductosDis[2]>0){
                                                                                                                                            this.ProductosDis[2] =this.ProductosDis[2]-1 ;
                                                                                                                                            this.Total=this.Total+this.Precio[2];
                                                                                                                                            cont=cont+1;
                                                                                                                              }else{
                                                                                                                                            System.out.println("Upps!, ya no contamos con este producto ");
                                                                                                                              }
                                                                                                                              break;
                                                                                                                case 4:
                                                                                                                              if(this.ProductosDis[3]>0){
                                                                                                                                            this.ProductosDis[3] =this.ProductosDis[3]-1 ;
                                                                                                                                            this.Total=this.Total+this.Precio[3];
                                                                                                                                            this.cont=this.cont+1;
                                                                                                                              }else{
                                                                                                                                            System.out.println("Upps!, ya no contamos con este producto ");
                                                                                                                              }
                                                                                                                              break;
                                                                                                                case 5:
                                                                                                                              if(this.ProductosDis[4]>0){
                                                                                                                                            this.ProductosDis[4] =this.ProductosDis[4]-1 ;
                                                                                                                                            this.Total=this.Total+this.Precio[4];
                                                                                                                                            this.cont=this.cont+1;
                                                                                                                              }else{
                                                                                                                                            System.out.println("Upps!, ya no contamos con este producto ");
                                                                                                                              }
                                                                                                                case 6:
                                                                                                                              if(this.ProductosDis[5]>0){
                                                                                                                                            this.ProductosDis[5] =this.ProductosDis[5]-1 ;
                                                                                                                                            this.Total=this.Total+this.Precio[5];
                                                                                                                                            this.cont=this.cont+1;
                                                                                                                              }else{
                                                                                                                                            System.out.println("Upps!, ya no contamos con este producto ");
                                                                                                                              }
                                                                                                                              break;
                                                                                                                case 7:
                                                                                                                              if(this.ProductosDis[6]>0){
                                                                                                                                            this.ProductosDis[6] =this.ProductosDis[6]-1 ;
                                                                                                                                            this.Total=this.Total+this.Precio[6];
                                                                                                                                            this.cont=this.cont+1;
                                                                                                                              }else{
                                                                                                                                            System.out.println("Upps!, ya no contamos con este producto ");
                                                                                                                              }
                                                                                                                              break;
                                                                                                                case 8:
                                                                                                                              if(this.ProductosDis[7]>0){
                                                                                                                                            this.ProductosDis[7] =this.ProductosDis[7]-1 ;
                                                                                                                                            this.Total=this.Total+this.Precio[7];
                                                                                                                                            this.cont=this.cont+1;
                                                                                                                              }else{
                                                                                                                                            System.out.println("Upps!, ya no contamos con este producto ");
                                                                                                                              }
                                                                                                                              break;
                                                                                                                case 9:
                                                                                                                              if(this.ProductosDis[8]>0){
                                                                                                                                            this.ProductosDis[8] =this.ProductosDis[8]-1 ;
                                                                                                                                            this.Total=this.Total+this.Precio[8];
                                                                                                                                            this.cont=this.cont+1;
                                                                                                                              }else{
                                                                                                                                            System.out.println("Upps!, ya no contamos con este producto ");
                                                                                                                              }
                                                                                                                              break;
                                                                                                                case 10:
                                                                                                                              if(this.ProductosDis[9]>0){
                                                                                                                                            this.ProductosDis[9] =this.ProductosDis[9]-1 ;
                                                                                                                                            this.Total=this.Total+this.Precio[9];
                                                                                                                                            this.cont=this.cont+1;;
                                                                                                                              }else{
                                                                                                                                            System.out.println("Upps!, ya no contamos con este producto ");
                                                                                                                              }
                                                                                                                              break;
                                                                                                  
                                                                                                                default:
                                                                                                                              break;
                                                                                                  }
                                                                                                  
                                                                      }while(cual!=11);
                                                        }catch(Exception e){
                                                                      System.out.println("Ingrese un numero valido!!");
                                                        }
                                                        break;
                                          case 2:
                                                        if(this.cont==0){
                                                                      System.out.println("No hay datos disponibles porque no haz comprado ningun producto!!");
                                                        }else{
                                                                      Tienda ap =new Tienda();
                                                                      ap.Datos();
                                                        }
                                                        break;

                                          default:
                                                        break;
                            }

              }
                                          public void Datos(){
                                                        Provedores[0]="VORTEX";
                                                        Provedores[1]="BOSE";
                                                        Provedores[2]="SAMSUMG";
                                                        Provedores[3]="PANASONIC";
                                                        Provedores[4]="HP";
                                                        Provedores[5]="SONIC";
                                                        Provedores[6]="MICROSOFT";
                                                        Provedores[7]="EASYTAO";
                                                        Provedores[8]="ARMITRON";
                                                        Provedores[9]="TEENO";

                                                        int promedio;
                                                        int mayor=0, menor=13000;
                                                        System.out.println("La cantidad a pagar es de: "+this.Total+"$$$$$");
                                                        promedio=this.Total/this.cont ;
                                                        System.out.println("El promedio es de: "+ promedio);
                                                                                    
                                                                                    for(int i=0 ; i<10 ; i++){
                                                                                                  int b=i+1;
                                                                                                  System.out.println("Del producto "+b+"-"+this.Nombre[i]+" quedan "+this.ProductosDis[i]+" ejemplares! del provedor "+ this.Provedores[i]);
                                                                                                  
                                                                                                  if(mayor<this.Precio[i]){
                                                                                                                mayor=this.Precio[i];
                                                                                                  }else if(menor>this.Precio[i]){
                                                                                                                menor=this.Precio[i];
                                                                                                  }
                                                                                    }
                                                                                    System.out.println("El producto mas costoso es: "+ mayor+ " y el mas barato: "+menor);
                                          }
}