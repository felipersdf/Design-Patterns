package model;

public class Homem extends Usuario{
	
	private String genero;
	
	public Homem(String nome, String genero) {
		super(nome);
		this.genero = genero;
	}
	
	public String sauda�ao() {
		return "Bem vindo Sr. " + super.getNome();
	}
	
}
