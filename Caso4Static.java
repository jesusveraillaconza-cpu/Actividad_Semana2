package casos;

public class Caso4Static {

    public static void main(String[] args) {
        System.out.println("CASO 4: Uso de static");

        new Contador();
        new Contador();
        new Contador();

        System.out.println("Objetos creados: " + Contador.getContador());
    }
}

class Contador {
    private static int contador = 0;

    public Contador() {
        contador++;
    }

    public static int getContador() {
        return contador;
    }
}
