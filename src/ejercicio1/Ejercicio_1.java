package ejercicio1;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {

        // Se declara un arreglo para almacenar los valores de 5 números enteros.
        int tamañoArreglo = 5;
        float numero[] = new float[tamañoArreglo];
        float suma = 0;
        float promedio;

        // Usamos Scanner para leer los valores del usuario desde consola.
        Scanner sc = new Scanner(System.in);

        // Ciclo for para rellenar el arreglo.
        for (int i = 0; i < tamañoArreglo; i++){
            System.out.print("Ingrese un número para el arreglo en la posición " + (i+1) + " : ");
            numero[i] = sc.nextFloat();
            suma += numero[i];

        }
        promedio = suma / tamañoArreglo;
        System.out.println("La suma de los números ingresados es: " + suma);
        System.out.println("El promedio de los números ingresados es: " + promedio);
    }
}