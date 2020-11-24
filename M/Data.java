

import java.util.*;

   public class Data {

   Scanner entrada = new Scanner(System.in);

   String[] nom= new String[10];
   String[] id= new String[10];
   String puesto;
   int i;
   int Hd= 0;
   int Hn= 0;
   double Sb;
   double[] sueldo = new double[10];
   
   public void Base(){
   
   System.out.println("Bienvenido a la base de datos de la empresa");
   
   System.out.println("Ingresa los nombres de los trabajadores");
   
   
   for(i = 0; i < sueldo.length; i++){
      System.out.println("Nombre " + (i+1) +".");
      nom[i]=entrada.nextLine();
      }
      
      for(i = 0; i < sueldo.length; i++){
   System.out.println("Ingresa el id de los empleados");
      id[i]=entrada.nextLine();
      }
      
   System.out.println("Ingresa los salarios de los empleados segun el orden anterior recuerda 5000$ a empleados normales y 8000$ a supervisores ");
   for(i = 0; i < sueldo.length; i++){
   System.out.println(" ");
      System.out.println("Salario [" + (i+1) +"]");
      sueldo[i]=entrada.nextDouble();
   System.out.println("El sueldo corresponde a el empleado: " +nom[i]);
      
      if(sueldo[i]==5000){
      System.out.println("El puesto del empleado " +nom[i]+ " es empleado normal");      
      }else{
      if(sueldo[i]==8000){
         System.out.println("El puesto del empleado " +nom[i]+ " es supervisor");      
      }else{
         System.out.println("El salario no corresponde con ningun puestos por lo que se ha deducido que no perteneces a esta empresa");
      }   
      }
      }
   }
   
   public void Computador(){
   
   System.out.println("La suma de los salarios son ");
   for(i = 0; i < sueldo.length; i++){
      if(sueldo[i]==5000){
      System.out.println(" ");
      System.out.println("usuario " +id[i]+ " ingresa las horas diurnas que se trabajaron en esta quincena ");
      
      Hd= entrada.nextInt();
      
      System.out.println("usuario " +id[i]+ " ingresa las horas nocturnas que se trabajaron en esta quincena ");
      Hn= entrada.nextInt();
      
      Sb= (Hd*50)+(Hn*60)+5000;
      
      System.out.println("El salario total del " +nom[i]+ " es " +Sb);  
      System.out.println(" ");    
      
      
      }else{
      if(sueldo[i]==8000){
      System.out.println("El puesto del empleado " +nom[i]+ " es supervisor");      
      
      Sb=8000-(8000*0.001)-(8000*0.002)-(0.0016*8000);
      
      System.out.println("El salario del empleado " +id[i]+ " es " +Sb);         
         
      }
      }   
   }
   }
   }
