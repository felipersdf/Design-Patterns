package com.company.modelos;

public class Jogo2D extends JogoDigital {
    private String dispositivo;
    private int tipoControle;

    public Jogo2D(int idJogo, int quantidadeJogos, int quantidadePessoas, String nome, float quantidadeAluguel, int anoCriacao, String produtora, String dispositivo, int tipoControle) {
        super(idJogo, quantidadeJogos, quantidadePessoas, nome, quantidadeAluguel, anoCriacao, produtora);
        this.dispositivo = dispositivo;
        this.tipoControle = tipoControle;
    }
    public Jogo2D() {}

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public int getTipoControle() {
        return tipoControle;
    }

    public void setTipoControle(int tipoControle) {
        this.tipoControle = tipoControle;
    }

}
