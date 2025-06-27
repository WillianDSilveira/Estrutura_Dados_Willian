import java.util.Scanner; // Importa a classe Scanner para entrada de dados

// Classe principal que representa a estrutura de pilha
public class MinhaPilha {
    private int[] elementos; // Vetor que armazena os elementos da pilha
    private int topo;        // Índice que representa o topo da pilha

    // Construtor da pilha, recebe a capacidade máxima como parâmetro
    public MinhaPilha(int capacidade) {
        elementos = new int[capacidade]; // Cria o vetor com o tamanho especificado
        topo = -1; // Inicializa a pilha como vazia (topo = -1)
    }

    // Método que insere um elemento no topo da pilha (push)
    public void empilhar(int valor) {
        if (estaCheia()) {
            System.out.println("A pilha está cheia. Não é possível empilhar.");
            return;
        }
        topo++; // Avança o topo
        elementos[topo] = valor; // Armazena o valor no novo topo
        System.out.println("Valor " + valor + " empilhado com sucesso.");
    }

    // Método que remove o elemento do topo da pilha (pop)
    public int desempilhar() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia. Nada a desempilhar.");
            return -1; // Retorna -1 como indicador de erro
        }
        int valor = elementos[topo]; // Armazena o valor do topo
        topo--; // Remove o topo da pilha
        return valor; // Retorna o valor removido
    }

    // Método que retorna o elemento do topo, sem removê-lo (peek)
    public int verTopo() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia.");
            return -1;
        }
        return elementos[topo]; // Retorna o valor do topo
    }

    // Método que verifica se a pilha está vazia
    public boolean estaVazia() {
        return topo == -1; // Se o topo é -1, a pilha está vazia
    }

    // Método que verifica se a pilha está cheia
    public boolean estaCheia() {
        return topo == elementos.length - 1; // Se o topo está no último índice, está cheia
    }

    // Método que exibe todos os elementos da pilha (do topo até a base)
    public void mostrarPilha() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia.");
            return;
        }

        System.out.print("Pilha (topo → base): ");
        for (int i = topo; i >= 0; i--) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println(); // Quebra de linha após exibir a pilha
    }

    // Método principal que exibe um menu para interagir com a pilha
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria scanner para entrada
        MinhaPilha pilha = new MinhaPilha(5); // Cria uma pilha com capacidade 5
        int opcao;

        // Menu interativo
        do {
            System.out.println("\n=== MENU PILHA ===");
            System.out.println("1 - Empilhar (inserir)");
            System.out.println("2 - Desempilhar (remover)");
            System.out.println("3 - Ver topo da pilha");
            System.out.println("4 - Mostrar todos os elementos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt(); // Lê a opção do usuário

            switch (opcao) {
                case 1:
                    System.out.print("Digite um valor para empilhar: ");
                    int valor = scanner.nextInt(); // Lê valor a ser empilhado
                    pilha.empilhar(valor);
                    break;
                case 2:
                    int removido = pilha.desempilhar(); // Remove o topo
                    if (removido != -1) {
                        System.out.println("Valor desempilhado: " + removido);
                    }
                    break;
                case 3:
                    int topo = pilha.verTopo(); // Consulta o topo
                    if (topo != -1) {
                        System.out.println("Topo da pilha: " + topo);
                    }
                    break;
                case 4:
                    pilha.mostrarPilha(); // Mostra a pilha
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close(); // Encerra o scanner
    }
}
