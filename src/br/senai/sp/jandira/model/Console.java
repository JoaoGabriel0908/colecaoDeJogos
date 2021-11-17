package br.senai.sp.jandira.model;

public enum Console {
	
	PS5 ("Playstation 4"),
	XBOXONE ("Xbox One"),
	NITENDOSWITCH ("Nintendo Switch"),
	GAMEBOY ("Game Boy"),
	PS4 ("Playstation 4");
	
	private String descricao;
	
	//CONSTRUTOR DA CLASSE
	private Console(String descricao) {
		this.descricao = descricao;
	}
	
	//PEGAR A DESCRICAO
	public String getDescricao() {
		return descricao;
	}
	

}
