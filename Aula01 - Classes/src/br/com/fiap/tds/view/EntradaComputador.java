package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.Computador;

import java.util.Scanner;

public class EntradaComputador {
	
	public static void main(String[] args) {
	
	//Ler os dados do computador (Informado pelo usuário)
	
	Scanner leitor = new Scanner(System.in);
	
	System.out.print("Qual o processador? ");
	String processador = leitor.next() + leitor.nextLine();
	
	System.out.print("Tem placa de video? (True/False)");
	boolean placaVideo = leitor.nextBoolean();
	
	System.out.print("Qual o tamanho do HD? ");
	int tamanhoHd = leitor.nextInt();
	
	System.out.print("Qual a placa mãe? ");
	String placaMae = leitor.next();
	
	System.out.print("Qual o preço? ");
	double preco = leitor.nextDouble();
	
	//Instanciar uma classe do tipo Computador
	Computador pc1 = new Computador();
	
	//Atriibuir os valores lidos nos atributos do objeto computador
	pc1.configurarComputador(processador, placaVideo, tamanhoHd, placaMae, preco);
	
	//Exibir os valores dos atributos do objeto
	String conf1 = pc1.retornarConfiguracao();
	System.out.println(conf1);
	
	//Perguntar ao usuário o desconto
	System.out.print("Digite o desconto: (%) ");
	double desc1 = leitor.nextDouble();
	
	//Calcular o preço do pc com desconto
	double valor = pc1.calcularDesconto(desc1);
	
	//Exibir desconto
	System.out.println("Valor com o desconto: " + valor);
	
		leitor.close();
	}

}
