package aulajava;

import java.util.Locale;
import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Retangulo ret = new Retangulo();
		
		System.out.print("Digite um valor para altura do retangulo: ");
		ret.altura =  sc.nextDouble();
		System.out.print("Digite um valor para largura do retangulo: ");
		ret.largura = sc.nextDouble();
		
		System.out.println("Area: " + ret.area(0, 0));
		System.out.println("Perimetro: " + ret.perimetro(0, 0));
		System.out.println("Diagonal: " + ret.diagonal(0, 0));
		
		
	}

}
