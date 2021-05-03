package br.com.estudos.poo.abstratas;

public class Salario extends Empregado{

	private double salarioAnual;
	

	public Salario(String nome, String endereco, int codigo, double salario) {
		super(nome, endereco, codigo);
		this.salarioAnual = salario;
	}

	@Override
	public double computarPagamento() {
		System.out.println("Computando pagamento para "+getNome());
		return salarioAnual / 12;
	}
	
	public void checar(){
		System.out.println("O empregado "+getNome()+ " recebe anualmente "+salarioAnual);
	}
	
	public double getSalarioAnual() {
		return salarioAnual;
	}

	public void setSalarioAnual(double salarioAnual) {
		if(salarioAnual >= 0){
			this.salarioAnual = salarioAnual;
		}
	}
}
