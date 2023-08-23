import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Por favor Ingrese el numero dividendo: ");
        Double a = sc.nextDouble();
        System.out.println("Por favor Ingrese el numero divisor: ");
        Double b = sc.nextDouble();
        System.out.println("------------------------------------");

        // Division
        if (a % b == 0) {
            System.out.println("La division es exacta");
            System.out.println("Cociente: "+a/b);
            System.out.println("Residuo: "+a%b);
        } else if(b == 0) {
            System.out.println("Error!!!");
            System.out.println("No se puede dividir entre cero");
        } else {
            System.out.println("La division no es exacta");
            System.out.println("Cociente: "+a/b);
            System.out.println("Residuo: "+a%b);
        }
        System.out.println();
        // Fin Division
    }
}
