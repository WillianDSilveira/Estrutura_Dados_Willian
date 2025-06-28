package grafobfs_dijkstra;

import java.util.*;

public class GrafoBFS_dijkstra{
	private int vertices;
	private List<List<Aresta>> adjacencia;

	static class Aresta {
		int destino;
		int peso;

		Aresta(int destino, int peso) {
			this.destino = destino;
			this.peso = peso;
		}
	}

	public GrafoBFS_dijkstra(int vertices) {
		this.vertices = vertices;
		adjacencia = new ArrayList<>();
		for (int i = 0; i < vertices; i++) {
			adjacencia.add(new ArrayList<>());
		}
	}

	public void adicionarAresta(int origem, int destino, int peso) {
		adjacencia.get(origem).add(new Aresta(destino, peso));
	}

	public void buscaEmLargura(int inicio) {
		boolean[] visitado = new boolean[vertices];
		Queue<Integer> fila = new LinkedList<>();

		visitado[inicio] = true;
		fila.add(inicio);

		System.out.println("Iniciando BFS a partir do vértice " + inicio + ":");

		while (!fila.isEmpty()) {
			int vertice = fila.poll();
			System.out.print(vertice + " ");

			for (Aresta aresta : adjacencia.get(vertice)) {
				if (!visitado[aresta.destino]) {
					visitado[aresta.destino] = true;
					fila.add(aresta.destino);
				}
			}
		}
		System.out.println();
	}

	public void dijkstra(int inicio) {
		int[] distancia = new int[vertices];
		Arrays.fill(distancia, Integer.MAX_VALUE);
		distancia[inicio] = 0;

		PriorityQueue<Aresta> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.peso)); // Fila de prioridade
		pq.add(new Aresta(inicio, 0));

		while (!pq.isEmpty()) {
			Aresta arestaAtual = pq.poll();
			int verticeAtual = arestaAtual.destino;

			for (Aresta aresta : adjacencia.get(verticeAtual)) {
				int novoDistancia = distancia[verticeAtual] + aresta.peso;

				if (novoDistancia < distancia[aresta.destino]) {
					distancia[aresta.destino] = novoDistancia;
					pq.add(new Aresta(aresta.destino, novoDistancia));
				}
			}
		}

		
		System.out.println("Distâncias mínimas a partir do vértice " + inicio + ":");
		for (int i = 0; i < vertices; i++) {
			System.out.println("Vértice " + i + ": " + distancia[i]);
		}
	}

	
	public static void main(String[] args) {
		GrafoBFS_dijkstra grafo = new GrafoBFS_dijkstra(5);

		grafo.adicionarAresta(0, 1, 4);
		grafo.adicionarAresta(0, 2, 1);
		grafo.adicionarAresta(2, 1, 2);
		grafo.adicionarAresta(1, 3, 1);
		grafo.adicionarAresta(2, 3, 5);
		grafo.adicionarAresta(3, 4, 3);

		
		grafo.buscaEmLargura(0);

		grafo.dijkstra(0);
	}
}
