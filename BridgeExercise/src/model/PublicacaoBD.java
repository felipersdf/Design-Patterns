package model;

public class PublicacaoBD implements CriaPublicacao{
	
	public PublicacaoBD(){};
	
	public String criaPubli(String autor, String titulo) {
		return "Criou publica��o do tipo BD: " + "Autor: "+ autor + " Titulo: "+ titulo; 
	}

}
