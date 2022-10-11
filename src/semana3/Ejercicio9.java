package semana3;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner type5 = new Scanner(System.in);
        System.out.print("Introduzca una palabra: ");
        String palabra1 = type5.nextLine();
        System.out.print("Introduzca otra palabra: ");
        String palabra2 = type5.nextLine();
        if (palabra1.equals(palabra2)) {
            System.out.print("Ambas palabras son iguales.");
        } else {
            System.out.print("Son palabras distintas.");
        }
    }
}
