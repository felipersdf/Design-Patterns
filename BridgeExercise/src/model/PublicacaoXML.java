package model;

public class PublicacaoXML implements CriaPublicacao {
		
	public PublicacaoXML() {}
	
	public String criaPubli(String autor, String titulo) {
		return "Criou publica��o do tipo XML: " + "Autor: "+ autor + " Titulo: "+ titulo; 
	}
	
	
	
}
