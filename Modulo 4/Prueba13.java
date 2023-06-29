import java.util.Scanner;

public class Prueba13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del mes (en minúsculas): ");
        String nombreMes = scanner.nextLine();

        int dias = obtenerCantidadDias(nombreMes);
        if (dias != -1) {
            System.out.println("El mes de " + nombreMes + " tiene " + dias + " días.");
        } else {
            System.out.println("El nombre del mes ingresado es inválido.");
        }
    }

    public static int obtenerCantidadDias(String nombreMes) {
        switch (nombreMes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                return 31;
            case "febrero":
                return 28;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                return 30;
            default:
                return -1; // Valor de retorno para indicar que el nombre del mes es inválido
        }
    }
}
//Este programa solicita al usuario que ingrese el nombre del mes en minúsculas y luego utiliza la función obtenerCantidadDias para determinar la cantidad de días correspondiente a ese mes. La función utiliza una declaración switch para asign