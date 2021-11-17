package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Fabricante;

public class FabricanteRepository {
	
	private Fabricante[] criador;
	
	//CONSTRUTORES DA CLASSE
	public FabricanteRepository() {
		criador = new Fabricante[5];
	}
	
	public FabricanteRepository(int quantidadeFabricante) {
		criador = new Fabricante[quantidadeFabricante];
	}
	
	public void criarFabricante() {
		
		Fabricante Sony = new Fabricante();
		Sony.setNome("Sony");
		Sony.setFundacao("1946");
		Sony.setSede("Japão");
		
		Fabricante EA = new Fabricante();
		EA.setNome("EA");
		EA.setFundacao("1982");
		EA.setSede("EUA");
		
		Fabricante EpicGames = new Fabricante();
		EpicGames.setNome("Epic Games");
		EpicGames.setFundacao("1992");
		EpicGames.setSede("EUA");
	}
	
	public void gravar(Fabricante fabricante, int posicao) {
		criador[posicao] = fabricante;
	}

	public Fabricante listarFabricante(int posicao) {
		return criador[posicao];
	}
	
	public Fabricante[] listarTodos() {
		return criador;
	}
	
}
