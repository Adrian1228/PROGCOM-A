import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
         //Se declara una variable de tipo númerica entera llamada "edad" para que guarde el número del usuario"
        
        // 1. Con else-if
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else if (edad < 18) {
            System.out.println("Eres menor de edad.");
        }
        //Se colocan dos condiciones, la primera: (edad >= 18), la segunda: (edad < 18). Si se cumple la primera el mensaje almacenará "Eres mayor de edad". Si se cumple la segunda almacenará "Eres menor de edad".
        
        // 2. Con if y else
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
        //Se coloca la condición: (edad >= 18). Si es verdadero, el mensaje almacenará "Eres mayor de edad". De lo contrario almacenará "Eres menor de edad"
        
        // 3. Con operador ternario
        String resultado = (edad >= 18) ? "Eres mayor de edad." : "Eres menor de edad.";
        System.out.println(resultado);
        //Se coloca la condición: (edad >= 18). Si es verdadero, el mensaje almacenará "Eres mayor de edad". De lo contrario almacenará "Eres menor de edad"
        sc.close();
    }
}
