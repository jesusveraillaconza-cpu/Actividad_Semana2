package casos;

public class Caso3Sobrecarga {

    public static void main(String[] args) {
        Operacion operacion = new Operacion();

        System.out.println("CASO 3: Sobrecarga de metodos");
        System.out.println("Suma de 2 enteros: " + operacion.sumar(10, 5));
        System.out.println("Suma de 2 decimales: " + operacion.sumar(8.5, 3.2));
        System.out.println("Suma de 3 enteros: " + operacion.sumar(4, 6, 9));
    }
}

class Operacion {

    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
}
