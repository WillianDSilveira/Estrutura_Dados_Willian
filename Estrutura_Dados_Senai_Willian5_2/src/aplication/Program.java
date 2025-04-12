package aplication;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Employee;

import java.util.List;
import java.util.Locale;


public class Program {
	public static void main(String [] args) {
		
		
		
		Locale.setDefault(new Locale("pt", "BR"));
		
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();
		System.out.println("Quantos funcionarios serão cadastrados:");
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			System.out.println();
			System.out.println("Funcionario # " + (i+1) + ": ");
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id already taken! try again: ");
			}
			
			System.out.println("nome: ");
			
			
			String name = sc.nextLine();
			System.out.println("Salario: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
			
		}
		
	}
	
}
