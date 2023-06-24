import java.util.Scanner;

public class CaracteristicasAuto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la categoría del auto (a, b, c): ");
        char claseAuto = scanner.next().charAt(0);

        switch (claseAuto) {
            case 'a':
                System.out.println("Clase A: 4 ruedas y un motor");
                break;
            case 'b':
                System.out.println("Clase B: 4 ruedas, un motor, cierre centralizado y aire");
                break;
            case 'c':
                System.out.println("Clase C: 4 ruedas, un motor, cierre centralizado, aire y airbag");
                break;
            default:
                System.out.println("Categoría no válida");
                break;
        }
    }
}
//En esta versión, utilizamos la clase Scanner para leer la entrada del usuario y almacenarla en la variable claseAuto. Luego, se realiza la comparación en el bloque switch para mostrar las características correspondientes según la categoría ingresada.