import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int num = sc.nextInt();
         //Se declara una variable de tipo númerica entera llamada "num" para que guarde el número del usuario"
        
        // 1) If y else
        if (num % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        //Se coloca la condición: (num % 2== 0). Si es verdadero, el mensaje almacenará "El número es par". De lo contrario almacenará "El número es impar"
        
        // 2) If - else if
        if (num % 2 == 0) {
            System.out.println("El número es par");
        } else if (num % 2 != 0) {
            System.out.println("El número es impar");
        }
        //Se colocan dos condiciones, la primera: (num % 2== 0), la segunda: (num % 2 != 0). Si se cumple la primera el mensaje almacenará "El número es par". Si se cumple la segunda almacenará "El número es impar".
        
        // 3) Operador ternario
        String resultado = (num % 2 == 0) ? "El número es par" : "El número es impar";
        System.out.println(resultado);
        //Se coloca la condición: (num % 2== 0). Si es verdadero, el mensaje almacenará "El número es par". De lo contrario almacenará "El número es impar"
        sc.close();
    }
}
