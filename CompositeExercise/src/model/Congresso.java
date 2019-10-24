package model;

import java.util.ArrayList;
import java.util.List;

public class Congresso {
	
		private int assentos;
		private List<Individuo> participantes = new ArrayList<>();
		
		public Congresso(int assentos) {
			this.assentos = assentos;
		}
				
		public int getAssentos() {
			return assentos;
		}
		public void setAssentos(int assentos) {
			this.assentos = assentos;
		}

		public List<Individuo> getParticipantes() {
			return participantes;
		}
		public void setParticipantes(List<Individuo> participantes) {
			this.participantes = participantes;
		}
		
		public int totalAssentos() {
			return assentos;
		}
		
		public void adicionaParticipante(Individuo pessoa) {
			this.participantes.add(pessoa);
		}
		
		public void adicionaParticipante(Instituicao grupo) {
			
			for(int i=0; i< grupo.getMembros(); i++) {
				Individuo pessoa = (Individuo)grupo.get(i);
				this.participantes.add(pessoa);
			}
		}

		public int totalParticipantes() {
			return this.participantes.size();
		}
		
		public String estaLotado() {
			int assentosDisponiveis = this.totalAssentos() - this.totalParticipantes();
			
			if(assentosDisponiveis < 0){
				return "O congresso está lotado e não tem assentos suficientes.";
			}
			else if (assentosDisponiveis == 0)
				return "O congresso está lotado com a capacidade máxima.";
			else 
				return "O congresso ainda possui " + assentosDisponiveis + " assentos disponíveis";
		}
}
