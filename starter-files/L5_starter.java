import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        String nombre;
        int edad;
        
        System.out.print("Escribe tu nombre: ");
        nombre = lector.nextLine(); 
        
        System.out.print("Escribe tu edad: ");
        edad = lector.nextInt(); 
        
        lector.nextLine(); 
        
        System.out.println("\n--- Decisión ---");
        if (edad >= 18) {
            System.out.println(nombre + ", el sistema te identifica como: ¡Mayor de edad!");
        } else {
            System.out.println(nombre + ", el sistema te identifica como: Menor de edad.");
        }
        
        lector.close();
        
        System.out.println("Ejemplo interactivo finalizado.");

    }
}
