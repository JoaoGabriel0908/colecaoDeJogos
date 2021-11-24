package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Fabricante;

public class FabricanteRepository {
	

	private Fabricante[] criador;
	
	//CONSTRUTORES DA CLASSE
	public FabricanteRepository(int quantidadeFabricante) {
		criador = new Fabricante[quantidadeFabricante];
	}
	
	public FabricanteRepository() {
		criador = new Fabricante[5];
		criador[0] = new Fabricante("Sony", "1946", "Japão");
		criador[1] = new Fabricante("EA", "1982", "EUA");
		criador[2] = new Fabricante("Epic Games", "1992", "EUA");
		criador[3] = new Fabricante("Ubisoft", "1986", "França");
		criador[4] = new Fabricante("Microsoft", "1975", "EUA");
	}	
		public Fabricante[] getFabricantes(){
			return criador;
		}
		public int getTamanho() {
			return criador.length;
		}
		public Fabricante getFabricantesIndex(int selectIndex) {
			return criador[selectIndex];
		}
		public Fabricante listarFabricante(int posicao) {
			return criador[posicao];
		}
		public Fabricante getFabricanteNome(String fabricanteNome) {
				for (Fabricante criador : criador) {
					if (criador.getNome().equalsIgnoreCase(fabricanteNome));
					return criador;
				}
				return null;
		}
		public Fabricante[] listarTodos() {
			return criador;
		}
		public int getIndex(Fabricante fabricante) {
			for (int i = 0; i < criador.length; i++) {
				return i;
		}
			return 0;
		
		}
}








