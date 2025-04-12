import java.util.Scanner;

public class PesquisaSequencial2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Defina um array de exemplo com alguns valores
        int[] array = {10, 25, 4, 8, 17, 30, 12};

        System.out.print("Digite o número que deseja encontrar: ");
        int valorProcurado = scanner.nextInt();

        // Chamamos a função de pesquisa sequencial para encontrar o valor
        int resultado = pesquisaSequencial(array, valorProcurado);

        // Verificamos o resultado e exibimos a mensagem apropriada
        if (resultado == -1) {
            System.out.println("O valor não foi encontrado na lista.");
        } else {
            System.out.println("O valor " + valorProcurado + " foi encontrado na posição " + resultado + " do array.");
        }

        scanner.close();
    }

    // Função de pesquisa sequencial
    public static int pesquisaSequencial(int[] array, int valorProcurado) {
        for (int i = 0; i < array.length; i++) {
            // Verifique se o valor na posição atual do array é igual ao valor procurado
            if (array[i] == valorProcurado) {
                // Se encontrado, retorne a posição
                return i;
            }
        }
        // Se o valor não for encontrado, retorne -1
        return -1;
    }
}
