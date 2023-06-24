import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Juego de Piedra, Papel o Tijera");
        System.out.println("Ingrese su opción (0: piedra, 1: papel, 2: tijera):");
        int opcionHumano = scanner.nextInt();
        
        int opcionMaquina = random.nextInt(3); // Genera un número aleatorio entre 0 y 2
        
        System.out.println("Competidor humano eligió: " + opcionHumano);
        System.out.println("Competidor máquina eligió: " + opcionMaquina);
        
        if (opcionHumano == 0 && opcionMaquina == 2) {
            System.out.println("¡Competidor humano gana!");
        } else if (opcionHumano == 1 && opcionMaquina == 0) {
            System.out.println("¡Competidor humano gana!");
        } else if (opcionHumano == 2 && opcionMaquina == 1) {
            System.out.println("¡Competidor humano gana!");
        } else if (opcionHumano == 2 && opcionMaquina == 0) {
            System.out.println("¡Competidor máquina gana!");
        } else if (opcionHumano == 0 && opcionMaquina == 1) {
            System.out.println("¡Competidor máquina gana!");
        } else if (opcionHumano == 1 && opcionMaquina == 2) {
            System.out.println("¡Competidor máquina gana!");
        } else {
            System.out.println("¡Empate!");
        }
    }
}
