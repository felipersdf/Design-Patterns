package model;

public class Futebol extends Game{

	public Futebol() {
		this.templateMethod();
	}
	
	public void initialize() {
		System.out.println("O jogo Futebol foi iniciado");
	}

	public void finish() {
		System.out.println("O jogo Futebol foi finalizado");
	}

}
