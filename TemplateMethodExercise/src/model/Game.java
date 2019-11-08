package model;

public abstract class Game {
	
	public abstract void initialize();
	
	public void startPlay() {
		System.out.println("O jogo começou a ser jogado");
	}
	
	public void endPlay() {
		System.out.println("O jogo foi encerrado");
	}
	
	public void play() {
		System.out.println("O jogo está sendo jogado");
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
