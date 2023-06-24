import java.util.Scanner;

public class Torneo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el puesto obtenido: ");
        int puesto = scanner.nextInt();

        if (puesto == 1) {
            System.out.println("¡Felicidades! Obtienes la medalla de oro.");
        } else if (puesto == 2) {
            System.out.println("¡Felicidades! Obtienes la medalla de plata.");
        } else if (puesto == 3) {
            System.out.println("¡Felicidades! Obtienes la medalla de bronce.");
        } else if (puesto > 0) {
            System.out.println("Sigue participando.");
        } else {
            System.out.println("Posición no válida.");
        }
    }
}
//n este programa, se utiliza la clase Scanner para leer el puesto obtenido del usuario. Luego, se utiliza una estructura de control if-else para determinar qué mensaje imprimir en base al valor del puesto. Si el puesto es igual a 1, se muestra el mensaje de "medalla de oro". Si es igual a 2, se muestra el mensaje de "medalla de plata". Si es igual a 3, se muestra el mensaje de "medalla de bronce". En caso contrario, se muestra el mensaje de "siga participando".
//En este caso, se cambió la condición else if (puesto == 0) por else if (puesto > 0). De esta manera, si el puesto es mayor que 0 (positivo), se mostrará el mensaje "Sigue participando". Si el puesto es igual a 1, 2 o 3, se mostrará el mensaje correspondiente a la medalla obtenida. Si el puesto es menor o igual a 0, se mostrará el mensaje "Posición no válida".
