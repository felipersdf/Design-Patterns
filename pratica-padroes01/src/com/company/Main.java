package com.company;

import com.company.filial.Cliente;
import com.company.filial.Compra;
import com.company.filial.Funcionario;
import com.company.modelos.*;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//========== Declaraçao das Variaveis =============
        Jogo3D jogo1;
        JogoDigital jogo2;
        JogoRA jogo3;
        JogoRV jogo4;
        JogoTabuleiro jogo5;
        Jogo2D jogo6;

        ArrayList<String> aderecos = new ArrayList<String>();
        aderecos.add("Adereco1");
        aderecos.add("Adereco2");

        Cliente cli,cli2, cli3;
        Compra c1,c2,c3,c4,c5;
        Funcionario fun1,fun2;
//========================================================
//============ Instanciaçao dos objetos ================
        fun1 = new Funcionario(01, "Felipe", "IF Games");
        fun2 = new Funcionario(02, "Maria", "IF Games");

        cli = new Cliente(01, "Joao");
        cli2 = new Cliente (02, "Pedro");
        cli3 = new Cliente (03, "Kamylla");

        jogo1 = new Jogo3D (01, 2, 2, "Top Gear 5000", 2.0f, 2000, "Produtora X", "Playstation", 1);
        jogo2 = new JogoDigital(02,1,1,"Megaman X", 3.0f, 1990, "Konami");
        jogo3 = new JogoRA(03,5,1,"Digimon GO", 5.0f, 2013, "Toei", "Android", "MarcX");
        jogo4 = new JogoRV(04,2,1,"IronMan RV", 10.0f, 2019, "Marvel Games", "C1", "S");
        jogo5 = new JogoTabuleiro(05, 6, 5, "WAR", 50.0f, "Estrategia",aderecos);
        jogo6 = new Jogo2D(06, 02, 1, "Super Mario", 6.0f, 1980, "Nintendo", "Super Nintendo" , 2);

        ArrayList<Jogo> pack1 = new ArrayList<Jogo>();
        pack1.add(jogo5);
        pack1.add(jogo2);

        ArrayList<Jogo> pack2 = new ArrayList<Jogo>();
        pack2.add(jogo3);

        ArrayList<Jogo> pack3 = new ArrayList<Jogo>();
        pack3.add(jogo2);
        pack3.add(jogo3);

        c1 = new Compra (pack1,2, cli, fun1);
        c2 = new Compra (pack2, 3, cli2, fun2);
        c3 = new Compra (pack3, 5, cli3, fun1);
//===================================================================
        System.out.println("Preco Aluguel do Jogo 2 (Digital): "+jogo2.calcularPrecoTotal());
        System.out.println("Preco Aluguel do Jogo 3 (RA): "+jogo3.calcularPrecoTotal());
        System.out.println("Preco Aluguel do Jogo 5 (Tabuleiro): "+jogo5.calcularPrecoTotal()+"\n");

        System.out.println("O preço total da compra 1 foi de:"+ c1.calcularCompra());
        System.out.println("O preço total da compra 2 foi de:"+ c2.calcularCompra());
        System.out.println("O preço total da compra 3 foi de:"+ c3.calcularCompra()+"\n");



    }
}
