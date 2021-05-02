package br.com.estudos.poo.wrapper;

public class ExecutaWrapper {

	public static void main(String[] args) {
		Integer myInt = 100;
		String myString = "Wrapper";
		
		System.out.println("Tamanho da String WRAPPER: "+myString.length());
		String convertido = myInt.toString();
		System.out.println("Tamanho do Integer 100: "+convertido.length());

	}

}
