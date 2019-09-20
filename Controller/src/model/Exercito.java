package model;

public class Exercito extends Inimigo{
	
	private int qtd_soldados;
	
	public Exercito() {
		super();
		this.setId(2);
		this.setForca(7);
		this.setInteligencia(2);
		this.setEstrategia(10);
	}
	
	public String grito() {
		return "Gahhhhaargghh!!";
	}

}
