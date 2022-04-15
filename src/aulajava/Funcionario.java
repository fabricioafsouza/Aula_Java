package aulajava;

import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		Empregado emp = new Empregado();
		
		System.out.print("Digite nome do empregado: ");
		String nome = sc.next();
		System.out.print("Digite o salário bruto: ");
		emp.salarioBruto = sc.nextDouble();
		System.out.print("Digite imposto: ");
		emp.imposto = sc.nextDouble();
		
		System.out.println("O empregado " + nome + ", recebe " + emp.salarioLiquido(emp.salarioBruto, emp.imposto));
		System.out.println();
		System.out.print("Quantos porcento de aumento? ");
		emp.aumento(sc.nextDouble());
		
	}

}
