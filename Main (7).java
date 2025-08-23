import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un año: ");
        int a = sc.nextInt();
        //Se declara una variable de tipo númerica entera llamada "a" para que guarde los números del usuario"
        
        // 1. Con if y else
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
        //Se colocan dos condiciones, la primera: (a % 4 == 0 && a % 100 != 0), la segunda: a % 400 == 0). Si se cumple cualquiera de las dos el mensaje almacenará "Es bisiesto". De lo contrario almacenará "No es bisiesto" 
        if (a % 400 == 0) {
            System.out.println("Es bisiesto");
        } else if (a % 100 == 0) {
            System.out.println("No es bisiesto");
        } else if (a % 4 == 0) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
        //Se colocan tres condiciones, la primera: (a % 400 == 0), la segunda: (a % 100 == 0), la tercera:(a % 4 == 0). Si se cumple la primera el mensaje almacenará "Es bisiesto". Si se cumple la segunda almacenará "No es bisiesto". Si se cumple la tercera almacenará "Es bisiesto". De lo contrario almacenará "No es bisiesto"
        
        // 3. Con operador ternario
        String resultado = ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) 
                           ? "Es bisiesto" 
                           : "No es bisiesto";
        System.out.println(resultado);
         //Se colocan dos condiciones, la primera: (a % 4 == 0 && a % 100 != 0), la segunda: a % 400 == 0). Si se cumple cualquiera de las dos el mensaje almacenará "Es bisiesto". De lo contrario almacenará "No es bisiesto" 
        sc.close();
    }
}
