public class ListaDuplamenteEncadeada {
	
	public class No {
	    int valor;
	    No anterior;
	    No proximo;

	    public No(int valor) {
	        this.valor = valor;
	        this.anterior = null;
	        this.proximo = null;
	    }
	}
	
	
    private No inicio;
    private No fim;

    // Inserção de forma ordenada (crescente)
    public void inserirOrdenado(int valor) {
        No novo = new No(valor);

        // Caso a lista esteja vazia
        if (inicio == null) {
            inicio = fim = novo;
            return;
        }

        // Inserir no início
        if (valor < inicio.valor) {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
            return;
        }

        // Percorrer para encontrar posição correta
        No atual = inicio;
        while (atual != null && atual.valor < valor) {
            atual = atual.proximo;
        }

        if (atual == null) { // Inserir no fim
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        } else { // Inserir entre dois nós
            No anterior = atual.anterior;
            anterior.proximo = novo;
            novo.anterior = anterior;
            novo.proximo = atual;
            atual.anterior = novo;
        }
    }


    public void remover(int valor) {
        No atual = inicio;

        while (atual != null && atual.valor != valor) {
            atual = atual.proximo;
        }

        if (atual == null) {
            System.out.println("Valor não encontrado.");
            return;
        }

        // Remover o único nó
        if (inicio == fim) {
            inicio = fim = null;
        }
        // Remover o primeiro nó
        else if (atual == inicio) {
            inicio = atual.proximo;
            inicio.anterior = null;
        }
        // Remover o último nó
        else if (atual == fim) {
            fim = atual.anterior;
            fim.proximo = null;
        }
        // Remover do meio
        else {
            atual.anterior.proximo = atual.proximo;
            atual.proximo.anterior = atual.anterior;
        }

        System.out.println("Valor removido com sucesso.");
    }

    // Exibe do início ao fim
    public void exibirInicioFim() {
        No atual = inicio;
        System.out.print("Lista (início → fim): ");
        while (atual != null) {
            System.out.print(atual.valor + " , ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    // Exibe do fim ao início
    public void exibirFimInicio() {
        No atual = fim;
        System.out.print("Lista (fim → início): ");
        while (atual != null) {
            System.out.print(atual.valor + " , ");
            atual = atual.anterior;
        }
        System.out.println();
    }
}

