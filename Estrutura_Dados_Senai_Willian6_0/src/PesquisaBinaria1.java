public class PesquisaBinaria1{
	public static int pesquisaBinaria(int[] arr, int elemento) {
	    int esquerda = 0; // Índice do primeiro elemento na matriz
	    int direita = arr.length - 1; // Índice do último elemento na matriz

	    while (esquerda <= direita) {
	        int meio = esquerda + (direita - esquerda) / 2; // Calcula o índice do elemento do meio
	        
	        System.out.println(meio);
	        
	        // Se o elemento do meio for igual ao elemento procurado, retornamos o índice
	        if (arr[meio] == elemento) {
	        	System.out.println("Primeiro IF" + meio);
	            return meio;
	        }
	        
	        // Se o elemento do meio for maior do que o elemento procurado, procuramos na metade esquerda
	        if (arr[meio] > elemento) {
	        	System.out.println("Segundo IF" + meio);
	            direita = meio - 1;
	        } else { // Caso contrário, procuramos na metade direita
	        	System.out.println("Terceiro IF" + meio);
	            esquerda = meio + 1;
	        }
	    }

	    // Elemento não encontrado
	    return -1;
	}
	
	
	public static void main(String[] args) {
	    // Exemplo de matriz ordenada de números inteiros
	    int[] numeros = {10, 20, 30, 40, 50, 60, 70};

	    // Elemento que estamos procurando
	    int elementoProcurado = 50;

	    // Chama a função de pesquisa binária
	    int resultado = pesquisaBinaria(numeros, elementoProcurado);

	    // Verifica o resultado da pesquisa
	    if (resultado != -1) {
	        System.out.println("Elemento encontrado no índice " + resultado);
	    } else {
	        System.out.println("Elemento não encontrado na matriz.");
	    }
	}

	
}

