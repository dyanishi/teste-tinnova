public class BubbleSort {

    public static void bubbleSort(int[] v) {
        int n = v.length;

        for (int i = 0; i < n - 1; i++) { // repetir (n-1) vezes
            boolean swapped = false;
            System.out.println("\nIteração " + (i + 1) + ":");

            for (int j = 0; j < n - 1 - i; j++) {

                // Exibe o par atual
                System.out.print(arrayComParenteses(v, j));

                if (v[j] > v[j + 1]) {
                    // Troca os elementos se estiverem fora de ordem
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                    swapped = true;

                    // Imprime após troca
                    System.out.print("     trocamos\n");
                } else {
                    // Mantém a ordem
                    System.out.print("     mantemos <----\n");
                }
            }

            // Imprime o vetor com a última posição ordenada marcada
            System.out.print("Estado atual: ");
            printArrayComMarcacao(v, n - i - 1);

            if (!swapped) {
                break; // Se não teve troca, o vetor já está ordenado
            }
        }
    }

    // Função para exibir o vetor com o par atual dentro de parênteses
    private static String arrayComParenteses(int[] v, int j) {
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < v.length; k++) {
            if (k == j) sb.append("(");
            sb.append(v[k]);
            if (k == j + 1) sb.append(")");
            sb.append("  ");
        }
        return sb.toString().trim();
    }

    // Função para imprimir o vetor com o elemento final fixo marcado
    private static void printArrayComMarcacao(int[] v, int end) {
        for (int i = 0; i < v.length; i++) {
            if (i == end) System.out.print("[");
            System.out.print(v[i]);
            if (i == end) System.out.print("]");
            System.out.print(" ");
        }
        System.out.println();
    }
}
