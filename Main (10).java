import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Ingresa tu saldo: ");
        int saldo = sc.nextInt(); // Guardamos el saldo ingresado por el usuario

        System.out.print("Ingresa la cantidad que quieres retirar: ");
        int retiro = sc.nextInt(); // Guardamos la cantidad que quiere retirar

        // 1. Con if y else
        if (retiro <= saldo) {
            System.out.println("Retiro exitoso");
        } else {
            System.out.println("Fondos insuficientes");
        }
        // Si la cantidad a retirar es menor o igual al saldo se muestra "Retiro exitoso" De lo contrario, se muestra "Fondos insuficientes".

        // 2. Con else-if
        if (retiro <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor que 0");
        } else if (retiro <= saldo) {
            System.out.println("Retiro exitoso");
        } else {
            System.out.println("Fondos insuficientes");
        }
        // Si el retiro es menor o igual a 0, se muestra "La cantidad a retirar debe ser mayor que 0".
        // Si el retiro es menor o igual al saldo, se muestra "Retiro exitoso". De lo contrario, se muestra "Fondos insuficientes".

        // 3. Con operador ternario
        String resultado = (retiro <= 0) 
                            ? "La cantidad a retirar debe ser mayor que 0"
                            : (retiro <= saldo) 
                                ? "Retiro exitoso" 
                                : "Fondos insuficientes";
        // Si retiro <= 0 se muestra "La cantidad a retirar debe ser mayor que 0".
        // Si retiro <= saldo  se muestra "Retiro exitoso". De lo contrario se muestra "Fondos insuficientes"
        
           System.out.println(resultado); 

        sc.close(); // 
    }
}
