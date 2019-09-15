package com.company.modelos;

import java.util.ArrayList;

public class JogoTabuleiro extends Jogo {
    private String estilo;
    private ArrayList<String> adereco;

    public JogoTabuleiro(int idJogo, int quantidadeJogos, int quantidadePessoas, String nome, float quantidadeAluguel, String estilo, ArrayList<String> adereco) {
        super(idJogo, quantidadeJogos, quantidadePessoas, nome, quantidadeAluguel);
        this.estilo = estilo;
        this.adereco = adereco;
    }

    public JogoTabuleiro() {}

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public ArrayList<String> getAdereco() {
        return adereco;
    }

    public void setAdereco(ArrayList<String> adereco) {
        this.adereco = adereco;
    }

    @Override
    public String toString() {
        return "JogoTabuleiro{" +
                "estilo='" + estilo + '\'' +
                ", adereco=" + adereco +
                '}';
    }

    public float calcularPrecoTotal() {
        float preco = getQuantidadeAluguel()/getQuantidadePessoas();
        float desconto = (preco*10)/100;
        float precoTotal = preco - desconto;

        return precoTotal;
    }
}
