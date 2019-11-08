package model;

public class Cricket extends Game {

	public Cricket() {
		this.templateMethod();
	}
	
	public void initialize() {
		System.out.println("O jogo Cricket foi iniciado");
	}

	public void finish() {
		System.out.println("O jogo Cricket foi finalizado");
	}

}
