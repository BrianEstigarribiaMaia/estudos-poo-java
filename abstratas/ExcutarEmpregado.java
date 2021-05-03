package br.com.estudos.poo.abstratas;

public class ExcutarEmpregado {

	public static void main(String[] args) {
		Empregado emp = new Salario("Marisa", "Cabral", 555, 30000);
		
		System.out.println(emp);
		emp.computarPagamento();
		System.out.println("-------------------------------------\n");
		
		Salario sal = new Salario("John", "Adams", 222, 24000);
		System.out.println(sal);
		sal.computarPagamento();
		sal.checar();
		System.out.println("-------------------------------------\n");
	}

}
