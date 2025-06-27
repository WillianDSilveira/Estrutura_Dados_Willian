import java.util.Scanner;

public class Pilha {
    private int[] pilha; // Vetor que representa a pilha
    private int topo;    // Índice do topo da pilha

    // Construtor
    public Pilha(int capacidade) {
        pilha = new int[capacidade]; // Inicializa o vetor
        topo = -1;                   // Pilha começa vazia
    }

    // Método para inserir (push)
    public void empilhar(int valor) {
        if (estaCheia()) {
            System.out.println("Pilha cheia! Não é possível empilhar.");
            return;
        }
        topo++; // Avança o topo
        pilha[topo] = valor; // Coloca o valor no topo
    }

    // Método para remover (pop)
    public int desempilhar() {
        if (estaVazia()) {
            System.out.println("Pilha vazia! Nada a desempilhar.");
            return -1;
        }
        int valor = pilha[topo]; // Obtém o valor do topo
        topo--; // Remove o topo
        return valor; // Retorna o valor removido
    }

    // Método para ver o topo (peek)
    public int topo() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        return pilha[topo]; // Retorna o valor do topo sem remover
    }

    // Verifica se a pilha está vazia
    public boolean estaVazia() {
        return topo == -1;
    }

    // Verifica se a pilha está cheia
    public boolean estaCheia() {
        return topo == pilha.length - 1;
    }

    // Exibe todos os elementos da pilha
    public void mostrarPilha() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return;
        }

        System.out.print("Pilha (topo → base): ");
        for (int i = topo; i >= 0; i--) {
            System.out.print(pilha[i] + " ");
        }
        System.out.println();
    }

    // Método principal com menu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha pilha = new Pilha(5); // Cria uma pilha com capacidade 5
        int opcao;

        do {
            // Menu de operações
            System.out.println("\n=== MENU PILHA ===");
            System.out.println("1 - Empilhar (inserir)");
            System.out.println("2 - Desempilhar (remover)");
            System.out.println("3 - Ver topo da pilha");
            System.out.println("4 - Mostrar todos os elementos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um valor para empilhar: ");
                    int valor = scanner.nextInt();
                    pilha.empilhar(valor);
                    break;
                case 2:
                    int removido = pilha.desempilhar();
                    if (removido != -1) {
                        System.out.println("Valor desempilhado: " + removido);
                    }
                    break;
                case 3:
                    int topo = pilha.topo();
                    if (topo != -1) {
                        System.out.println("Topo da pilha: " + topo);
                    }
                    break;
                case 4:
                    pilha.mostrarPilha();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close(); // Fecha o scanner
    }
}
