package view;


import model.FactoryUsuario;
import model.Usuario;

public class Cliente {

	public static void main(String[] args) {
		
		FactoryUsuario fabrica = new FactoryUsuario();
		Usuario us1 = fabrica.getUsuario("Fabio", "M");
		System.out.println(us1.saudaçao());
		
		Usuario us2 = fabrica.getUsuario("Maria", "F");
		System.out.println(us2.saudaçao());
		
		Usuario us3 = fabrica.getUsuario("Lunga", "");
		System.out.println(us3.saudaçao());
	}

}
