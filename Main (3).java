import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int n1 = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int n2 = sc.nextInt();
        //Se declaran dos variables de tipo númericas enteras llamadas "n1" y "n2" para que guarden el número del usuario"
        
        // 1. Con if y else
        if (n1 > n2) {
            System.out.println("El mayor es: " + n1);
        } else {
            System.out.println("El mayor es: " + n2);
        }
        //Se coloca la condición: (n1 > n2). Si es verdadero, el mensaje almacenará ("El mayor es: " + n1) De lo contrario almacenará ("El mayor es: " + n2)
        
        // 2. Con else-if
        if (n1 > n2) {
            System.out.println("El mayor es: " + n1);
        } else if (n2 > n1) {
            System.out.println("El mayor es: " + n2);
        } else {
            System.out.println("Los dos números son iguales.");
        }
         //Se colocan dos condiciones, la primera: (n1 > n2), la segunda: (n1 > n2). Si se cumple la primera el mensaje almacenará ("El mayor es: " + n1). Si se cumple la segunda almacenará ("El mayor es: " + n2). De lo contrario, almacenará "Los dos números son iguales." 
        
        // 3. Con operador ternario
        String resultado = (n1 > n2) ? 
            "El mayor es: " + n1 : 
            (n2 > n1 ? "El mayor es: " + n2 : "Los dos números son iguales.");
        System.out.println(resultado);
        //Se colocan dos condiciones, la primera: (n1 > n2), la segunda: (n1 > n2). Si se cumple la primera el mensaje almacenará ("El mayor es: " + n1). Si se cumple la segunda almacenará ("El mayor es: " + n2). De lo contrario, almacenará "Los dos números son iguales." 
        sc.close();
    }
}
