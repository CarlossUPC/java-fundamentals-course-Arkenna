public class Main {
public static void main(String[] args) {

    String nombre = "Sofía";
    int edad = 20; 
    double estatura = 1.95; 
    
    double limiteAtraccion = 1.80; 
    
    if (edad >= 18) {
    	System.out.println("--- RESULTADO DE EDAD ---");
    	System.out.println("¡Eres mayor de edad!");
    } else {
    	System.out.println("--- RESULTADO DE EDAD ---");
    	System.out.println("Es menor de edad.");
    }

    if (estatura > limiteAtraccion) {
        System.out.println("--- RESULTADO DE ESTATURA ---");
        System.out.println(nombre + " mide " + estatura + "m. ¡Puede subir a la atracción!");
    } else {
        System.out.println("--- RESULTADO DE ESTATURA ---");
        System.out.println(nombre + " mide " + estatura + "m. Debe esperar a crecer más.");
    }
    
    String mensajeFinal = "Alcanzó la estatura de " + estatura + " metros.";
    System.out.println("\n" + mensajeFinal);
    
}


}
