package br.senai.sp.jandira.model;

public class Jogo {
	
	private String titulo;
	private Fabricante fabricante;
	private boolean zerado;
	private Console console;
	private double valor;
	private String observacoes;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public boolean getZerado() {
		return zerado;
	}
	
	public void setZerado(boolean zerado) {
		this.zerado = zerado;
	}
	
	public Console getConsole() {
		return console;
	}
	
	public void setConsole(Console console) {
		this.console = console;
	}
	
	public double getValor() {
		return valor;
	}
	
	public String getValor(double valor) {
		return Double.toString(valor);
	}
	
	public void setValor(String valor) {
		this.valor = Double.parseDouble(valor);
	}
	
	public String getObservacoes() {
		return observacoes;
	}
	
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
}

