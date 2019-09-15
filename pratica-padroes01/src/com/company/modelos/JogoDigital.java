package com.company.modelos;

public class JogoDigital extends Jogo {
    private int anoCriacao;
    private String produtora;

    public JogoDigital(int idJogo, int quantidadeJogos, int quantidadePessoas, String nome, float quantidadeAluguel, int anoCriacao, String produtora) {
        super(idJogo, quantidadeJogos, quantidadePessoas, nome, quantidadeAluguel);
        this.anoCriacao = anoCriacao;
        this.produtora = produtora;
    }

    public JogoDigital() {}

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public float calcularPrecoTotal() {
        float preco = getQuantidadeAluguel()/getQuantidadePessoas();

        return preco;
    }
}
