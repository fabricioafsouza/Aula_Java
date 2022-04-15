package aulajava;

import java.util.Scanner;

public class Aluguel_Quartos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vet = new Aluguel[10];
		
		System.out.print("Quantos quartos serão alugados: ");
		int n = sc.nextInt();
		
		String n1 = "Vazio";
		String em1 = "Vazio";
		for (int i = 0; i < 10; i++) {
			
			vet[i] = new Aluguel(n1, em1);
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o nome: ");
			String nome = sc.next();
			System.out.print("Digite o e-mail: ");
			sc.nextLine();
			String email = sc.next();
			System.out.println("Qual quarto ficará hospedado? ");
			int quarto = sc.nextInt();
			vet[quarto] = new Aluguel(nome, email);
		}
		
		System.out.println("-----------------------------------");
		System.out.println("------------IMPRESSÃO--------------");
		System.out.println("-----------------------------------");
		for (int i = 0; i < 10; i++) {
			if (vet[i] != null) {
				System.out.println("Quarto " + i +", estudante " + vet[i].getNome() + ", e-mail " + vet[i].getEmail());
			}
		}
		
		
		
	}
}
