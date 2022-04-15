package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import aulajava.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Quantas pessoas gostaria de registrar? ");
		int aux = sc.nextInt();
		
		for(int i = 0; i < aux; i++) {
			System.out.println();
			System.out.print("Employee #" + (i+1) + ": ");
			System.out.println("ID: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			String nome = sc.next();
			System.out.print("Salary: ");
			double salario = sc.nextDouble();
			
			Employee emp = new Employee(id, nome, salario);
			
			list.add(emp);
		}
		
		System.out.println("Digite o ID do funcionário que irá ter aumento.");
		int idsalary = sc.nextInt();
		Integer pos = position(list, idsalary);
		if (pos == null) {
			System.out.print("Este ID não existe.");
		}else {
			System.out.print("Entre com a porcentagem: ");
			double percente = sc.nextDouble();
			list.get(pos).increaseSalary(percente);
		}
		sc.close();
	}
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
