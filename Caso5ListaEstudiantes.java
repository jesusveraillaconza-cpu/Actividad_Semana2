package casos;

import java.util.ArrayList;
import java.util.Scanner;

public class Caso5ListaEstudiantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<>();

        System.out.println("CASO 5: Lista de estudiantes");

        try {
            System.out.print("Cuantos estudiantes desea ingresar?: ");
            int cantidad = Integer.parseInt(scanner.nextLine());

            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor que cero.");
            } else {
                for (int i = 1; i <= cantidad; i++) {
                    System.out.print("Ingrese el nombre del estudiante " + i + ": ");
                    String nombre = scanner.nextLine().trim();

                    if (nombre.isEmpty()) {
                        System.out.println("Nombre invalido. Se registrara como Sin nombre.");
                        nombre = "Sin nombre";
                    }

                    estudiantes.add(nombre);
                }

                System.out.println("\nLista completa de estudiantes:");
                for (String estudiante : estudiantes) {
                    System.out.println("- " + estudiante);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: debe ingresar un numero entero valido.");
        } finally {
            scanner.close();
        }
    }
}
