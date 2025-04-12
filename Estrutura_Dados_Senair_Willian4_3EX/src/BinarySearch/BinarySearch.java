package BinarySearch;
import java.util.Scanner;


public class BinarySearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//Solicita ao usuário o tamanho do vetor (5 a 25)
		int tamanho = obterTamanhoVetor(scanner);
		VetorBusca vetorBusca = new VetorBusca(tamanho);
		
//Preecher o vetor com valores inseridos pelo usuario
		vetorBusca.preencherVetor(scanner);
		
//Exibe o vetor ordenado
		vetorBusca.exibirVetor();
	
//Solicita ao usuário o numero a ser buscado
		System.out.print("Digite o numero a ser buscado: ");
		int numeroBusca = scanner.nextInt();
		
//Realizer a busca binaria
		int resultado = vetorBusca.buscaBinaria(numeroBusca);
//Exibe o resultado da busca
		if(resultado != -1) {
			System.out.println("Numero encontrado no indice " + resultado);
		}else {
			System.out.println("Numero nao encontrado. ");
		}
			scanner.close();
		}
//Método para obter o tamanho do vetor com validação
	private static int obterTamanhoVetor(Scanner scanner) {
		int tamanho;
		do {
			System.out.println("Digite o tamanho do vetor (5 a 25): ");
			tamanho = scanner.nextInt();
			if(tamanho <5 || tamanho >25) {
				System.out.println("Tamanho invalido, insira um valor valido entre 5 a 25: ");			
			}
		}while(tamanho <5 || tamanho >25);
		return tamanho;
	}
}