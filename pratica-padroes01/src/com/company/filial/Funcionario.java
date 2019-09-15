package com.company.filial;

import com.company.modelos.Jogo;

public class Funcionario {
    private int idFunc;
    private String nomeFunc, filial;

    public Funcionario(int idFunc, String nomeFunc, String filial) {
        this.idFunc = idFunc;
        this.nomeFunc = nomeFunc;
        this.filial = filial;
    }
    public Funcionario() {}

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public String solicitarAluguel(Jogo idJogo){
        return "nomeJogo";
    }

    public float finalizaCompra(){
        return 0;
    }
}
