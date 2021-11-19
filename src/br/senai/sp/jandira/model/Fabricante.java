package br.senai.sp.jandira.model;

public class Fabricante {
	
	private String nome;
	private String fundacao;
	private String sede;

	public Fabricante(String nome,  String fundacao,String sede) {
		this.nome = nome;
		this.fundacao = fundacao;
		this.sede = sede;
	}
	
	//GETTERS E SETTERS DA CLASSE (PEGAR E DEFINIR)
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getFundacao() {
		return fundacao;
	}
	
	public void setFundacao(String fundacao) {
		this.fundacao = fundacao;
	}
	
	public String getSede() {
		return sede;
	}
	
	public void setSede(String sede) {
		this.sede = sede;
	}
	
	

}
