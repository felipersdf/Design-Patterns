package condimentosExtras;

import model.CondimentoDecorator;
import model.Pizza;

public class Bacon extends CondimentoDecorator {
	public Bacon (Pizza pizza) {
		super(pizza);
		descricao = "Bacon";
		preco = 2.0;
	}

}
