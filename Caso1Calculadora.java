// Mejora realizada en la rama rama-mejoras
package casos;

import java.util.Scanner;

public class Caso1Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CASO 1: Calculadora basica");
        System.out.print("Ingrese el primer numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Seleccione una operacion:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.print("Opcion: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + sumar(numero1, numero2));
                break;
            case 2:
                System.out.println("Resultado: " + restar(numero1, numero2));
                break;
            case 3:
                System.out.println("Resultado: " + multiplicar(numero1, numero2));
                break;
            case 4:
                if (numero2 == 0) {
                    System.out.println("Error: no se puede dividir entre cero.");
                } else {
                    System.out.println("Resultado: " + dividir(numero1, numero2));
                }
                break;
            default:
                System.out.println("Opcion invalida.");
                break;
        }

        scanner.close();
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}
