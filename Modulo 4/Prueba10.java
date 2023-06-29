import java.util.Scanner;

public class Prueba10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar los valores de las variables
        System.out.println("Ingrese el valor de la variable 1:");
        int variable1 = scanner.nextInt();

        System.out.println("Ingrese el valor de la variable 2:");
        int variable2 = scanner.nextInt();

        System.out.println("Ingrese el valor de la variable 3:");
        int variable3 = scanner.nextInt();

        // Encontrar la mayor variable utilizando el operador &&
        int mayorVariable = variable1;  // Suponemos que la primera variable es la mayor

        if (variable2 > mayorVariable && variable2 > variable3) {
            mayorVariable = variable2;
        } else if (variable3 > mayorVariable && variable3 > variable2) {
            mayorVariable = variable3;
        }

        // Imprimir la mayor variable
        System.out.println("La mayor variable es: " + mayorVariable);
    }
}
//n este ejemplo, hemos utilizado el operador && (AND) en las condiciones dentro de los bloques if. La idea es verificar si variable2 es mayor que mayorVariable y también mayor que variable3. En caso afirmativo, actualizamos mayorVariable con el valor de variable2. De manera similar, comparamos variable3 con mayorVariable y variable2 para actualizarla si es mayor.