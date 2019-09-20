package view;

import controller.PontuacaoController;
import model.Espiao;
import model.Exercito;
import model.Pontuacao;
import model.Soldado;

public class Main {

	public static void main(String[] args) {
		
		PontuacaoController controller = new PontuacaoController();
		Soldado s1 = new Soldado();
		Exercito e1 = new Exercito();
		Espiao es1 = new Espiao();
		
		Pontuacao p = new Pontuacao();
		Pontuacao p2 = new Pontuacao();

		controller.matarInimigo(s1, p);
		controller.matarInimigo(e1, p);
		controller.matarInimigo(es1, p);
		

		controller.matarInimigo(s1, p2);
		controller.matarInimigo(e1, p2);
		
		
		System.out.println(p);
		System.out.println(p2);
		
		
	}

}
