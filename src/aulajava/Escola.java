package aulajava;

public class Escola {

	public void somaNota(double n1, double n2, double n3) {
		
		double soma = n1 + n2 + n3;
		if (soma >= 60) {
			System.out.println("Nota: " + soma + ". Aprovado!");
		}else {
			System.out.println("Nota: " + soma + ". Reprovado!");
			System.out.println("Falta " + (100-soma) + " para ser aprovado!");
		}
	}
}
