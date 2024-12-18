
import java.util.Scanner;

/***
 * Con el objetivo practicar el uso del ciclo repetitivo for, se propone que
 * dado un límite, se presenten las siguientes figuras. Por ejemplo si el
 * límite es 4:
 *
 * @author Javier Solano
 */
public class Ejercicio_1Ciclos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el limite: ");
        int limite = input.nextInt();

        // Figura 1
        System.out.println("Figura 1:");
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Figura 2:");
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= limite - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Figura 3:");
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= limite - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = limite - 1; i >= 1; i--) {
            for (int j = 1; j <= limite - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
/***
 * Ingresa el limite: 4
Figura 1:
*
**
***
****
Figura 2:
   *
  ***
 *****
*******
Figura 3:
   *
  ***
 *****
*******
 *****
  ***
   *
 */


