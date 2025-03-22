package teste;

import java.util.ArrayList;

public class Teste4 {

	public static void main(String[] args) {
		// Vetor estático, com limite fixo.
		int tamanho = 10;
		int[] vetorEstatico = new int[tamanho];
		
		for(int i=0; i<vetorEstatico.length; i++) {
			vetorEstatico[i] = i*2;// Atribuindo valores múltiplos de 2 ao array
		}
		
		System.out.println("\n Vetor Estatico: ");
		for(int num:vetorEstatico) {
			System.out.println(num); // Exibe os valores
		}
		
		// Lista dinâmica, sem limite fixo de tamanho
		ArrayList<Integer> listaDinamica = new ArrayList<>(); 

        // Inserindo elementos dinamicamente na lista
        for (int i = 0; i < 10; i++) {
            listaDinamica.add(i * 5); // Add elementos à lista
        }

        System.out.println("\nArrayList (Alocação Dinâmica):");
        for (int i : listaDinamica) {
            System.out.println(i); // Exibe os valores 
        }

        
	}

}
