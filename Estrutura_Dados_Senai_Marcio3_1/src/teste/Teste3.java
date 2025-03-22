package teste;


public class Teste3 {

	public static void main(String[] args) {
		int tamanho = 5;
		int[] vetorEstatico = new int[tamanho]; // 
		
		for(int i=0; i<vetorEstatico.length; i++) {
			vetorEstatico[i] = i*2; // Atribui valores multiplos de 2
		}
		
		System.out.println("\n Vetor Estatico: ");
		for(int num:vetorEstatico) {
			System.out.println(num);
		}
		

	}

}
