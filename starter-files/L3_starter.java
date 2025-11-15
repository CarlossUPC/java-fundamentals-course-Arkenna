public class Main {
    public static void main(String[] args) {
        
        String nombre = "Sofía";
        int edad = 16;
        double estatura = 1.75;
        boolean esEstudiante = true;
        
        System.out.println("--- Tarjeta Inicial ---");
        System.out.println("Hola, mi nombre es: " + nombre);
        System.out.println("Tengo: " + edad + " años");
        System.out.println("Mi estatura es: " + estatura + " metros");
        System.out.println("Estudiante: " + esEstudiante);
        
        int aumentoEdad = 4;
        edad = edad + aumentoEdad; 
        esEstudiante = false;
        
        double aumEstatura = 0.20;
        estatura = estatura + aumEstatura;
        
        System.out.println("\n--- 4 AÑOS DESPUÉS ---");
        System.out.println("Nueva Edad: " + edad);
        System.out.println("¿Sigue siendo estudiante? " + esEstudiante);
        
        String mensajeFinal = "Alcanzó la estatura de " + estatura + " metros.";
        System.out.println(mensajeFinal);
        
    }
}
