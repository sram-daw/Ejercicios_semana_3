package semana3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);
        System.out.print("Introduzca la base del rectángulo: ");
        int b = type.nextInt();
        System.out.print("Introduzca la altura del rectángulo: ");
        int h = type.nextInt();
        int a = b * h;
        System.out.println("El área del rectángulo con altura " + h + " y base " + b + " es igual a " + a + ".");

    }
}
