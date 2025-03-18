package teste;


public class Teste3 {

	public static void main(String[] args) {
		int tamanho = 10;
		int[] vetorDinamico = new int[tamanho];
		
		for(int i=0; i<vetorDinamico.length; i++) {
			vetorDinamico[i] = i*2;
		}
		
		System.out.println("\n Vetor Dinamico: ");
		for(int num:vetorDinamico) {
			System.out.println(num);
		}
		

	}

}
