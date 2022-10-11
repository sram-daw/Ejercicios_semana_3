package semana3;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner type7 = new Scanner(System.in);
        System.out.print("Introduzca un valor: ");
        int valor8 = type7.nextInt();
        valor8++;
        System.out.println(valor8);
        System.out.print("Introduzca otro valor para multiplicarlo por " + valor8 + " :");
        int valor9 = type7.nextInt();
        int total = valor8 * valor9;
        System.out.print(valor8 + "*" + valor9 + "=" + total);
    }
}
