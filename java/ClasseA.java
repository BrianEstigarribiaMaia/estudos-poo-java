package br.com.estudos.java.aninhada;

public class ClasseA {

	private int x = 10;
	
	public int getX() {
		return x;
	}

	class ClasseB{
		
		private int y = 5;

		public int somar(){
			int soma = this.y + x;
			return soma;
		}
	}
}
