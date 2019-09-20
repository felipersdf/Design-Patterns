package controller;

import model.Inimigo;
import model.Pontuacao;

public class PontuacaoController {
	
	public PontuacaoController() {}
	
	public void matarInimigo(Inimigo i, Pontuacao pontos) {
		
		if(i.getId() == 1) {
			System.out.println(i.grito());;
			pontos.setPontosTotal(100);
		}else if(i.getId() == 2) {
			System.out.println(i.grito());;
			pontos.setPontosTotal(50);
		}else if(i.getId() == 3) {
			System.out.println(i.grito());;
			pontos.setPontosTotal(200);
		}
	}

}
