import java.util.Scanner;

public class Puesto{
              Scanner entrada = new Scanner(System.in);
              private String NombreCliente ;
              private String[] Productos = new String[10];
              private int[] Costo = new int[10];
              private int[] ProductoExistente = new int[10];

              public void setMercancia(String[] Productos, int[] Costo, int[] ProductoExistente){
                            this.Productos= Productos ;
                            this.Costo= Costo ;
                            this.ProductoExistente= ProductoExistente ;
              }

              public String[] getProductos(){
                            return Productos ;
              }
              public int[] getCosto(){
                            return Costo;
              }
              public int[] getProductosExistentes(){
                            return ProductoExistente;
              }

              public void Local(){
                            Tienda pedido= new Tienda();
                            int op,pro,total=0 ;
                            String[] Provedores= new String[10];
                            System.out.println("Hola ingresa tu nombre");
                            NombreCliente=entrada.nextLine();
                            System.out.println("Bienvenido "+NombreCliente+"!!");

                                                                                                     //menu ???????????
                                          do{ 
                                                        System.out.println("Que deseas hacer?");
                                                        System.out.println("1-Anadir al carro");
                                                        System.out.println("2-Consulta de la compra y productos");
                                                        System.out.println("3-Regresar al menu principal");
                                                        op=entrada.nextInt();
                                                                      

                                                        pedido.IntercambioLibro(op);
                                          }while(op!=3);
                                                        
              }
}