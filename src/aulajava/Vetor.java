package aulajava;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite qtd de vetores: ");
		int n = sc.nextInt();
		
		double vet[] = new double[n];
		double aux = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o " + i + " valor: ");
			vet[i] = sc.nextDouble();
			aux += vet[i]; 
		}
		System.out.println("A média é: " + (aux/n));
	}

}
