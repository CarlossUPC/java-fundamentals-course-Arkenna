import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
                
        Scanner lector = new Scanner(System.in);
        String continuar = "si"; 

        while (continuar.equalsIgnoreCase("si")) { 
            System.out.println("\n--- INGRESO DE PERSONA ---");
            System.out.print("Ingresa tu edad: ");
            int edad = lector.nextInt(); 
            
            if (edad > 0) {
                if (edad >= 18) {
                    System.out.println("Resultado: ¡Mayor de edad y edad válida!");
                } else {
                    System.out.println("Resultado: Menor de edad.");
                }
            }
            
            lector.nextLine();
            System.out.print("\n¿Continuar? (si/no): ");
            continuar = lector.nextLine();
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Contador FOR: " + (i + 1));
        }
        
        lector.close();
        System.out.println("\nEstructuras de Control Avanzadas finalizadas. Pasamos a POO.");

        }
}
