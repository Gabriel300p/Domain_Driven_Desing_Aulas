package br.com.fiap.tds.bean;

public class Computador {
	
	//Atributos
	
	public String processador;
	
	public boolean placaVideo;
	
	public int tamanhoHd;
	
	public String placaMae;
	
	public double preco;
	
	//M�todos -> retorno nome(parametros){}
	//N�o retorana nada e recebe os dados para preencher os atributos
	
	
	public void configurarComputador (String proc, boolean video, int hd, String placa, double preco) {
		
		processador = proc;
		
		placaVideo = video;
		
		tamanhoHd = hd;
		
		placaMae = placa;
		
		this.preco = preco; //this -> referencia a classe
	}
	
	//Retorna uma String com as configura��es do computador
	
	public String retornarConfiguracao() {
		String configuracao = processador = "Processador: " + processador + " Placa de Video: " + placaVideo + " Hd: "
		+ tamanhoHd + " Placa m�e: " + placaMae + " Pre�o: " + preco;
		
		return configuracao;
	
	}
	
	//Retornar o valor com desconto em %
	public double calcularDesconto(double desconto) {
		double valorDesconto = preco - preco * desconto/100;
		return valorDesconto;
	}
}
