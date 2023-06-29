//puede un competidor ser una maquina o solo debe ser una persona?

//Sí, es posible tener un competidor que sea una máquina en el juego de piedra, papel o tijera. En ese caso, en lugar de solicitar la opción al competidor a través de la entrada del usuario, puedes generar la opción de la máquina de forma aleatoria utilizando la clase Random de Java.

import java.util.Random;
import java.util.Scanner;

public class Prueba8dos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Juego de Piedra, Papel o Tijera");
        System.out.println("Ingrese su opción (0: piedra, 1: papel, 2: tijera):");
        int opcion = scanner.nextInt();
        
        int opcionMaquina = random.nextInt(3); // Genera un número aleatorio entre 0 y 2
        
        System.out.println("Competidor 1 eligió: " + opcion);
        System.out.println("Competidor 2 (máquina) eligió: " + opcionMaquina);
        
        if ((opcion == 0 && opcionMaquina == 2) || (opcion == 1 && opcionMaquina == 0) || (opcion == 2 && opcionMaquina == 1)) {
            System.out.println("¡Competidor 1 gana!");
        } else if ((opcion == 2 && opcionMaquina == 0) || (opcion == 0 && opcionMaquina == 1) || (opcion == 1 && opcionMaquina == 2)) {
            System.out.println("¡Competidor 2 (máquina) gana!");
        } else {
            System.out.println("¡Empate!");
        }
    }
}//En este caso, la opción del competidor 1 se obtiene a través de la entrada del usuario, mientras que la opción del competidor 2 (la máquina) se genera aleatoriamente mediante random.nextInt(3), que genera un número entero aleatorio entre 0 y 2.
