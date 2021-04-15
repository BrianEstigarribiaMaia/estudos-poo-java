package br.com.java.clases.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExecutaRegex {

	public static void main(String[] args) {
		Pattern padrao = Pattern.compile("inuyasha",Pattern.CASE_INSENSITIVE);
		Matcher combinar = padrao.matcher("Veja INUYASHA!");
		
		boolean encontrarCombinacao = combinar.find();
		
		if(encontrarCombinacao){
			System.out.println("Combinação encontrada");
		}else{
			System.out.println("Combinação Não encontrada");
		}
	}
}
