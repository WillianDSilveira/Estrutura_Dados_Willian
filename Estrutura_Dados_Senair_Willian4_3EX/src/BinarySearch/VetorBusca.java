package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class VetorBusca {
	private int[]vetor;
	
	public VetorBusca(int tamanho) {
		this.vetor = new int [tamanho];
	}
	
	public void preencherVetor(Scanner scanner) {
		System.out.println("Digite os" + vetor.length + "numeros inteiros do Vetor: ");
		for(int i=0; i<vetor.length;i++){
			System.out.println("Elemento " + (i+1) + ": ");	
			vetor[i]= scanner.nextInt();
		}
		
		Arrays.sort(vetor);
	}
	
	public void exibirVetor() {
		System.out.println("Vetor Ordenado" + Arrays.toString(vetor));
	}
	
	public int buscaBinaria(int chave) {
		int inicio = 0, fim = vetor.length -1;
		while (inicio <=fim) {
			int meio = inicio + (fim - inicio)/2;
			if(vetor [meio] == chave) {
				return meio;
			}else if (vetor [meio]< chave) {
				inicio = meio +1;
			} else {
				fim = meio -1;
			}
		}
		return -1;
	}

}




