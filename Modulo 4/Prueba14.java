import java.util.Scanner;

public class Prueba14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el puesto obtenido: ");
        int puesto = scanner.nextInt();

        switch (puesto) {
            case 1:
                System.out.println("¡Felicidades! Obtienes la medalla de oro.");
                break;
            case 2:
                System.out.println("¡Felicidades! Obtienes la medalla de plata.");
                break;
            case 3:
                System.out.println("¡Felicidades! Obtienes la medalla de bronce.");
                break;
            default:
                if (puesto > 0) {
                    System.out.println("Sigue participando.");
                } else {
                    System.out.println("Posición no válida.");
                }
                break;
        }
    }
}
//En este caso, hemos reemplazado la estructura if-else if-else con un switch. Los casos case 1, case 2 y case 3 corresponden a las posiciones premiadas y muestran el mensaje respectivo. El caso default se ejecutará cuando el puesto no coincida con ninguno de los casos anteriores. Dentro del caso default, se verifica si el puesto es mayor que 0, y en ese caso se muestra el mensaje "Sigue participando". Si el puesto es menor o igual a 0, se muestra el mensaje "Posición no válida".