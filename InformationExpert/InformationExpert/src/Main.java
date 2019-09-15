public class Main {
    public static void main(String[] args) {

        Fita fita1 = new Fita("O Rei Leao", Tipo.infantil);
        Fita fita2 = new Fita("Os Vingadores", Tipo.lancamento);
        Fita fita3 = new Fita("Titanic", Tipo.normal);

        Cliente cli1 = new Cliente("Felipe");
        Cliente cli2 = new Cliente("Maria");

        Aluguel aluguel1 = new Aluguel(fita1, 5);
        Aluguel aluguel2 = new Aluguel(fita3, 3);
        cli1.adicionaAluguel(aluguel1);
        cli1.adicionaAluguel(aluguel2);

        Aluguel aluguel3 = new Aluguel(fita2, 2);
        cli2.adicionaAluguel(aluguel3);
        cli2.adicionaAluguel(aluguel1);

        System.out.println(cli1.extrato());
        System.out.println(cli2.extrato());


    }
}
