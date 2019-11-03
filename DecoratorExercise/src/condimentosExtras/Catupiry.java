package condimentosExtras;

import model.CondimentoDecorator;
import model.Pizza;

public class Catupiry extends CondimentoDecorator{
	public Catupiry(Pizza pizza) {
		super(pizza);
		descricao = "Catupiry";
		preco = 2.0;
	}
}
