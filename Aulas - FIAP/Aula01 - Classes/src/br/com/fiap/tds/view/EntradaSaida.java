package br.com.fiap.tds.view;

import java.util.Scanner;

public class EntradaSaida {
	
	//Ler os dados inseridos pelo usu�rio
	
	public static void main(String [] args) {
		
	//Instanciar um objeto do tipo Scanner
		
		Scanner leitor = new Scanner(System.in);
		
	//Pergunta para o usu�rio
		
		System.out.print("Digite um n�mero: ");
		
	//Ler um n�mero inteiro
		
		int x = leitor.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		
	//Ler outro n�mero inteiro
		
		int y = leitor.nextInt();
		
	//Exibir o valor de x
		
		int soma = x + y;
		
		System.out.println("A soma dos dois números �: " + soma);
		
	//Fechar o leitor
			
		leitor.close();
				
	}
}
