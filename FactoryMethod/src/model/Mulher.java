package model;

public class Mulher extends Usuario{
	
	private String genero;
	
	public Mulher(String nome, String genero) {
		super(nome);
		this.genero = genero;
	}
	
	public String saudaçao() {
		return "Bem vindo Sra. " + super.getNome();
	}
	
}