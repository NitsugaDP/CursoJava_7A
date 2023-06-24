import java.util.Scanner;

public class CalculadoraSueldoNeto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        while (contador < 10) {
            System.out.println("Empleado " + (contador + 1));

            String categoria;
            do {
                System.out.print("Ingrese la categoría del empleado (A, B o C): ");
                categoria = scanner.nextLine();
            } while (!categoria.equalsIgnoreCase("A") && !categoria.equalsIgnoreCase("B") && !categoria.equalsIgnoreCase("C"));

            int antiguedad = (int) (Math.random() * 15) + 1;

            double sueldoBruto;
            do {
                System.out.print("Ingrese el sueldo bruto del empleado: ");
                sueldoBruto = scanner.nextDouble();
            } while (sueldoBruto <= 0);

            // Calcular el aumento según la antigüedad
            double aumento;
            if (antiguedad >= 1 && antiguedad <= 5) {
                aumento = 0.05;
            } else if (antiguedad >= 6 && antiguedad <= 10) {
                aumento = 0.1;
            } else {
                aumento = 0.3;
            }

            // Calcular el plus por categoría
            double plus;
            if (categoria.equalsIgnoreCase("A")) {
                plus = 1000;
            } else if (categoria.equalsIgnoreCase("B")) {
                plus = 2000;
            } else {
                plus = 3000;
            }

            // Calcular el sueldo neto
            double sueldoNeto = sueldoBruto + sueldoBruto * aumento + plus;

            System.out.println("El sueldo neto del empleado es: " + sueldoNeto);
            System.out.println();

            // Limpiar el búfer del scanner
            scanner.nextLine();

            contador++;
        }
    }
}
//En este código, el ciclo while se repetirá 10 veces y generará aleatoriamente una categoría utilizando Math.random(), y se solicitará al usuario que ingrese un sueldo válido. El proceso se repetirá hasta que se ingresen valores correctos para ambas variables. Luego se calculará y mostrará el sueldo neto del empleado.