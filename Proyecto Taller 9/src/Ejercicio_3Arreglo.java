
import java.util.Scanner;

/**
 * *
 * Genera una aplicación que permita ingresar valores a un arreglo de cadenas.
 * El arreglo almacena el número de elementos que el usuario lo disponga. Se
 * puede plantear el escenario que se ingresen nombres de marcas de vehículos.
 *
 * Por ejemplo, si el usuario decide ingresar 5 marcas; el arreglo solo debe
 * permitir ingresar ese número elementos.
 *
 * Considerar las siguientes excepciones, no se contabilizan dentro del número
 * de elementos, marcas que empiecen con las letras A, C, T.
 *
 * @author Javier Solano
 */
public class Ejercicio_3Arreglo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de marcas de vehiculos que desea registrar: ");
        int cantidadMarcas = scanner.nextInt();
        scanner.nextLine();

        String[] marcas = new String[cantidadMarcas];
        int contador = 0;

        while (contador < cantidadMarcas) {
            System.out.print("Ingrese una marca de vehiculo: ");
            String marca = scanner.nextLine();

            if (marca.toUpperCase().startsWith("A") || marca.toUpperCase().startsWith("C") || marca.toUpperCase().startsWith("T")) {
                System.out.println("Marca no valida. No se puede contar marcas que empiecen con 'A', 'C' o 'T'. Intente nuevamente.");
            } else {

                marcas[contador] = marca;
                contador++;
            }
        }

        System.out.println("\nMarcas registradas:");
        for (int i = 0; i < cantidadMarcas; i++) {
            System.out.println(marcas[i]);
        }

        scanner.close();
    }
}

/***
 * run:
Ingrese el numero de marcas de vehiculos que desea registrar: 5
Ingrese una marca de vehiculo: kia
Ingrese una marca de vehiculo: susuki
Ingrese una marca de vehiculo: hyundai
Ingrese una marca de vehiculo: chevrolet
Marca no valida. No se puede contar marcas que empiecen con 'A', 'C' o 'T'. Intente nuevamente.
Ingrese una marca de vehiculo: ferrari
Ingrese una marca de vehiculo: renault

Marcas registradas:
kia
susuki
hyundai
ferrari
renault
 */
