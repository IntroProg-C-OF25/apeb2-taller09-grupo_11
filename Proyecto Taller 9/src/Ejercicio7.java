/***
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuales al finalizar el ciclo,
 * la Dirección de la carrera de Computación a solicitó las siguientes estadísticas en función a
 * los promedios obtenidos del ciclo por estudiantes
 * (use 1 arreglo, no matrices, y para el promedio por estudiante, no ingrese el valor, si se debe autogenerar).
 * Promedio del ciclo, del paralelo C.
 * Listado de estudiantes con su nota por encima del promedio.
 * Listado de estudiantes con su nota por debajo del promedio.
 * Estudiante con la mejor calificación.
 * Estudiante con la calificación más baja.
 * @author Hans
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int lim = 28;
        String[] nombre = new String[lim];
        double sumatorianotas = 0, promedio = 0;
        double[] notas = new double[lim];
        double mayor = 0, menor = 10; 
        int notalta = 0, notabaja = 0;

        for (int i = 0; i < nombre.length; i++) {
            nombre[i] = "Estudiante " + (i + 1);
        }

        for (int i = 0; i < notas.length; i++) {
            notas[i] = Math.random() * 10;
            sumatorianotas += notas[i];
        }

        promedio = sumatorianotas / notas.length;
        System.out.printf("Promedio del ciclo paralelo C = %.2f%n", promedio);

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
                notalta = i;
            }
            if (notas[i] < menor) {
                menor = notas[i];
                notabaja = i;
            }
        }

        System.out.println("Estudiantes con nota por encima del promedio:");
        for (int i = 0; i < nombre.length; i++) {
            if (notas[i] > promedio) {
                System.out.printf("%s: %.2f%n", nombre[i], notas[i]);
            }
        }

        System.out.println("Estudiantes con nota por debajo del promedio:");
        for (int i = 0; i < nombre.length; i++) {
            if (notas[i] < promedio) {
                System.out.printf("%s: %.2f%n", nombre[i], notas[i]);
            }
        }
        System.out.printf("El estudiante con mejor calificacion es: %s con %.2f%n" ,nombre[notalta], mayor);
        System.out.printf("El estudiante con calificacion mas baja es: %s con %.2f%n", nombre[notabaja] , menor);
    }
}
/***
 * Run
 * Promedio del ciclo paralelo C = 5,28
 * Estudiantes con nota por encima del promedio:
 * Estudiante 1: 6,52
 * Estudiante 2: 8,21
 * Estudiante 6: 8,09
 * Estudiante 7: 9,53
 * Estudiante 8: 6,58
 * Estudiante 10: 5,38
 * Estudiante 12: 5,62
 * Estudiante 13: 9,05
 * Estudiante 14: 6,05
 * Estudiante 15: 9,10
 * Estudiante 18: 7,95
 * Estudiante 19: 9,41
 * Estudiante 23: 7,82
 * Estudiante 28: 8,06
 * Estudiantes con nota por debajo del promedio:
 * Estudiante 3: 2,29
 * Estudiante 4: 3,26
 * Estudiante 5: 4,84
 * Estudiante 9: 3,11
 * Estudiante 11: 3,67
 * Estudiante 16: 4,87
 * Estudiante 17: 2,00
 * Estudiante 20: 3,09
 * Estudiante 21: 1,01
 * Estudiante 22: 2,88
 * Estudiante 24: 4,23
 * Estudiante 25: 3,71
 * Estudiante 26: 0,34
 * Estudiante 27: 1,08
 * El estudiante con mejor calificacion es: Estudiante 7 con 9,53
 * El estudiante con calificacion mas baja es: Estudiante 26 con 0,34
 */