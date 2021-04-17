package br.com.estudos.java.aninhada;


public class ExecutaAninhada {

	public static void main(String[] args) {
		ClasseA minhaClasse = new ClasseA();
		ClasseA.ClasseB minhaClasseAninhada = minhaClasse.new ClasseB();
		
		System.out.println(minhaClasseAninhada.somar());

	}

}
