import java.security.PublicKey;
import java.util.Scanner;

public class Recursivo {
	
	public static int fatorial(int n) {
		if (n>0) {
			return n * Recursivo.fatorial(n - 1);
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println("Valor: ");
		Scanner scan = new Scanner(System.in);
		int valor = scan.nextInt();
		System.out.println("O fatorial de " + valor + " é " +
		Recursivo.fatorial(valor));
		scan.close();
	}

}
