import java.util.Scanner;

class Persona {

String nombre;
int edad;
boolean estudiante;

public Persona(String nombre, int edad, boolean estudiante) {
    this.nombre = nombre;
    this.edad = edad;
    this.estudiante = estudiante;
    System.out.println("\n¡Nueva persona creada con éxito en la memoria!\n");
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


}

public class Main {
public static void main(String[] args) {

    Scanner lector = new Scanner(System.in);
    String inputNombre;
    int inputEdad;
    boolean inputEstudiante;

    System.out.print("Ingrese el nombre para el nuevo objeto: ");
    inputNombre = lector.nextLine();

    System.out.print("Ingrese la edad: ");
    inputEdad = lector.nextInt();
    lector.nextLine(); 

    System.out.print("¿Es estudiante? (true/false): ");
    inputEstudiante = lector.nextBoolean();
    lector.nextLine(); 

    Persona persona1 = new Persona(inputNombre, inputEdad, inputEstudiante); 

    System.out.println("\n--- Llamando a las habilidades del objeto ---");
    persona1.mostrarPresentacion();
    persona1.verificarEdad();

    lector.close();
    System.out.println("\nEjemplo POO finalizado.");
}


}
