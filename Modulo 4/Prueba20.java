import java.util.Random;

public class Prueba20 {
    public static void main(String[] args) {
        Random random = new Random();
        int contador = 1;
        int numero;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        
        System.out.println("Generando 10 números aleatorios:");
        
        do {
            numero = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
            
            if (numero > maximo) {
                maximo = numero;
            }
            
            if (numero < minimo) {
                minimo = numero;
            }
            
            System.out.println("Número " + contador + ": " + numero);
            
            contador++;
        } while (contador <= 10);
        
        System.out.println("El máximo número generado es: " + maximo);
        System.out.println("El mínimo número generado es: " + minimo);
    }
}
