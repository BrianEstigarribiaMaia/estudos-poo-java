package br.com.estudos.poo.agregacao;

public class Circulo {

	Operacao operacao; //agregação
	
	public double area(int raio){
		operacao = new Operacao();
		int raizQuadrada = operacao.quadrado(raio);
		
		return Math.PI * raizQuadrada;
	}
}
