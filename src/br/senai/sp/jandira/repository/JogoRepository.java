package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Jogo;

public class JogoRepository {
	
	private Jogo[] colecao;
	
	//CONSTRUTORES DA CLASSE
	public JogoRepository() {
		colecao = new Jogo[5];
	}
	
	public JogoRepository(int quantidadeJogo) {
		colecao = new Jogo[quantidadeJogo];
	}
	
	//MÉTODOS DAS CLASSES
	public void salvar(Jogo jogo, int posicao) {
		colecao[posicao] = jogo;
	}
	
	public Jogo listarJogo(int posicao) {
		return colecao[posicao];
	}
	
	public Jogo[] listarTodos() {
		return colecao;
	}

}
