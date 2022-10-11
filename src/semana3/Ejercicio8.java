package semana3;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner type4 = new Scanner(System.in);
        System.out.print("Introduzca un valor: ");
        int valor3 = type4.nextInt();
        System.out.print("Introduzca el segundo valor: ");
        int valor4 = type4.nextInt();
        if (valor3 == valor4) {
            System.out.print(valor3 + " es igual a " + valor4);
        } else {
            System.out.print(valor3 + " no es igual a " + valor4);
        }
    }
}
