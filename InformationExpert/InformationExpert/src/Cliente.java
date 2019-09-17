import java.util.ArrayList;
import java.util.Collection;

public class Cliente {
    private String nome;
    private Collection<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        fitasAlugadas.add(aluguel);
    }

    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;

        for (Aluguel al : fitasAlugadas) {
            // trata de pontos de alugador frequente
            pontosDeAlugadorFrequente++;
            // adiciona bonus para aluguel de um lançamento por pelo menos 2 dias
            if (al.getFita().isLancamento() && al.getDiasAlugada() > 1) {
                pontosDeAlugadorFrequente++;
            }
            // mostra valores de cada aluguel
            resultado += "\t" + al.getFita().getTitulo() + "\t"
                    + al.calculaPreco() + fimDeLinha;
            valorTotal += al.calculaPreco();
        }
        // adiciona rodapé
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente
                + " pontos de alugador frequente";
        return resultado;
    }
 }
