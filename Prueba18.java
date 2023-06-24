public class TablasMultiplicar {
    public static void main(String[] args) {
        System.out.println("Tablas de multiplicar del 1 al 10:\n");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i + ":");

            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }

            System.out.println(); // Agrega una línea en blanco entre cada tabla
        }
    }
}
//En este código, el primer ciclo for itera desde 1 hasta 10, representando los números cuya tabla de multiplicar se mostrará. Dentro de este ciclo, se imprime el encabezado de la tabla correspondiente al número actual.

//Luego, el segundo ciclo for itera desde 1 hasta 10 para generar las multiplicaciones correspondientes a la tabla actual. Se calcula el resultado de cada multiplicación y se muestra en pantalla.

//Finalmente, se agrega una línea en blanco después de imprimir cada tabla para una mejor visualización.

//Con este programa, obtendrás todas las tablas de multiplicar del 1 al 10. Puedes ajustar el rango modificando los límites de los ciclos for según tus necesidades.