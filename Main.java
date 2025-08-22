import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        System.out.println("Ingresa un número:");
        Scanner input = new Scanner(System.in);
        byte num = input.nextByte();
        if(num >= 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo.");
        }

        
    }
}