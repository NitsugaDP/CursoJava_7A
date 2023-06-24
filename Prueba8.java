import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Juego de Piedra, Papel o Tijera");
        System.out.println("Ingrese la opción del competidor 1 (0: piedra, 1: papel, 2: tijera):");
        int competidor1 = scanner.nextInt();
        
        System.out.println("Ingrese la opción del competidor 2 (0: piedra, 1: papel, 2: tijera):");
        int competidor2 = scanner.nextInt();
        
        if ((competidor1 == 0 && competidor2 == 2) || (competidor1 == 1 && competidor2 == 0) || (competidor1 == 2 && competidor2 == 1)) {
            System.out.println("¡Competidor 1 gana!");
        } else if ((competidor1 == 2 && competidor2 == 0) || (competidor1 == 0 && competidor2 == 1) || (competidor1 == 1 && competidor2 == 2)) {
            System.out.println("¡Competidor 2 gana!");
        } else {
            System.out.println("¡Empate!");
        }
    }
}

