import java.util.Scanner;

public class CategoriasPrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la categoría (a, b o c): ");
        String categoria = scanner.nextLine();

        if (categoria.equals("a")) {
            System.out.println("hijo");
        } else if (categoria.equals("b")) {
            System.out.println("padres");
        } else if (categoria.equals("c")) {
            System.out.println("abuelos");
        } else {
            System.out.println("Categoría inválida. Por favor, ingrese 'a', 'b' o 'c'.");
        }
    }
}
//En este caso, se utiliza la clase Scanner para leer la entrada del usuario desde la consola. Luego se verifica el valor ingresado y se muestra en pantalla la palabra correspondiente según la categoría seleccionada. Si se ingresa una categoría no válida, se muestra un mensaje de error.