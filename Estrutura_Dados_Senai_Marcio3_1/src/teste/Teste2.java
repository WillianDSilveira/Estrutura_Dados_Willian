package teste;

public class Teste2 {
	
	public static void imprimeVetor(Double v[] ) {
		for (Double e : v ) System.out.printf(e + " ");
		System.out.println();
	}
	public static void imprimeVetor(Integer[] arrayInt) {
		for (Integer e : arrayInt ) System.out.printf(e + " ");
		System.out.println();
	}
	public static <T> void imprimeVetorC(T v[]) {
		for (T e:v ) System.out.printf(e + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Double[] arrayDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
		System.out.println("Vetor de Double: ");
		imprimeVetor(arrayDouble);
		
		System.out.println();
		
		Integer[] arrayInt = {1,2,3,4,5,6};
		System.out.println("Vetor de Inteiro: ");
		imprimeVetor(arrayInt);
		
		System.out.println();
		
		Character[] arrayChar = {'E', 'C', 'o', '0', '3', '0'};
		System.out.println("Vetor de Char: ");
		imprimeVetorC(arrayChar);

	}

}
