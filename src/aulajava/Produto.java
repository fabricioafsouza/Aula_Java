package aulajava;
import java.util.Scanner;

public class Produto {

	public String name;
	public double preco;
	public int quantidade;
	
	public double valorTotalEstoque() {
		
		return preco * quantidade;
		
	}
	
	public void adicionarItem(int quantidade) {
		
		this.quantidade += quantidade;
		System.out.println("Total atual do estoque " + this.quantidade + ", " + this.quantidade * preco);
	}
	
	public void removerItem(int quantidade) {
		
		this.quantidade -= quantidade;
		System.out.println("Total atual do estoque " + this.quantidade + ", " + this.quantidade * preco);
	}
	
	public String toString() {
		return name + ", R$ "+ String.format("%.2f", preco) + ", "	+ quantidade + " unidades, total: R$ " + String.format("%.2f",valorTotalEstoque());
	}
	
}
