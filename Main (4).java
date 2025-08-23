import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la calificación (0-100): ");
        int n = sc.nextInt();
        //Se declara una variable de tipo númerica entera llamada "n" para que guarde el número del usuario"
        
        // 1. Con if y else
        if (n >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
        //Se coloca la condición: (n >= 60). Si es verdadero, el mensaje almacenará "Aprobado". De lo contrario almacenará "Reprobado"
        
        // 2. Con else-if
        if (n >= 60) {
            System.out.println("Aprobado");
        } else if (n < 60) {
            System.out.println("Reprobado");
        }
        //Se colocan dos condiciones, la primera: (n >= 60), la segunda: (n < 60). Si se cumple la primera el mensaje almacenará "Aprobado". Si se cumple la segunda almacenará "Reprobado"
        
        // 3. Con operador ternario
        String resultado = (n >= 60) ? "Aprobado" : "Reprobado";
        System.out.println(resultado);
        //Se coloca la condición: (n >= 60). Si es verdadero, el mensaje almacenará "Aprobado". De lo contrario almacenará "Reprobado"
        sc.close();
    }
}
