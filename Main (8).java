import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una contraseña: ");
        String c = sc.nextLine(); 
        // Se guarda la contraseña en la variable "c"

        boolean tieneNumero = false; // Variable para saber si la contraseña tiene al menos un número
        boolean tieneMayus = false;  // Variable para saber si la contraseña tiene al menos una mayúscula

        // Revisamos cada carácter de la contraseña
        for (int i = 0; i < c.length(); i++) {
            char ch = c.charAt(i);

            if (Character.isDigit(ch)) {
                tieneNumero = true; // Si el carácter es un número, se guarda true en tieneNumero
            }
            if (Character.isUpperCase(ch)) {
                tieneMayus = true; // Si el carácter es una mayúscula, se guarda true en tieneMayus
            }
        }

        // 1. Con if y else
        if (c.length() > 8 && tieneNumero && tieneMayus) {
            System.out.println("La contraseña es válida");
        } else {
            System.out.println("La contraseña no cumple los requisitos");
        }
        // Si se cumplen todas las condiciones, el mensaje será "La contraseña es válida".
        // De lo contrario, será "La contraseña no cumple los requisitos".

        // 2. Con else-if
        if (c.length() <= 8) {
            System.out.println("Debe tener más de 8 caracteres");
        } else if (!tieneNumero) {
            System.out.println("Debe tener al menos un número");
        } else if (!tieneMayus) {
            System.out.println("Debe tener al menos una mayúscula");
        } else {
            System.out.println("La contraseña es válida");
        }
        // Si alguna condición no se cumple, muestra el mensaje correspondiente.
        // De lo contrario, mostrará "La contraseña es válida".

        // 3. Con operador ternario
        String resultado = (c.length() > 8 && tieneNumero && tieneMayus) 
                            ? "La contraseña es válida" 
                            : "La contraseña no cumple los requisitos"; 
        // Si se cumplen todas las condiciones, el mensaje será "La contraseña es válida".
        // De lo contrario, el mensaje será "La contraseña no cumple los requisitos".
        System.out.println(resultado);

        sc.close(); 
    }
}
