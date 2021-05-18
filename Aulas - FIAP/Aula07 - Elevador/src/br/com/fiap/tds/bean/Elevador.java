package br.com.fiap.tds.bean;

public class Elevador {
	
	public int andarAtual, totalAndares, capacidade, pessoasPresentes;
	
	public void inicializa(int capacidade, int total) {
	this.capacidade = capacidade;
	totalAndares = total;
	
	}
	
	public String gerenciarElevador() {
		String dados = "Capacidade: " + capacidade + " Pessoas Presentes: " + pessoasPresentes + " Total Andares: " + totalAndares + 
				" Andar atual: " + andarAtual;
		return dados;
				
	}
	
	public void entrar() {
		pessoasPresentes++;	
	}
	
	public void sair() {
		pessoasPresentes--;
	}
	
	public void subir() {
		andarAtual++;
	}
	
	public void descer() {
		andarAtual--;
	}

}


