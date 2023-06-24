import java.util.Scanner;

public class EvaluacionesAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la nota de la primera evaluación: ");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Ingrese la nota de la segunda evaluación: ");
        double nota2 = scanner.nextDouble();
        
        System.out.println("Ingrese la nota de la tercera evaluación: ");
        double nota3 = scanner.nextDouble();
        
        double promedio = (nota1 + nota2 + nota3) / 3.0;
        
        System.out.println("El promedio del alumno es: " + promedio);
        
        if (promedio >= 7) {
            System.out.println("El alumno está aprobado.");
        } else {
            System.out.println("El alumno está reprobado.");
        }
    }
}
