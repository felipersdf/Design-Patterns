package model;

public class Revista extends Publicacao {
	
	private String autor, titulo, artigo;
	
	public Revista(String autor, String titulo, String artigo, CriaPublicacao publicacao) {
		super(publicacao);
		this.autor = autor;
		this.titulo = titulo;
		this.artigo = artigo;
	}
	
	public String criaPublicacao() {
		return publicacao.criaPubli(titulo, autor);		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtigo() {
		return artigo;
	}

	public void setArtigo(String artigo) {
		this.artigo = artigo;
	}

}
