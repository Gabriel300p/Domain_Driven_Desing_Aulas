package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.*;

import java.util.Scanner;

public class EntradaPessoa {
	
	public static void main(String[] args) {
		
		pessoa pessoa = new pessoa();
		//Elevador elevador = new Elevador();
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite Nome? ");
		String nome = leitor.next() + leitor.nextLine();
		
		System.out.print("Digite a idade: ");
		int idade = leitor.nextInt();
		
		System.out.print("Digite a altura: ");
		float altura = leitor.nextFloat();
		
		pessoa.gerenciarDados(nome, idade, altura);
		
		String dados = pessoa.retornarDados();
		System.out.println(dados);
		
		leitor.close();
	}

}


