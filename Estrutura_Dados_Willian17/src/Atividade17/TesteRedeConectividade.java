package Atividade17;

import java.util.*;


public class TesteRedeConectividade {

 // Número de computadores (vértices do grafo)
 private int numComputadores;

 // Lista de adjacência para armazenar as conexões entre computadores
 private List<List<Integer>> conexoes;

 // Construtor do grafo
 public TesteRedeConectividade(int numComputadores) {
     this.numComputadores = numComputadores;
     conexoes = new ArrayList<>();
     for (int i = 0; i < numComputadores; i++) {
         conexoes.add(new ArrayList<>()); // Inicializa a lista de vizinhos
     }
 }

 // Método para adicionar uma conexão (aresta) entre dois computadores
 public void adicionarConexao(int a, int b) {
     conexoes.get(a).add(b);
     conexoes.get(b).add(a); // Grafo não direcionado: conexão bidirecional
 }

 // Método auxiliar que realiza a busca em profundidade (DFS)
 private void dfs(int atual, boolean[] visitado) {
     visitado[atual] = true; // Marca o computador atual como visitado
     for (int vizinho : conexoes.get(atual)) {
         if (!visitado[vizinho]) {
             dfs(vizinho, visitado); // Chamada recursiva para visitar os vizinhos
         }
     }
 }

 // Verifica se a rede é totalmente conectada (todos os computadores alcançáveis)
 public boolean estaTotalmenteConectada() {
     boolean[] visitado = new boolean[numComputadores];

     // Inicia a DFS a partir do primeiro computador (índice 0)
     dfs(0, visitado);

     // Se algum computador não foi visitado, a rede está desconectada
     for (boolean status : visitado) {
         if (!status) {
             return false;
         }
     }

     return true;
 }

 // Método principal para executar testes
 public static void main(String[] args) {
     // Cria um grafo com 5 computadores (vértices)
     TesteRedeConectividade rede = new TesteRedeConectividade(5);

     // Adiciona conexões entre os computadores (arestas)
     rede.adicionarConexao(0, 1);
     rede.adicionarConexao(1, 2);
     rede.adicionarConexao(2, 3);
     rede.adicionarConexao(3, 4);
     // Se quiser testar um grafo desconectado, comente a linha acima

     // Exibe o resultado do teste de conectividade
     if (rede.estaTotalmenteConectada()) {
         System.out.println("Todos os computadores estão conectados.");
     } else {
         System.out.println("A rede possui computadores desconectados.");
     }
 }
}
