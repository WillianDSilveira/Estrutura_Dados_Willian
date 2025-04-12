import java.util.ArrayList;
import java.util.List;

public class PesquisaDeDados1 {

    // Função para realizar a pesquisa sequencial em uma lista de strings
    // Parâmetros:
    // - lista: a lista de strings onde a pesquisa será realizada
    // - alvo: a string que estamos procurando
    // Retorna o índice da string se encontrada, ou -1 se não encontrada
    public static int pesquisaDados(List<String> lista, String alvo) {
        for (int i = 0; i < lista.size(); i++) {
            // Comparamos a string na posição i com o alvo
            if (lista.get(i).equals(alvo)) {
                return i; // Se encontrarmos a string, retornamos o índice
            }
        }
        return -1; // Se não encontrarmos a string, retornamos -1
    }

    public static void main(String[] args) {
        // Exemplo de lista de strings
        List<String> listaDeNomes = new ArrayList<>();
        listaDeNomes.add("Alice");
        listaDeNomes.add("Bob");
        listaDeNomes.add("Charlie");
        listaDeNomes.add("David");
        listaDeNomes.add("Eva");

        // String que estamos procurando
        String nomeProcurado = "Bob";

        // Chama a função de pesquisa de dados
        int resultado = pesquisaDados(listaDeNomes, nomeProcurado);

        // Verifica o resultado da pesquisa
        if (resultado != -1) {
            System.out.println("Nome encontrado na posição " + resultado);
        } else {
            System.out.println("Nome não encontrado na lista.");
        }
    }
}
