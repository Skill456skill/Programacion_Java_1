import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nNota: Para numeros decimales usar ','\n");
        System.out.println("Por favor ingrese el lado a");
        double a = sc.nextDouble();
        System.out.println("Por favor ingrese el lado b");
        double b = sc.nextDouble();
        System.out.println("Por favor ingrese el lado c");
        double c = sc.nextDouble();

        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && b == c) {
                System.out.println("Triángulo equilátero");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triángulo isósceles");
            } else {
                System.out.println("Triángulo escaleno");
            }
        }  else {
            System.out.println("Triángulo inválido");
        }


    }
}