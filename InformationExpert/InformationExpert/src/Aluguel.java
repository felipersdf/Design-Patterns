
public class Aluguel {
	private Fita fita;
    private int diasAlugada;


    public Aluguel(Fita fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }

    public Fita getFita() {
        return fita;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }

    public double calculaPreco(){

        double valorCorrente = 0.0;

        switch (getFita().getCodigoDePreco()) {
            case normal:
                valorCorrente += 2;
                if (getDiasAlugada() > 2) {
                    valorCorrente += (getDiasAlugada() - 2) * 1.5;
                }
                break;
            case lancamento:
                valorCorrente += getDiasAlugada() * 3;
                break;
            case infantil:
                valorCorrente += 1.5;
                if (getDiasAlugada() > 3) {
                    valorCorrente += (getDiasAlugada() - 3) * 1.5;
                }
                break;
        }
        return valorCorrente;
    }

}
