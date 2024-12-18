/***
 * Analice el siguiente código
 * Scanner entrada = new Scanner(System.in);
 * String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
 * String inicial;
 * boolean bandera = true;
 * while(bandera){
 * System.out.println("Ingrese una letra");
 * inicial = entrada.nextLine();
 * }
 * Modifique el ciclo repetitivo para que salga del mismo, cuando el usuario ingrese por teclado una
 * letra que coincida con la primera letra de los "nombres" contenidos en el arreglo estudiantes .
 * Debe usar un ciclo repetitivo para recorrer el arreglo estudiantes , y no quemar de forma constante dichos iniciales,
 * imagine que los estudiantes podrían contener millones de nombres, por lo que fijar iniciales, es ineficiente.
 *
 * @author Hans
 */
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;
        while (bandera) {
            System.out.print("Ingrese una letra del nombre (en mayuscula): ");
            inicial = tcl.nextLine();
            for (String estudiante : estudiantes) {
                if (estudiante.charAt(0) == inicial.charAt(0)) {
                    System.out.print("Coincide con: " + estudiante);
                    bandera = false;
                    break;
                }
            }
            if (bandera) {
                System.out.print("Intenta de nuevo");
                System.out.println(" ");
            }
        }
    }
}
 /***
  * Run
  * Ingrese una letra del nombre (en mayuscula): Q
  * Intenta de nuevo 
  * Ingrese una letra del nombre (en mayuscula): R
  * Intenta de nuevo 
  * Ingrese una letra del nombre (en mayuscula): A
  * Coincide con: Alcides
  */       