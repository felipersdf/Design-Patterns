package model;

public abstract class Publicacao {
	
	 protected CriaPublicacao publicacao;
	 
	 protected Publicacao(CriaPublicacao publi) {
		 this.publicacao = publi;
	 }
	 
	 public abstract String criaPublicacao();

}
