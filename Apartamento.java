package br.com.estudos.poo.interfaces;

public class Apartamento implements Construcao, CustoConstrucao{

	private int comodos = 4;

	@Override
	public double calcularCusto() {
		int custo = 500000;
		return custo;
	}

	@Override
	public void especificarConstrucao() {
		System.out.println("Tipo Apartamento");
		
	}
	
	public String toString(){
		especificarConstrucao();
		return " Custo: "+calcularCusto()+
		" | Quantidade de comodos "+this.comodos;
	}
	
}
