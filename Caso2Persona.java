package casos;

public class Caso2Persona {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Carlos", 20);
        Persona persona2 = new Persona("Ana", 22);

        System.out.println("CASO 2: Clase Persona");
        persona1.mostrarDatos();
        persona2.mostrarDatos();
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad);
    }
}
