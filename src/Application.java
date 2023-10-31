import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

// ***** PROJETO 1 *****
// =====================
        int[] lista1 = {2, 2, 4, 2, 1, 2, 2, 3, 3, 4, 4, 2, 3, 4, 1, 2, 3, 4, 4, 2};
        classificaSelectionSort(lista1);
        System.out.println("Classificação conforme Selection Sort: " + Arrays.toString(lista1));


// ***** PROJETO 2 *****
// =====================
        int[] lista2 = {64, 34, 25, 12, 22, 11, 90};

        classificaBubbleSort(lista2);
        System.out.println("Classificação conforme Selection Sort: " + Arrays.toString(lista2));
    }

    private static void classificaSelectionSort(int[] lista) {

        for (int i = 0; i < lista.length; i++) {

            int i_menor = i;
            for (int j = i + 1; j < lista.length; j++)
                if (lista[j] < lista[i_menor])
                    i_menor = j;

            int aux = lista[i];
            lista[i] = lista[i_menor];
            lista[i_menor] = aux;

        }
    }

    public static void classificaBubbleSort(int[] lista) {
        int n = lista.length;
        boolean alterado;

        for (int i = 0; i < n - 1; i++) {
            alterado = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    // Troca o elemento atual com o próximo
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                    alterado = true;
                }
            }
            if (!alterado) {
                // Se nenhum elemento foi trocado, o array está ordenado e podemos sair.
                break;
            }
            alterado = false;
            for (int j = n - i - 1; j > i; j--) {
                if (lista[j] < lista[j - 1]) {
                    // Troca o elemento atual com o anterior
                    int temp = lista[j];
                    lista[j] = lista[j - 1];
                    lista[j - 1] = temp;
                    alterado = true;
                }
            }
            if (!alterado) {
                // Se nenhum elemento foi trocado, o array está ordenado e podemos sair.
                break;
            }
        }
    }
}
