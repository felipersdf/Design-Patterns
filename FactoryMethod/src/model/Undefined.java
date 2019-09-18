package model;

public class Undefined extends Usuario{

	
	public Undefined(String nome) {
		super(nome);
	}
	
	public String saudaçao() {
		return "Bem vindo " + super.getNome();
	}
	
}


