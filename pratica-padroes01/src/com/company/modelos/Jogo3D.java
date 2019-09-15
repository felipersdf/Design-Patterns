package com.company.modelos;

public class Jogo3D extends JogoDigital {
    private String console;
    private int tipoControle;

    public Jogo3D(int idJogo, int quantidadeJogos, int quantidadePessoas, String nome, float quantidadeAluguel, int anoCriacao, String produtora, String console, int tipoControle) {
        super(idJogo, quantidadeJogos, quantidadePessoas, nome, quantidadeAluguel, anoCriacao, produtora);
        this.console = console;
        this.tipoControle = tipoControle;
    }

    public Jogo3D() {}

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public int getTipoControle() {
        return tipoControle;
    }

    public void setTipoControle(int tipoControle) {
        this.tipoControle = tipoControle;
    }
}
