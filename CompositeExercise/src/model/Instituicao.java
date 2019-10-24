package model;

import java.util.ArrayList;
import java.util.List;

public class Instituicao {
	private String nome;
	private List<Individuo> membros = new ArrayList<>();
	
	public Instituicao(String nome) {
		this.nome = nome;
	}
	
	public List<Individuo> getLista() {
		return membros;
	}

	public void setLista(List<Individuo> lista) {
		this.membros = lista;
	}
	
	public int getMembros() {
		return this.membros.size();
	}

	public void adicionaIndividuo(Individuo pessoa){
		membros.add(pessoa);
	}
	
	public void removeIndividuo(Individuo pessoa) {
		membros.remove(pessoa);
	}

	public Individuo get(int i) {
		return membros.get(i);
	}

}
