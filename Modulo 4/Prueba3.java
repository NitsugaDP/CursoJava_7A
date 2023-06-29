import java.util.Scanner;

public class Prueba3 {
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
        if (nombreMes.equals("enero") || nombreMes.equals("marzo") || nombreMes.equals("mayo") ||
                nombreMes.equals("julio") || nombreMes.equals("agosto") || nombreMes.equals("octubre") ||
                nombreMes.equals("diciembre")) {
            return 31;
        } else if (nombreMes.equals("febrero")) {
            return 28;
        } else if (nombreMes.equals("abril") || nombreMes.equals("junio") || nombreMes.equals("septiembre") ||
                nombreMes.equals("noviembre")) {
            return 30;
        } else {
            return -1; // Valor de retorno para indicar que el nombre del mes es inválido
        }
    }
}
//En esta versión, la función obtenerCantidadDias utiliza estructuras if para verificar el nombre del mes y devolver la cantidad correspondiente de días. Se utiliza el método equals para comparar las cadenas de caracteres en lugar del switch.