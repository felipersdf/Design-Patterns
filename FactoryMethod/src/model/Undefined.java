package model;

public class Undefined extends Usuario{

	
	public Undefined(String nome) {
		super(nome);
	}
	
	public String sauda�ao() {
		return "Bem vindo " + super.getNome();
	}
	
}


