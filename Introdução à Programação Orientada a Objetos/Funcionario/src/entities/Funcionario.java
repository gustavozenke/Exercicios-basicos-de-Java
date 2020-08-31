package entities;

public class Funcionario {

	private String nome;
	private double salarioBruto;
	private double imposto;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setSalarioBruto(double salarioBruto){
		this.salarioBruto = salarioBruto;
	}

	public void setImposto(double taxa){
		this.imposto = taxa;
	}
	
	public String getNome(){
		return this.nome;
	}

	public double getSalarioBruto(){
		return this.salarioBruto;
	}
	
	public double getTaxa(){
		return this.imposto;
	}
	
	public double SalarioLiquido(){
		return salarioBruto-imposto;
	}
	
	public void increaseSalary(double percentage){
		this.salarioBruto += (salarioBruto*(percentage/100.00));
	}
	
	public String toString() {
		return (this.nome 
				+ " $"
				+ this.SalarioLiquido());
	}
}



