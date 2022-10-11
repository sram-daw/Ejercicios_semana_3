package semana3;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner type9 = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 9: ");
        int factor = type9.nextInt();
        if (factor > 0 & factor <= 9) {
            System.out.print("Valor válido. Calculando... \n");
            for (int i = 1; i <= 9; i++) {
                System.out.println(factor + "*" + i + "=" + factor * i);
            }
        } else {
            System.out.print("El valor no es válido.");
        }
    }
}
