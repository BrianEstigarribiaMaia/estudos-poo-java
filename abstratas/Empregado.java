package br.com.estudos.poo.abstratas;

public abstract class Empregado {

	private String nome, endereco;
	private int codigo;
	
	public Empregado(String nome, String endereco, int codigo) {
		System.out.println("Criando Empregado");
		this.nome = nome;
		this.endereco = endereco;
		this.codigo = codigo;
	}
	
	public abstract double computarPagamento();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String toString(){
		String texto = "Nome: "+nome+ "\nEndereço: "+endereco+ "\nCódigo: "+codigo;
		return texto;
	}
	
	
}
