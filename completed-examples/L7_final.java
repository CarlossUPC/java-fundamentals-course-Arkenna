import java.util.Scanner;

class Persona {

private String nombre;
private int edad;
private boolean estudiante;

public Persona(String nombre, int edad, boolean estudiante) {
    this.nombre = nombre;
    this.edad = edad;
    this.estudiante = estudiante;
    System.out.println("\n¡Nueva persona creada con éxito!\n");
}

public void mostrarPresentacion() {
    System.out.println("--- Tarjeta de Presentación ---");
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Edad: " + this.edad + " años");
    String estadoEstudiante = this.estudiante ? "Sí" : "No"; 
    System.out.println("¿Es Estudiante?: " + estadoEstudiante);
}

public void verificarEdad() {
    System.out.println("--- Verificación de Edad ---");
    if (this.edad >= 18) {
        System.out.println(this.nombre + ", el sistema te identifica como: ¡Mayor de edad!");
    } else {
        System.out.println(this.nombre + ", el sistema te identifica como: Menor de edad.");
    }
}

public String getNombre() {
    return this.nombre;
}
public int getEdad() {
    return this.edad;
}

public void setEdad(int nuevaEdad) {
    if (nuevaEdad > 0 && nuevaEdad < 120) { 
        this.edad = nuevaEdad;
    } else {
        System.out.println("¡Error! Edad inválida. No se actualizó el valor.");
    }
}


}

public class Main {
public static void main(String[] args) {

    Scanner lector = new Scanner(System.in);
    String inputNombre = "Ana"; 
    int inputEdad = 17;
    boolean inputEstudiante = true;

    System.out.println("=== Simulando entrada de datos para la demostración de Encapsulación ===");

    Persona persona1 = new Persona(inputNombre, inputEdad, inputEstudiante); 

    System.out.println("\n--- DEMOSTRACIÓN DE ENCAPSULACIÓN ---");
    System.out.println("Intento de acceso directo (persona1.edad) fallaría.");

    System.out.println("\n--- USANDO SETTER PARA CUMPLIR 18 AÑOS ---");
    int edadCumplida = 18;
    persona1.setEdad(edadCumplida);

    System.out.println("Lectura con GETTER: La nueva edad es " + persona1.getEdad());
    persona1.verificarEdad();

    lector.close();
    System.out.println("\n¡Código protegido y seguro con Encapsulación!");
}


}
