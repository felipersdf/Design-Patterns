package model;

public class Livro extends Publicacao {

	private String autor, titulo, isbn;
	
	public Livro(String autor, String titulo, String isbn, CriaPublicacao publicacao) {
		super(publicacao);
		this.autor = autor;
		this.titulo = titulo;
		this.isbn = isbn;
	}
	
	public String criaPublicacao() {
		return publicacao.criaPubli(titulo, autor);		
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

}
