package model;

public class FactoryUsuario {
		
	public FactoryUsuario() {};
	
	public Usuario getUsuario(String nome, String genero) {
		if (genero.equals("M"))
			return new Homem(nome, "M");
		else if (genero.equals("F"))
			return new Mulher(nome, "F");
		else 
			return new Undefined(nome);
	}
	
}
