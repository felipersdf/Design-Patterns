package view;

import model.Livro;
import model.Publicacao;
import model.PublicacaoBD;
import model.PublicacaoXML;
import model.Revista;

public class BridgeDemostration {

	public static void main(String[] args) {
		
		Publicacao livroXML = new Livro("Harry Potter", "JK Rowling", "12856118", new PublicacaoXML());
		Publicacao livroBD = new Livro("Harry Potter", "JK Rowling", "12856118", new PublicacaoBD());
		
		Publicacao revistaXML = new Revista("Caras", "Editora Abril", "Pessoas Famosas", new PublicacaoXML());
		Publicacao revistaBD = new Revista("Caras", "Editora Abril", "Pessoas Famosas", new PublicacaoBD());
		
		
		System.out.println(livroXML.criaPublicacao());
		System.out.println(livroBD.criaPublicacao());
		System.out.println("-------------------------");
		System.out.println(revistaXML.criaPublicacao());
		System.out.println(revistaBD.criaPublicacao());
		

	}

}
