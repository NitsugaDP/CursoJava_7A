import java.util.Scanner;

public class Prueba16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}
//En este programa, se utiliza la clase Scanner para obtener la entrada del usuario. El número ingresado se almacena en la variable numero. Luego, se utiliza un bucle for para iterar desde 1 hasta 10 (puedes ajustar el rango según tus necesidades). En cada iteración, se calcula el resultado de la multiplicación y se muestra en pantalla.