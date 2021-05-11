package br.com.fiap.tds.bean;

public class Usuario {
	
	//atributo
	
	private int codigo;
	
	private String nome;
	
	private boolean ativo;
	
	//metodo de leitura e escrita (Gets/Sets)
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public void  setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	
	}

}

