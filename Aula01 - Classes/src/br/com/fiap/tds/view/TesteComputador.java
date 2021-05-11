package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.Computador;

public class TesteComputador {
	
	public static void main(String[] args ) {
		
		//new -> instancia uma classe (Cria o objeto)
		
		Computador pc1 = new Computador();
		
		Computador pc2 = new Computador();
		
		//Acessando os atributos
		
		pc1.processador = "Intel Core i7";
		pc2.processador = "AMD Ryzen 5";
		
		//Acionando os métodos
		
		pc1.configurarComputador("Intel Core i9", true, 1000, "B459M", 3000);
		pc2.configurarComputador("AMD Ryzen 7", false, 500, "B500M", 2000);
		
		//Exibir a configuração dos computadores
		
		System.out.println("Processador do pc1: " + pc1.processador);
		System.out.println("Processador do pc2: " + pc2.processador);
		
		//Chamar o método retornar configuração e exibir o resultado
		
		String conf1 = pc1.retornarConfiguracao();
		System.out.println("Pc1 = " + conf1);
		
		String conf2 = pc2.retornarConfiguracao();
		System.out.println("Pc2 = " + conf2);
		
		//Calcular o preço do pc1 com desconto 30%
		
		double desc1 = pc1.calcularDesconto(30);
		double desc2 = pc2.calcularDesconto(30);
		
		//Exibir o resultado
		
		System.out.println("Com o desconto o valor fica: " + desc1);
		System.out.println("Com o desconto o valor fica: " + desc2);
	}

}
