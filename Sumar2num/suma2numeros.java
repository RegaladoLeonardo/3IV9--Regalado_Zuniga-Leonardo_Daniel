import java.util.scanner;

class suma2numeros{

    //metodo principal

    public static void main(String[] args) {
        
        /*
        Vamos a crear un programa que se encargue de sumar 2 numeros y como tarea que sume "n" numeros
        */

        //necesitamos un objeto para poder leer los numeros
        Scanner entrada = new scanner(System.in); // objeto

        //variables
        int num1, num2, resultado;

        //luego necesito las instrucciones del programa
        System.out.println("Ingresa el primer numero a sumar :");
        num1 = entrada.nesxtInt();//leer el sigueinte entero
        System.out.println("Ingresa el segundo numero a sumar :");
        num2 = entrada.nesxtInt();//leer el sigueinte entero

        //Ahora se realiza la operacion
        resultado = num1 + num2 ;

        System.out.println("La suma de los numeros es de: " + resultado);
    }


}