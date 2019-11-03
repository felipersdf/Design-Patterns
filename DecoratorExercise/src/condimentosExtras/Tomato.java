package condimentosExtras;

import model.CondimentoDecorator;
import model.Pizza;

public class Tomato extends CondimentoDecorator{
	public Tomato(Pizza pizza) {
		super(pizza);
		descricao = "Tomato";
		preco = 0.5;
	}

}
