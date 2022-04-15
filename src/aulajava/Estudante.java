package aulajava;

import java.util.Scanner;

public class Estudante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Escola esc = new Escola();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite nome do aluno: ");
		String nome = sc.next();
		System.out.print("Digite nota do primeiro trimestre: ");
		double n1 = sc.nextDouble();
		System.out.print("Digite nota do segundo trimestre: ");
		double n2 = sc.nextDouble();
		System.out.print("Digite nota do terceiro trimestre: ");
		double n3 = sc.nextDouble();
		
		esc.somaNota(n1, n2, n3);
	}

}
