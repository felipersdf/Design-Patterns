package model;

public class Soldado extends Inimigo {


	public Soldado() {
		super();
		this.setId(1);
		this.setForca(8);
		this.setInteligencia(5);
		this.setEstrategia(8);
	}
	
	public String grito() {
		return "Aaargghh!!";
	}
}
