import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    Scanner lector = new Scanner(System.in);
    String continuar = "si"; 

    System.out.println("--- DEMOSTRACIÓN DE BUCLE WHILE ---");
    
    while (continuar.equalsIgnoreCase("si")) { 
        
        System.out.print("Ingresa tu color favorito: ");
        String color = lector.nextLine(); 
        
        System.out.println("¡Qué bien! El color " + color + " es un excelente color.");
        
        System.out.print("\n¿Quieres ingresar otro color? (si/no): ");
        continuar = lector.nextLine();
    }
    
    System.out.println("\n--- DEMOSTRACIÓN DE BUCLE FOR ---");
    for (int i = 0; i < 3; i++) {
        System.out.println("Saludo número: " + (i + 1));
    }

    double estatura = 1.95; 
    double estaturaInicial = 1.75; 
    double limiteAtraccion = 1.80; 
    String nombre = "Sofía"; 
    String mensajeFinal = ""; 

    if (estatura != estaturaInicial) {
        
        double diferencia = Math.abs(estatura - estaturaInicial);
        String estado = (estatura > estaturaInicial) ? "aumentó" : "disminuyó";
        
        if (estatura >= limiteAtraccion) {
            mensajeFinal = nombre + " ha tenido variación y ¡SÍ puede subir!";
        } else {
            mensajeFinal = nombre + " ha tenido variación, pero aún NO puede subir.";
        }

    } else {
        mensajeFinal = nombre + " mantuvo su estatura.";
    }

    System.out.println("\n--- INFORME COMPUESTO (Lógica Anidada) ---");
    System.out.println(mensajeFinal);
    
    lector.close();
    System.out.println("\nEstructuras de Control Avanzadas finalizadas.");
}


}
