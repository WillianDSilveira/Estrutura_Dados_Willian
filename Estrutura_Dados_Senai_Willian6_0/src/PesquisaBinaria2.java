public class PesquisaBinaria2 {

    public static int pesquisaBinaria(int[] arr, int elemento) {
        int esquerda = 0;
        int direita = arr.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (arr[meio] == elemento) {
                return meio;
            }

            if (arr[meio] < elemento) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50, 60, 70};
        int elementoProcurado = 40;

        int resultado = pesquisaBinaria(numeros, elementoProcurado);

        if (resultado != -1) {
            System.out.println("Elemento encontrado no índice " + resultado);
        } else {
            System.out.println("Elemento não encontrado no array.");
        }
    }
}
