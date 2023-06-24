import java.util.Scanner;

public class VerificarVocal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un carácter: ");
        String input = scanner.nextLine();

        // Validar que se ingrese solo un carácter
        if (input.length() != 1) {
            System.out.println("Error: Debes ingresar solo un carácter.");
            return; // Salir del programa si la entrada no es válida
        }

        char caracter = input.charAt(0);

        // Verificar si el carácter es una vocal utilizando el operador lógico "or"
        boolean esVocal = (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u');

        if (esVocal) {
            System.out.println("El carácter " + caracter + " es una vocal.");
        } else {
            System.out.println("El carácter " + caracter + " no es una vocal.");
        }
    }
}
//En esta versión, se utiliza scanner.nextLine() para leer la entrada del usuario como una cadena de caracteres en lugar de un solo carácter. Luego, se verifica si la longitud de la cadena es diferente de 1, lo que indica que se ingresaron más de un carácter. En ese caso, se muestra un mensaje de error y se sale del programa.

//Si la longitud de la cadena es 1, se extrae el primer carácter utilizando input.charAt(0). A continuación, se realiza la verificación si es una vocal de la misma manera que en el ejemplo anterior.