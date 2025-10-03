// Ejercicio 2: Cantidad y Porcentaje de apariciones de un número.

package ejercicio2;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        // Se usa Scanner para poder recibir datos del usuario desde teclado.
        Scanner sc = new Scanner(System.in);

        // Se declara un arreglo para almacenar los valores de 10 números enteros.
        int cantidadNumeros = 10;
        int[] numeros = new int[cantidadNumeros];

        // Ciclo for para rellenar el arreglo.
        for (int i = 0; i < cantidadNumeros; i++){
            System.out.print("Ingrese un numero para la posición " + (i+1) + " : ");
            numeros[i] = sc.nextInt();
        }

        // For para imprimir los valores del arreglo.
        for (int i = 0; i < cantidadNumeros; i++){
            System.out.print("\nEl valor en la posición " + (i+1) + " es: " + numeros[i]);
        }
    }
}
