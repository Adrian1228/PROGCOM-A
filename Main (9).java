import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt(); 
        // Se guarda el número en la variable "n"

        // 1. Con if - else if - else
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
        // Si el número es divisible entre 3 y 5, muestra "FizzBuzz".
        // Si solo es divisible entre 3, muestra "Fizz".
        // Si solo es divisible entre 5, muestra "Buzz". De lo contrario, muestra el mismo número.

        // 2. Con operador ternario
        String resultado = (n % 3 == 0 && n % 5 == 0) 
                            ? "FizzBuzz" 
                            : (n % 3 == 0) 
                                ? "Fizz" 
                                : (n % 5 == 0) 
                                    ? "Buzz" 
                                    : String.valueOf(n);
        // Si el número es divisible entre 3 y 5, el mensaje será "FizzBuzz".
        // Si solo es divisible entre 3, el mensaje será "Fizz".
        // Si solo es divisible entre 5, el mensaje será "Buzz". De lo contrario, muestra el mismo número.

        System.out.println(resultado);

        sc.close(); 
    }
}
