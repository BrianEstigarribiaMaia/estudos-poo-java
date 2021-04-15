package br.com.w3c.java.classes.exceptions;

public class Idade {

	public void checarIdade(int idade){
		if (idade < 18){
			throw new ArithmeticException("Acesso negado");
		}else{
			System.out.println("Acesso garantido");
		}
	}
	
}
