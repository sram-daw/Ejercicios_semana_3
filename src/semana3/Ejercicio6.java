package semana3;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner type3 = new Scanner(System.in);
        System.out.print("Introduzca su nombre: ");
        String nombre = type3.nextLine();
        System.out.print("Introduzca su localidad: ");
        String localidad = type3.nextLine();
        System.out.print("Introduzca una afición: ");
        String gusto = type3.nextLine();
        System.out.println("Hola, mi nombre es " + nombre + ".\nSoy de " + localidad + " y me gusta " + gusto + ".");
    }
}
