package br.com.fiap.tds.bean;

public class pessoa {

	public String nome;
	public int idade;
	public float altura;
	
	public void gerenciarDados (String nome, int idade, float altura) {
		
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		
	}
		
		public String retornarDados() {
			String dados = "Nome: " + nome + "Idade: " + idade + "Altura: " + altura;
			
			return dados;
			
		}
		
	}
	
	



