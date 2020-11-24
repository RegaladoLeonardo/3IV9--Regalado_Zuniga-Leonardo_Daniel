import java.util.Scanner;

class Producto{
              Scanner entrada = new Scanner(System.in);
              private String NombreCliente ;
              private String[] Productos = new String[10];
              private int[] Costo = new int[10];
              private int[] ProductosExistente = new int[10];

              public void setProductos(String[] Productos){
                            this.Productos=Productos;
              }
              public void setCosto(int[] Costo){
                            this.Costo=Costo;
              }
              public void setProductos( int[] ProductoExistente){
                            this.ProductosExistente=ProductoExistente;
              }

              public String[] getProductos( ){
                            return Productos;
              }
              public int[] getCosto( ){
                            return Costo;
              }
              public int[] getProductosExistente( ){
                            return ProductosExistente;
              }

              public void Venta(){
                            
                            int op ;
                            String[] Provedores= new String[10];
                            System.out.println("Hola ingresa tu nombre");
                            NombreCliente=entrada.nextLine();
                            System.out.println("Bienvenido "+NombreCliente+"!!");
                            do{ 
                                          System.out.println("Que deseas hacer?");
                                          System.out.println("1-Anadir al carro");
                                          System.out.println("2-Pagar");
                                          System.out.println("3-Regresar al menu principal");

                                          op=entrada.nextInt();
                                          switch (op) {
                                                        case 1:
                                                                      Operacion f =new Operacion();
                                                                      f.PedirLibro();
                                                                      break;
                                          
                                                        case 2:

                                                                      break;

                                                        case 3:
                                                                      op=3;
                                                                      break;
                                                        default:
                                                                      break;
                                          }
                            }while(op!=3);
              }

}