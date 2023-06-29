import java.util.Scanner;

public class Prueba6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de curso: ");
        int curso = scanner.nextInt();

        if (curso == 0) {
            System.out.println("Jardín de infantes");
        } else if (curso >= 1 && curso <= 6) {
            System.out.println("Primaria");
        } else if (curso >= 7 && curso <= 12) {
            System.out.println("Secundaria");
        } else {
            System.out.println("El número de curso proporcionado no es válido");
        }
    }
}
//En esta versión, hemos agregado la clase Scanner para permitir la entrada de datos desde el usuario. Utilizamos scanner.nextInt() para leer un número entero ingresado por el usuario y almacenarlo en la variable curso. Luego, el programa evaluará el valor de curso y mostrará el texto correspondiente según las condiciones especificadas en el enunciado.
