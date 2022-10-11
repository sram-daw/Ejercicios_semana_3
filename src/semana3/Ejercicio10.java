package semana3;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner type6 = new Scanner(System.in);
        System.out.print("Introduzca el primer valor: ");
        int valor5 = type6.nextInt();
        System.out.print("Introduzca el segundo valor: ");
        int valor6 = type6.nextInt();
        System.out.print("Introduzca el tercer valor: ");
        int valor7 = type6.nextInt();
        if (valor5 == valor6 | valor5 == valor7 | valor6 == valor7) {
            if (valor5 == valor6 & valor6 == valor7) {
                System.out.print("Todos los valores son iguales.");
            } else {
                System.out.print("Dos valores son iguales.");
            }
        } else {
            System.out.print("Ningún valor es igual.");
        }
    }
}
