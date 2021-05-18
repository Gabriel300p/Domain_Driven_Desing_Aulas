package br.com.fiap.tds.view;

import java.util.Scanner;

import br.com.fiap.tds.bean.Elevador;

public class EntradaElevador {
	
	public static void main(String [] args) {
	
	Elevador elevador = new Elevador();
	
	Scanner leitor = new Scanner(System.in);
			
	System.out.print("Digite a capacidade: ");
	int cap = leitor.nextInt();
	
	System.out.print("Digite a quantidade de andares: ");
	int qtd = leitor.nextInt();
	
	elevador.inicializa(cap, qtd);
	
	String dados = elevador.gerenciarElevador();
	System.out.println(dados);
	
	elevador.subir();
	
	elevador.entrar();
	
	elevador.subir();
	
	dados = elevador.gerenciarElevador();
	System.out.println(dados);
	
	leitor.close();
	
	}
	
}
