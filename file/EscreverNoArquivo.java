package br.com.estudos.file;

import java.io.FileWriter;
import java.io.IOException;

public class EscreverNoArquivo {

	public static void main(String[] args) {
		try {
			FileWriter meuArquivo = new FileWriter("exemplo.txt");
			meuArquivo.write("Aprender a manipular arquivos em java é divertido!");
			meuArquivo.close();
			System.out.println("Escrito no arquivo com sucesso.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
