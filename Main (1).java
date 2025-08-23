import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = sc.nextInt();
        //Se declara una variable de tipo númerica entera llamada "num" para que guarde el número del usuario"

        // 1. Con else-if
        if (num > 0) {
            System.out.println("El número es positivo.");
        } else if (num < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        //Se colocan dos condiciones, la primera: (num>0), la segunda: (num<0). Si se cumple la primera el mensaje almacenará "El número es positivo". Si se cumple la segunda almacenará "El número es negativo". De lo contrario almacenará "El número es cero."
        
        // 2. Con if y else
        if (num >= 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo.");
        }
        //Se coloca la condición: (num>=0). Si es verdadero, el mensaje almacenará "El número es positivo". De lo contrario almacenará "El número es negativo"
        
        // 3. Con operador ternario
        String resultado = (num >= 0) ? "El número es positivo." : "El número es negativo.";
        System.out.println(resultado);
        //Se coloca la condición: (num>=0). Si es verdadero, el mensaje almacenará "El número es positivo". De lo contrario almacenará "El número es negativo"
        sc.close();
    }
}
