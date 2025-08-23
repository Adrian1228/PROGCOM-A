import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int a = sc.nextInt();

        System.out.print("Ingresa otro número: ");
        int b = sc.nextInt();

        System.out.print("Ingresa otro número: ");
        int c = sc.nextInt();
        //Se declaran tres variables de tipo númerica entera llamadas "a", "b" y "c" para que guarden los números del usuario"
        
        // 1. Con if y else
        if (a >= b && a >= c) {
            System.out.println("El mayor es: " + a);
        } else {
            if (b >= a && b >= c) {
                System.out.println("El mayor es: " + b);
            } else {
                System.out.println("El mayor es: " + c);
            }
        }
        //Se colocan dos condiciones, la primera: (a >= b && a >= c), la segunda: (b >= a && b >= c). Si se cumple la primera el mensaje almacenará ("El mayor es: " + a). Si se cumple la segunda almacenará ("El mayor es: " + b). De lo contrario, almacenará ("El mayor es: " + c)
        
        // 2. Con else-if
        if (a >= b && a >= c) {
            System.out.println("El mayor es: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("El mayor es: " + b);
        } else {
            System.out.println("El mayor es: " + c);
        }
        //Se colocan dos condiciones, la primera: (a >= b && a >= c), la segunda: (b >= a && b >= c). Si se cumple la primera el mensaje almacenará ("El mayor es: " + a). Si se cumple la segunda almacenará ("El mayor es: " + b). De lo contrario, almacenará ("El mayor es: " + c)
        
        // 3. Con operador ternario
        int mayor = (a >= b && a >= c) ? a : (b >= c ? b : c);
        System.out.println("El mayor es: " + mayor);
        //Se colocan dos condiciones, la primera: (a >= b && a >= c), la segunda: (b >= a && b >= c). Cuando se cumpla la condición, el mensaje almacenará ("El mayor es: " + mayor)
        sc.close();
    }
}
