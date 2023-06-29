import java.util.Scanner;

public class Prueba21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la categoría del empleado (A, B o C): ");
        String categoria = scanner.nextLine();

        // Validar categoría
        while (!categoria.equalsIgnoreCase("A") && !categoria.equalsIgnoreCase("B") && !categoria.equalsIgnoreCase("C")) {
            System.out.println("Categoría inválida. Por favor, ingrese A, B o C.");
            System.out.print("Ingrese la categoría del empleado (A, B o C): ");
            categoria = scanner.nextLine();
        }

        System.out.print("Ingrese la antigüedad del empleado en años: ");
        int antiguedad = scanner.nextInt();

        // Validar antigüedad
        while (antiguedad <= 0) {
            System.out.println("Antigüedad inválida. Por favor, ingrese un valor mayor a 0.");
            System.out.print("Ingrese la antigüedad del empleado en años: ");
            antiguedad = scanner.nextInt();
        }

        System.out.print("Ingrese el sueldo bruto del empleado: ");
        double sueldoBruto = scanner.nextDouble();

        // Validar sueldo bruto
        while (sueldoBruto <= 0) {
            System.out.println("Sueldo bruto inválido. Por favor, ingrese un valor mayor a 0.");
            System.out.print("Ingrese el sueldo bruto del empleado: ");
            sueldoBruto = scanner.nextDouble();
        }

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
    }
}
//Con estas validaciones adicionales, el programa se asegura de que la categoría sea A, B o C, la antigüedad sea un número positivo y el sueldo bruto sea mayor que 0. Si el usuario ingresa un valor incorrecto, se mostrará un mensaje de error y se le pedirá que ingrese el dato nuevamente hasta que sea válido.