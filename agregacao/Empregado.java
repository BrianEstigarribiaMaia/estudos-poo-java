package br.com.estudos.poo.agregacao;

public class Empregado {

	private int id;
	private String nome;
	Endereco endereco;
	
	public Empregado(int id, String nome, Endereco endereco){
		this.id =  id;
		this.nome = nome;
		this.endereco = endereco;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString(){
		String texto ="ID: " +id+ "\nNome: " +nome;
		return texto;
	}
	
}
