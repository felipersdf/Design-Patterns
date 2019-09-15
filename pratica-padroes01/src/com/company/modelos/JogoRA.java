package com.company.modelos;

public class JogoRA extends JogoDigital {
    private String dispositivo, marcador;

    public JogoRA(int idJogo, int quantidadeJogos, int quantidadePessoas, String nome, float quantidadeAluguel, int anoCriacao, String produtora, String dispositivo, String marcador) {
        super(idJogo, quantidadeJogos, quantidadePessoas, nome, quantidadeAluguel, anoCriacao, produtora);
        this.dispositivo = dispositivo;
        this.marcador = marcador;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }
}
