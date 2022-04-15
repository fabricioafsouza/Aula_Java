package aulajava;

import java.util.Locale;
import java.util.Scanner;

public class Venda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);		
		Produto novo = new Produto();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite nome do produto: ");
		novo.name = sc.next();
		System.out.print("Digite preço do produto: ");
		novo.preco = sc.nextDouble();
		System.out.print("Digite quantidade do produto: ");
		novo.quantidade = sc.nextInt();
		System.out.println(novo);
		
		System.out.println();
		System.out.println("Entre com a quantiade de produtos para acrescentar: ");
		novo.adicionarItem(sc.nextInt());
		
		System.out.println();
		System.out.println("Entre com a quantiade de produtos para remover: ");
		novo.removerItem(sc.nextInt());
	
		sc.close();
	}
	
}
