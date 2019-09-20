package model;

public class Espiao extends Inimigo {
	
	
	public Espiao() {
		super();
		this.setId(3);
		this.setForca(7);
		this.setInteligencia(10);
		this.setEstrategia(10);
		
	}
	
	public String grito() {
		return "Hmmmpf!!!";
	}

}


