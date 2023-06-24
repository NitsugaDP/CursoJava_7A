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

            // Verificar si el resultado es par y agregarlo a la suma
            sumaPares += (resultado % 2 == 0) ? resultado : 0;
        }

        System.out.println("La suma de los valores pares es: " + sumaPares);

        scanner.close();
    }
}
//En este código, se utiliza el operador condicional ternario (resultado % 2 == 0) ? resultado : 0 para determinar si el resultado de la multiplicación es par. Si es par, se agrega al valor de sumaPares; de lo contrario, se agrega 0.

//De esta manera, se evita el uso explícito de la estructura if.