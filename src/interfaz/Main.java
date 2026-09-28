
package interfaz;
import modelo.CountingSort;
/**
 *
 * @author johan
 */

public class Main {

    public static void main(String[] args) {

        int[] numeros = {4, 2, 2, 8, 3, 3, 1};

        System.out.println("Arreglo original:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        CountingSort.sort(numeros);

        System.out.println("Arreglo ordenado:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        System.out.println("El arreglo esta ordenado? "
                + CountingSort.isSorted(numeros));
    }
}
