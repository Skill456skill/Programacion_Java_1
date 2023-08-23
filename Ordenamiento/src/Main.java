import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    // Entrada
    System.out.println("Por favor ingrese la cantidad");
    int cant = sc.nextInt();
    System.out.println();
    // Fin Entrad

    // Variables
    int[] num = new int[cant];
    // Fin Var

        // Asignacion de numeros
        for (int i = 0; i < cant; i++) {
            System.out.println("Numero "+(i+1)+":");
            num[i] = sc.nextInt();


        }
        // Fin Asignacion

    // Ordenar Numeros
    Arrays.sort(num);
    // Fin orden

    // Salida
    System.out.println("Numeros Ordenados: ");
    for (int i = 0; i < num.length; i++) {
        System.out.print(num[i]+" ");
    }
    System.out.println();
    // Fin Salida
    }
}
