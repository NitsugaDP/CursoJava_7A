import java.util.Scanner;

public class Prueba7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar los valores de las variables
        System.out.println("Ingrese el valor de la variable 1:");
        int variable1 = scanner.nextInt();

        System.out.println("Ingrese el valor de la variable 2:");
        int variable2 = scanner.nextInt();

        System.out.println("Ingrese el valor de la variable 3:");
        int variable3 = scanner.nextInt();

        // Encontrar la mayor variable
        int mayorVariable = variable1;  // Suponemos que la primera variable es la mayor

        if (variable2 > mayorVariable) {
            mayorVariable = variable2;  // Si la segunda variable es mayor, la actualizamos
        }

        if (variable3 > mayorVariable) {
            mayorVariable = variable3;  // Si la tercera variable es mayor, la actualizamos
        }

        // Imprimir la mayor variable
        System.out.println("La mayor variable es: " + mayorVariable);
    }
}
//En este caso, hemos agregado un objeto Scanner para leer la entrada del usuario. Mediante scanner.nextInt(), solicitamos al usuario ingresar los valores de las tres variables. Luego, el programa encuentra la mayor variable y la imprime.
