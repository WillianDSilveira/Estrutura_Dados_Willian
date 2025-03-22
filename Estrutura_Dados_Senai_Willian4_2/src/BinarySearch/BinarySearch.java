package BinarySearch;

public class BinarySearch {
	
	//Metodo para busca binaria em forma iterativa
	public static int searchInteractive(int[] a, int key) {   
	    // Inicializa os índices do início (low) e do final (high) do array
	    int low = 0;  
	    int high = a.length - 1;  

	    // Enquanto a parte do array a ser buscada não for vazia
	    while (low <= high) {  
	        // Calcula o índice do meio do array
	        int mid = (low + high) / 2;  

	        // Se o valor da chave for menor que o elemento do meio
	        if (key < a[mid]) {  
	            // Ajusta o índice high para a metade esquerda do array
	            high = mid - 1;  
	        }  
	        // Se o valor da chave for maior que o elemento do meio
	        else if (key > a[mid]) {  
	            // Ajusta o índice low para a metade direita do array
	            low = mid + 1;  
	        }  
	        // Se a chave for igual ao elemento do meio, retorna o índice
	        else {  
	            return mid;  
	        }  
	    }  
	    // Se não encontrar o elemento, retorna -1
	    return -1;  
	}

	
}
