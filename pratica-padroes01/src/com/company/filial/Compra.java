package com.company.filial;

import com.company.modelos.Jogo;

import java.util.ArrayList;

public class Compra {
    private ArrayList<Jogo> jogos;
    private int tempo;
    private Cliente cliente;
    private Funcionario funcionario;

    public Compra(ArrayList<Jogo> jogos, int tempo, Cliente cliente, Funcionario funcionario) {
        this.jogos = jogos;
        this.tempo = tempo;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    public Compra() {}

    public ArrayList<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(ArrayList<Jogo> jogos) {
        this.jogos = jogos;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public float calcularCompra(){
        float precoTotal = 0;

        for(Jogo j: jogos){
            precoTotal += j.calcularPrecoTotal();
        }

        return precoTotal * tempo;
    }
}
