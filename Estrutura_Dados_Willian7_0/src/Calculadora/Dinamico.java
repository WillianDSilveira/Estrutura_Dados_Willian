package Calculadora;

import java.util.ArrayList;

public class Dinamico {

	public static void main(String[] args) {
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
