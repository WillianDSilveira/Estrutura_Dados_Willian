package Calculadora;

public class Estatico {

	public static void main(String[] args) {
		// Inicia o vetor com 5 posiçoes
		int[] numeros = new int[5];
		
		// Incerindo valores pelo loop
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i * 2;
		}
		
		// Imprimindo os valores por loop
		System.out.println("\n Vetor Estatico: ");
		for (int num : numeros) {
			System.out.println(num);
		}
	}

}
