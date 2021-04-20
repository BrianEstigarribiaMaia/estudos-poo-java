package br.com.estudos.poo.polimorfismo;

public class ExecutaAnimal {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Animal porco = new Porco();
		Animal cachorro =  new Cachorro();
		
		animal.emitirSomDoAnimal();
		porco.emitirSomDoAnimal();
		cachorro.emitirSomDoAnimal();
	}

}
