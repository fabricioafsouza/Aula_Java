package aulajava;

public class Retangulo {

	public double altura;
	public double largura;
	
	public double area(double alt, double larg) {
		
		return  this.altura * this.largura;
	}
	
	public double perimetro(double alt, double larg) {
		
		return (2*(this.altura + this.largura));
	}
	
	public double diagonal(double alt, double larg) {
		
		return Math.sqrt((this.altura * this.altura) + (this.largura * this.largura));
	}
}