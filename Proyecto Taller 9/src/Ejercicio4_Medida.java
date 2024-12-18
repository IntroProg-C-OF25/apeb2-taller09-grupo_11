
/** *
 * Dado el arreglo; determinar cuantos elementos están arriba de la media
 * aritmética y cuantos están por debajo de la medía aritmética.
 *
 * int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
 *
 * @author Javier Solano
 */
public class Ejercicio4_Medida {

    public static void main(String[] args) {
        
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};

        
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }

        
        double media = (double) suma / arreglo.length;

        
        int arribaDeLaMedia = 0;
        int abajoDeLaMedia = 0;

        
        for (int num : arreglo) {
            if (num > media) {
                arribaDeLaMedia++;
            } else if (num < media) {
                abajoDeLaMedia++;
            }
        }

        
        System.out.println("Media aritmetica: " + media);
        System.out.println("Elementos por encima de la media: " + arribaDeLaMedia);
        System.out.println("Elementos por debajo de la media: " + abajoDeLaMedia);
    }
}
/***
 * run:
  Media aritmetica: 9.538461538461538
  Elementos por encima de la media: 8
  Elementos por debajo de la media: 5
 */


