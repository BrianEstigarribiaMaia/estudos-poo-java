package br.com.estudos.poo.agregacao;

public class Endereco {
	private String cidade, estado, pais;
	
	public Endereco(String cidade, String estado, String pais){
		this.cidade = cidade;
		this.estado = estado;
		this.pais =  pais;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String toString(){
		String texto = "Cidade: " +cidade+ "\nEstado: " +estado+ "\nPais: "+pais ;
		return texto;
	}
}
