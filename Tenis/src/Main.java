import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    // Inicio del Juego
    Scanner sc = new Scanner(System.in);

    // Variables
    int[] A = new int [5];
    int[] B = new int [5];
    // Fin variables
 
    System.out.println("\nEmpecemos!");

    // Entradas A y B
    for (int i = 0; i < 5; i++) {
        System.out.print("Número de juegos ganados por A en el Set " + (i + 1) + ": ");
        A[i] = sc.nextInt();

        System.out.print("Número de juegos ganados por B en el Set " + (i + 1) + ": ");
        B[i] = sc.nextInt();
        System.out.println();
    }
    // Fin Entradas A y B


        // Inicio Bucle
        for (int i = 0; i < 5; i++) {
            System.out.println("\n--- Set" + (i + 1) + " ---");
            System.out.println(" Juegos Ganados");
            System.out.println("  A:" + A[i] + "    B:" + B[i]);

            // Conteo de Sets
            if (A[i]-2 == B[i]) {
                System.out.println("    Ganador: A");
            } else if (B[i]-2 == A[i]) {
                System.out.println("    Ganador: B");
            } else if (A[i]-1 == B[i] || B[i]-1 == A[i] || A[i] == B[i]) {
                System.out.println("Aún no termina, Empate a 7");
            } else if (B[i] == 7 && A[i] != 6 || A[i] == 7 && B[i] != 6 || A[i] > 7 || B[i] > 7) {
                System.out.println("    Inválido");
            }
            // Fin Conteo
        }// Fin Bucle
    }// Fin Juego
}
