import java.util.Scanner;

public class Prueba2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
        
        scanner.close();
    }
}

//Este programa te solicitará que ingreses un número entero y luego verificará si es par o impar utilizando el operador de módulo (%). Si el resultado de dividir el número entre 2 es igual a 0, entonces es par; de lo contrario, es impar. Luego, se imprimirá un mensaje indicando si el número es par o impar en la salida estándar.