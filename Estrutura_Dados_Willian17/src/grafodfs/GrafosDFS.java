package grafodfs;

import java.util.ArrayList;
import java.util.List;

public class GrafosDFS {
	private int vertices;
	private List<List<Aresta>> adjacencia;
	
	static class Aresta {
		int destino;
		int peso;
		
		Aresta(int destino, int peso){
			this.destino = destino;
			this.peso = peso;
		}
	}
	
	public GrafosDFS(int vertices) {
		this.vertices = vertices;
		adjacencia = new ArrayList<>();
		for (int i = 0; i < vertices; i++) {
			adjacencia.add(new ArrayList<>());
		}
	}
	
	public void adicionarAresta(int origem, int destino, int peso) {
		adjacencia.get(origem).add(new Aresta(destino, peso));
	}
	
	public void buscarEmProfundidade(int inicio) {
		boolean[] visitado = new boolean[vertices];
		System.out.println("Iniciando DFS a partir do vértice" + inicio + ":");
		dfsUtil(inicio, visitado);
	}
	
	private void dfsUtil(int vertice, boolean[] visitado) {
		visitado[vertice] = true;
		System.out.println(vertice + " ");
		
		for (Aresta aresta : adjacencia.get(vertice)) {
			if(!visitado[aresta.destino]) {
				dfsUtil(aresta.destino, visitado);
			}
		}
	}
	

	public static void main(String[] args) {
		GrafosDFS grafo = new GrafosDFS(5);
		
		grafo.adicionarAresta(0, 1, 4);
		grafo.adicionarAresta(0, 2, 1);
		grafo.adicionarAresta(2, 1, 2);
		grafo.adicionarAresta(1, 3, 1);
		grafo.adicionarAresta(2, 3, 5);
		grafo.adicionarAresta(3, 4, 3);
		
		grafo.buscarEmProfundidade(0);

	}

}
