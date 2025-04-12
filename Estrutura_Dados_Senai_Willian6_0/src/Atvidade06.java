import java.util.Scanner;

public class Atvidade06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		int opcao;

		do {
			System.out.println("DIGITE O NUMERO PARA CADA OPCOE");
			System.out.println("1 -- Inserir número");
			System.out.println("2 -- Remover número");
			System.out.println("3 -- Exibir lista (início → fim)");
			System.out.println("4 -- Exibir lista (fim → início)");
			System.out.println("5 -- Sair");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite o número: ");
				int valorInserir = sc.nextInt();
				lista.inserirOrdenado(valorInserir);
				break;
			case 2:
				System.out.print("Digite o número a remover: ");
				int valorRemover = sc.nextInt();
				lista.remover(valorRemover);
				break;
			case 3:
				lista.exibirInicioFim();
				break;
			case 4:
				lista.exibirFimInicio();
				break;
			case 5:
				System.out.println("Encerrando o programa...");
				break;
			default:
				System.out.println("Opção inválida.");
			}

		} while (opcao != 5);

		sc.close();

	}

}
