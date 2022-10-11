package semana3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner type2 = new Scanner(System.in);
        System.out.print("Introduzca el radio del círculo: ");
        int radio = type2.nextInt();
        final double PI = 3.1415;
        double area = PI * (radio * radio);
        System.out.println("El área es igual a " + area);
        double longitud = 2 * PI * radio;
        System.out.println("La longitud es igual a " + longitud);
    }
}
