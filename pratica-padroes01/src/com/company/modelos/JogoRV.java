package com.company.modelos;

public class JogoRV extends JogoDigital{
    private String tipoCapacete, estereoscopia;

    public JogoRV(int idJogo, int quantidadeJogos, int quantidadePessoas, String nome, float quantidadeAluguel, int anoCriacao, String produtora, String tipoCapacete, String estereoscopia) {
        super(idJogo, quantidadeJogos, quantidadePessoas, nome, quantidadeAluguel, anoCriacao, produtora);
        this.tipoCapacete = tipoCapacete;
        this.estereoscopia = estereoscopia;
    }

    public JogoRV() {}

    public String getTipoCapacete() {
        return tipoCapacete;
    }

    public void setTipoCapacete(String tipoCapacete) {
        this.tipoCapacete = tipoCapacete;
    }

    public String getEstereoscopia() {
        return estereoscopia;
    }

    public void setEstereoscopia(String estereoscopia) {
        this.estereoscopia = estereoscopia;
    }

    public float calcularPrecoTotal() {
        float preco = getQuantidadeAluguel()/getQuantidadePessoas();
        float desconto = (preco*20)/100;
        float precoTotal = preco - desconto;

        return precoTotal;
    }
}
