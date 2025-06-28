package Atividade16;
import java.util.ArrayList;
import java.util.List;

public class GrafoSimples {
    private int vertices;
    private List<List<Integer>> adjacencia;

    // Construtor do grafo
    public GrafoSimples(int vertices) {
        this.vertices = vertices;
        adjacencia = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencia.add(new ArrayList<>());
        }
    }

    // Adiciona uma aresta entre dois vértices (grafo não direcionado)
    public void adicionarAresta(int origem, int destino) {
        adjacencia.get(origem).add(destino);
        adjacencia.get(destino).add(origem); // remove esta linha para grafo direcionado
    }

    // Exibe o grafo
    public void imprimirGrafo() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vértice " + i + ":");
            for (Integer vizinho : adjacencia.get(i)) {
                System.out.print(" -> " + vizinho);
            }
            System.out.println();
        }
    }

    // Função principal
    public static void main(String[] args) {
        GrafoSimples grafo = new GrafoSimples(5);

        grafo.adicionarAresta(0, 1);
        grafo.adicionarAresta(0, 4);
        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(1, 4);
        grafo.adicionarAresta(2, 3);
        grafo.adicionarAresta(3, 4);

        grafo.imprimirGrafo();
    }
}
