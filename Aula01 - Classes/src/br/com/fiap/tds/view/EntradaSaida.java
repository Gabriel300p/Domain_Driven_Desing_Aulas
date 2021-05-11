package br.com.fiap.tds.view;

import java.util.Scanner;

public class EntradaSaida {
	
	//Ler os dados inseridos pelo usuário
	
	public static void main(String [] args) {
		
	//Instanciar um objeto do tipo Scanner
		
		Scanner leitor = new Scanner(System.in);
		
	//Pergunta para o usuário
		
		System.out.print("Digite um número: ");
		
	//Ler um número inteiro
		
		int x = leitor.nextInt();
		
		System.out.print("Digite o segundo número: ");
		
	//Ler outro número inteiro
		
		int y = leitor.nextInt();
		
	//Exibir o valor de x
		
		int soma = x + y;
		
		System.out.println("A soma dos dois números é: " + soma);
		
	//Fechar o leitor
			
		leitor.close();
				
	}
}
