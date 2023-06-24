import java.util.Scanner;

public class TablaMultiplicarSumaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        int sumaPares = 0;

        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);

            if (resultado % 2 == 0) {
                sumaPares += resultado;
            }
        }

        System.out.println("La suma de los valores pares es: " + sumaPares);

        scanner.close();
    }
}
//En este código, se ha agregado una variable sumaPares para almacenar la suma de los valores pares. Dentro del bucle for, después de mostrar cada multiplicación, se verifica si el resultado es par utilizando la condición resultado % 2 == 0. Si el resultado es par, se agrega al valor de sumaPares.