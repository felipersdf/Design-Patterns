package model;

public abstract class Inimigo {
	
	private int id,inteligencia, forca, estrategia;
	
	public Inimigo() {
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getInteligencia() {
		return inteligencia;
	}


	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}


	public int getForca() {
		return forca;
	}


	public void setForca(int forca) {
		this.forca = forca;
	}


	public int getEstrategia() {
		return estrategia;
	}


	public void setEstrategia(int estrategia) {
		this.estrategia = estrategia;
	}


	public abstract String grito();
	
}
