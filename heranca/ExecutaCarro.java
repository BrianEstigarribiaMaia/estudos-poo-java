package br.com.estudos.heranca;

public class ExecutaCarro {

	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		
		System.out.println(meuCarro.marca+" "+meuCarro.getNomeDoModelo());
		meuCarro.reproduzirSomDoMotor();
	}

}
