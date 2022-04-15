package aulajava;

public class Employee {

	private Integer id;
	private String nome;
	private double salario;
	
	public Employee() {
		
	}
	
	public Employee(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void increaseSalary(double porcentagem) {
		salario += (salario * porcentagem);
	}
}
