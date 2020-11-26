import java.util.Scanner;

public class Empleado extends Persona{
              Scanner entrada= new Scanner(System.in);
              private int TipoEmpleo;
              private String p;

              public Empleado(int IdEmpleado, String NombreEmpleado, String Puesto, int[] SueldoQuincenal){
                            super(IdEmpleado, NombreEmpleado, Puesto, SueldoQuincenal);

              }

              public Empleado(){
                            super();
              }
              //sobre carga de constructores
              public void MiSalario(){
                            super.IdEmpleado=2020060346;
                            super.Puesto="Gerente";
                            int opcion=0;
                            do{  
                                          System.out.println("¿Que puesto ocupa?");
                                          String Puesto1=  entrada.nextLine();
                                          System.out.println("¡Escriba su ID de empleado!");
                                          int IdEmpleado1 = entrada.nextInt();
                                          
                                          if (Puesto1.equalsIgnoreCase(super.getPuesto())) {
                                                        int tipoEmpleado;
                                                        if(super.getIdEmpleado() == IdEmpleado1){ 
                                                                      do{           
                                                                                    System.out.println("Escriba el indice del tipo de empleado con el que se identifique!");
                                                                                    System.out.println("1-Empleado subordinado");
                                                                                    System.out.println("2-Empleado Supervisor");
                                                                                    System.out.println("3-Regresar");
                                                                                    
                                                                                    this.TipoEmpleo=entrada.nextInt();
                                                                                    switch (this.TipoEmpleo) {
                                                                                                  case 1:
                                                                                                                Empleado Sub=new Empleado();
                                                                                                                Sub.Subordinado();
                                                                                                                break;
                                                                                                  case 2:
                                                                                                                Empleado Sup=new Empleado();
                                                                                                                Sup.Supervisor();
                                                                                                                break;
                                                                                                  
                                                                                                  default:
                                                                                                                break;
                                                                                    }
                                                                      }while(this.TipoEmpleo!=3);

                                                        }
                                          }else {
                                                        System.out.println("El puesto o el id son incorrectos!!");
                                                        System.out.println("1-Volver a intentar");
                                                        System.out.println("2-Salir al menu!");
                                                        opcion=entrada.nextInt();
                                          }
                            }while(opcion!=2);
              }

              public void Subordinado(){
                            int Extra=0;
                            /*
                            super.SueldoQuincenal[0]=5000;
                            super.SueldoQuincenal[1]=50;
                            super.SueldoQuincenal[2]=60;
                            super.SueldoQuincenal[3]=0;
                            */
                            System.out.println("Cuantas dias ha trabajado???");
                            int Horas=entrada.nextInt();

                            Horas=Horas/15 ;
                            if(Horas>0){
                                          Horas=Horas*5000;
                            }

                            System.out.println("Ha trabajado horas extra??");
                            this.p = entrada.nextLine();
                            if(this.p.equalsIgnoreCase("Si")){
                                          System.out.println("Cuantas horas extra trabajo?" );
                                          Extra=entrada.nextInt();
                                          System.out.println("Las realizo en horario (diurna) o (nocturno) " );
                                          String q=entrada.nextLine();

                                          if(this.p.equalsIgnoreCase("Diurna")){
                                                        Extra=Extra*50;
                                          }else if(this.p.equalsIgnoreCase("Nocturno")){
                                                        Extra=Extra*60;
                                          }
                            }
                            Horas=Horas+Extra;

                            System.out.println("Su sueldo es de: "+ Horas);
                            System.out.println("----------------------");
              }

              public void Supervisor(){
                            int Extra=0;
                            /*
                            super.SueldoQuincenal[0]=8000;
                            super.SueldoQuincenal[1]=50;
                            super.SueldoQuincenal[2]=60;
                            super.SueldoQuincenal[3]=0;
                            */
                            System.out.println("Cuantas dias ha trabajado???");
                            Double Horas=entrada.nextDouble();
              

                            Horas=Horas/15 ;
                            if(Horas>0){
                                          Horas=Horas*8000;
                            }
                            
                            System.out.println("Ha trabajado horas extra?");
                            this.p=entrada.nextLine();
                            if(this.p.equalsIgnoreCase("Si")){
                                          System.out.println("Cuantas horas extra trabajo?" );
                                          Extra=entrada.nextInt();
                                          System.out.println("Las realizo en horario (diurna) o (nocturno) " );
                                          String q=entrada.nextLine();

                                          if(this.p.equalsIgnoreCase("Diurna")){
                                                        Extra=Extra*50;
                                          }else if(this.p.equalsIgnoreCase("Nocturno")){
                                                        Extra=Extra*60;
                                          }
                            }
                            
                            Horas=Horas*0.8*0.9*0.8;

                            System.out.println("Su sueldo es de: "+ Horas);
                            System.out.println("----------------------");
              }

}
