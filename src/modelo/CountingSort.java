
package modelo;

/**
 *
 * @author johan
 */
public class CountingSort {

    public static void sort(int[] arreglo) {

        int mayor = arreglo[0];

        // Buscar el número mayor
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }

        // Crear arreglo de conteo
        int[] conteo = new int[mayor + 1];

        // Contar las apariciones
        for (int i = 0; i < arreglo.length; i++) {
            conteo[arreglo[i]]++;
        }

        // Reconstruir el arreglo
        int posicion = 0;

        for (int i = 0; i < conteo.length; i++) {

            while (conteo[i] > 0) {
                arreglo[posicion] = i;
                posicion++;
                conteo[i]--;
            }
        }
    }

    private static boolean less(int a, int b) {
        return a < b;
    }

    private static void exch(int[] arreglo, int i, int j) {
        int temporal = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temporal;
    }

    public static boolean isSorted(int[] arreglo) {

        for (int i = 1; i < arreglo.length; i++) {
            if (less(arreglo[i], arreglo[i - 1])) {
                return false;
            }
        }

        return true;
    }
}