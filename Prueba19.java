import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        // Inicializar variables
        int contador = 1;
        int suma = 0;
        double promedio;
        
        // Crear objeto Random
        Random random = new Random();
        
        // Ciclo while para generar y mostrar los números aleatorios
        while (contador <= 10) {
            int numero = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
            System.out.println("Número " + contador + ": " + numero);
            
            suma += numero; // Sumar el número al acumulador de la suma
            
            contador++; // Incrementar el contador
        }
        
        // Calcular el promedio
        promedio = (double) suma / 10;
        
        // Mostrar la suma y el promedio
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
