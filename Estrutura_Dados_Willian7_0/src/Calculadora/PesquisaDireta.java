package Calculadora;

import java.util.ArrayList;

public class PesquisaDireta {

	public static void main(String[] args) {
		// Inicio da Lista
        ArrayList<String> listaDeNomes = new ArrayList<>();
        listaDeNomes.add("Maria");
        listaDeNomes.add("João"); 
        listaDeNomes.add("Eva");
        listaDeNomes.add("Carlos");
        
        for(String nome : listaDeNomes) {
        	System.out.println(nome);
        }
         
        listaDeNomes.remove("João");
        // lista atualizada
        System.out.println("Lista Atualizada");
        for(String nome : listaDeNomes) {
        	System.out.println(nome);
        }

	}

}
