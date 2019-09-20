package model;

public class Pontuacao {
	
	private int pontosTotal;
	
	public Pontuacao() {
		this.pontosTotal = 0;
	}

	public int getPontosTotal() {
		return pontosTotal;
	}

	public void setPontosTotal(int pontosTotal) {
		this.pontosTotal += pontosTotal;
	}

	@Override
	public String toString() {
		return "A pontuação total foi de " + pontosTotal;
	}
	
}
