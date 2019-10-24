package view;

import model.Congresso;
import model.Individuo;
import model.Instituicao;

public class Main {

	public static void main(String[] args) {
		Congresso congresso = new Congresso(10);
		
		Instituicao inst = new Instituicao("IFPB");
		
		Individuo pessoa = new Individuo();
		Individuo pessoa2 = new Individuo();
		Individuo pessoa3 = new Individuo();
		Individuo pessoa4 = new Individuo();
		Individuo pessoa5 = new Individuo();
		Individuo pessoa6 = new Individuo();
		Individuo pessoa7 = new Individuo();
		Individuo pessoa8 = new Individuo();
		
		inst.adicionaIndividuo(pessoa);
		inst.adicionaIndividuo(pessoa2);
		inst.adicionaIndividuo(pessoa3);
		inst.adicionaIndividuo(pessoa4);
		inst.adicionaIndividuo(pessoa5);
		
		congresso.adicionaParticipante(inst);
		congresso.adicionaParticipante(pessoa6);
		congresso.adicionaParticipante(pessoa7);
		congresso.adicionaParticipante(pessoa8);
		
//		System.out.println(congresso.totalAssentos());
//		System.out.println(congresso.totalParticipantes());
		
		System.out.println(congresso.estaLotado());
	}

}
