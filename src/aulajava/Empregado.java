package aulajava;

public class Empregado {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido(double salario, double imposto) {
		return (salario - imposto);
	}
	
	public void aumento(double porcentagem) {
		
		 this.salarioBruto = (salarioBruto * (porcentagem/100)) + (salarioBruto - imposto);
		 System.out.println(this.salarioBruto);
	}
}
