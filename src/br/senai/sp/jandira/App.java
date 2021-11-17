package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Fabricante;
import br.senai.sp.jandira.model.Jogo;
import br.senai.sp.jandira.repository.JogoRepository;

public class App {

	public static void main(String[] args) {
		
		JogoRepository colecao = new JogoRepository(1);
		
		Jogo a = new Jogo();
		a.setTitulo("Crash");
		
		a.setZerado(true);
		a.setValor(100);
		colecao.salvar(a, 0);
	
		for(Jogo jogosAtuais : colecao.listarTodos()) {
			System.out.println(jogosAtuais.getTitulo());
			System.out.println(jogosAtuais.getFabricante().getNome());
			System.out.println(jogosAtuais.getValor());
			System.out.println(jogosAtuais.isZerado());
			
		}
	}
	
}

