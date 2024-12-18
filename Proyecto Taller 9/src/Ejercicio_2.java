
/***
 * Escriba un programa que permita presentar la siguiente serie:
 *
 *    1/2, 1/3, 2/5, 3/7, 5/11, 8/13, . . . fibonaccis / primos 
 * @author Javier Solano
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
        int cantidad = 10;
        int fibonacci = 0;
        int primo = 2;
        int cantidadGenerada = 0;

        while (cantidadGenerada < cantidad) {

            int a = 0, b = 1;
            for (int i = 2; i <= fibonacci; i++) {
                int temp = a;
                a = b;
                b = temp + b;
            }
            int numerador = (fibonacci == 0) ? a : b;

            while (true) {
                boolean esPrimo = true;
                for (int i = 2; i < primo; i++) {
                    if (primo % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    break;
                }
                primo++;
            }

            System.out.println(numerador + "/" + primo);

            fibonacci++;
            primo++;
            cantidadGenerada++;
        }
        System.out.print("La representacion de la serie es esta ");
    }
}
/***
 * run:
0/2
1/3
1/5
2/7
3/11
5/13
8/17
13/19
21/23
34/29
La representacion de la serie es esta 
 *
 */
