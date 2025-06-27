package Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    private int num1;
    private int num2;
    private String operacao;

    public void lerDados() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite digite um número inteiro válido.");
                scanner.nextLine(); 
            }
        }

        while (true) {
            try {
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite um número inteiro válido.");
                scanner.nextLine(); 
            }
        }

        while (true) {
            System.out.print("Digite a operação (+, -, *, /): ");
            operacao = scanner.next();
            if (operacao.matches("[+\\-*/]")) {
                break;
            } else {
                System.out.println("Erro: Operação inválida. Use apenas +, -, * ou /.");
            }
        }
        scanner.close();
    }

    public void realizarOperacao() {
        try {
            double resultado = 0;

            switch (operacao) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        throw new ArithmeticException("Erro: Divisão por zero.");
                    }
                    resultado = (double) num1 / num2;
                    break;
            }

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
