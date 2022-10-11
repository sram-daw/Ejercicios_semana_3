package semana3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner type3 = new Scanner(System.in);
        System.out.print("Introduzca el primer valor: ");
        int valor1 = type3.nextInt();
        System.out.print("Introduzca el segundo valor: ");
        int valor2 = type3.nextInt();
        float modulo = valor1 % valor2;
        System.out.print("El resultado del módulo de " + valor1 + " y " + valor2 + " es igual a " + modulo);

    }
}
