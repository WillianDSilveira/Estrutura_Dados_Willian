package teste;

public class Teste {

	public static void imprimeVetor(double v[] ) {
		for (double e : v ) System.out.printf(e + " ");
		System.out.println();
	}
	public static void imprimeVetor(int[] arrayInt) {
		for (int e : arrayInt ) System.out.printf(e + " ");
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		double[] arrayDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
		System.out.println("Vetor de Double: ");
		imprimeVetor(arrayDouble);
		
		System.out.println();
		
		int[] arrayInt = {1,2,3,4,5,6};
		System.out.println("Vetor de Inteiro: ");
		imprimeVetor(arrayInt);
		

	}

}
