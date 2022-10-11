package semana3;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner type8 = new Scanner(System.in);
        System.out.print("Introduzca su edad: ");
        int edad = type8.nextInt();
        int permiso = 18;
        //System.out.print(edad>=permiso); Primera opción
        boolean mayoredad = edad >= permiso ? true : false;
        System.out.println(mayoredad);
    }
}
