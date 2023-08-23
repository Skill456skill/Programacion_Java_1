import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Variables
    String caracter1="";
    String caracter2="";
    String caracter3="";
    String caracter4="";
    // Fin Var

    // Entrada
    System.out.println("Por favor ingrese un caracter: ");
    String entrada = sc.nextLine();
    // Fin entrd

        // Bucle y Condicional
        for (int i = 0; i < entrada.length(); i++) {

            int ascii = (int)entrada.charAt(i);

            // Numeros
            if (ascii >= 48 && ascii <= 57) {
                caracter1+= entrada.charAt(i);
            }
            // Mayusculas
            if (ascii >= 65 && ascii <= 90) {
                caracter2+= entrada.charAt(i);
            }
            // Minusculas             
            if (ascii >= 97 && ascii <= 122) {
                caracter3+= entrada.charAt(i);
            }
            // Caracteres especiales
            if (ascii >= 32 && ascii <= 47 || ascii >= 58 && ascii <= 64 || ascii >= 91 && ascii <= 96 || ascii >= 123 && ascii <= 127) {
                caracter4+= entrada.charAt(i);
            }
            
        }
        // Fin Bucle y Cond

    // Salida
    System.out.println("Caracter 1:"+caracter1);
    System.out.println("Caracter 2:"+caracter2);
    System.out.println("Caracter 3:"+caracter3);
    System.out.println("Caracter 4:"+caracter4);
    // Fin sald
    }
}

