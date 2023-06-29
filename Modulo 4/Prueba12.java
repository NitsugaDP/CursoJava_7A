import java.util.Scanner;

public class Prueba12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Utilizando operadores lógicos AND
        if (numero >= 1 && numero <= 12) {
            System.out.println("El número " + numero + " pertenece a la primer docena.");
        } else if (numero >= 13 && numero <= 24) {
            System.out.println("El número " + numero + " pertenece a la segunda docena.");
        } else if (numero >= 25 && numero <= 36) {
            System.out.println("El número " + numero + " pertenece a la tercera docena.");
        } else {
            System.out.println("El número " + numero + " está fuera de rango.");
        }

        // Utilizando operadores lógicos OR
        if ((numero >= 1 && numero <= 12) || (numero >= 13 && numero <= 24) || (numero >= 25 && numero <= 36)) {
            if (numero >= 1 && numero <= 12) {
                System.out.println("El número " + numero + " pertenece a la primer docena.");
            } else if (numero >= 13 && numero <= 24) {
                System.out.println("El número " + numero + " pertenece a la segunda docena.");
            } else {
                System.out.println("El número " + numero + " pertenece a la tercera docena.");
            }
        } else {
            System.out.println("El número " + numero + " está fuera de rango.");
        }
    }
}
//En este programa, solicitamos al usuario que ingrese un número. Luego, utilizando operadores lógicos "and" y "or", verificamos si el número se encuentra dentro de los rangos de la primer docena, segunda docena o tercera docena. Si el número está fuera de estos rangos, se muestra un mensaje indicando que está fuera de rango.