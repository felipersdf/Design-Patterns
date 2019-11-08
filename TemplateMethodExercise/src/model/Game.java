package model;

public abstract class Game {
	
	public abstract void initialize();
	
	public void startPlay() {
		System.out.println("O jogo come�ou a ser jogado");
	}
	
	public void endPlay() {
		System.out.println("O jogo foi encerrado");
	}
	
	public void play() {
		System.out.println("O jogo est� sendo jogado");
	}
	
	public abstract void finish();
	
	public final void templateMethod() {
		initialize();
		startPlay();
		play();
		endPlay();
		finish();

	}

}
