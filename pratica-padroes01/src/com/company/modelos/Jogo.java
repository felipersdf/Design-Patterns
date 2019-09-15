package com.company.modelos;

public abstract class Jogo {
    private int idJogo, quantidadeJogos, quantidadePessoas;
    private String nome;
    private float quantidadeAluguel;

    public abstract float calcularPrecoTotal();

    public Jogo(int idJogo, int quantidadeJogos, int quantidadePessoas, String nome, float quantidadeAluguel) {
        this.idJogo = idJogo;
        this.quantidadeJogos = quantidadeJogos;
        this.quantidadePessoas = quantidadePessoas;
        this.nome = nome;
        this.quantidadeAluguel = quantidadeAluguel;
    }

    public Jogo() {}

    public int getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    public int getQuantidadeJogos() {
        return quantidadeJogos;
    }

    public void setQuantidadeJogos(int quantidadeJogos) {
        this.quantidadeJogos = quantidadeJogos;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getQuantidadeAluguel() {
        return quantidadeAluguel;
    }

    public void setQuantidadeAluguel(float quantidadeAluguel) {
        this.quantidadeAluguel = quantidadeAluguel;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "idJogo=" + idJogo +
                ", quantidadeJogos=" + quantidadeJogos +
                ", quantidadePessoas=" + quantidadePessoas +
                ", nome='" + nome + '\'' +
                ", quantidadeAluguel=" + quantidadeAluguel +
                '}';
    }
}
