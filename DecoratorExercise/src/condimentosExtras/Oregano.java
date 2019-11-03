package condimentosExtras;

import model.CondimentoDecorator;
import model.Pizza;

public class Oregano extends CondimentoDecorator{
	public Oregano(Pizza pizza) {
		super(pizza);
		descricao = "Oregano";
		preco = 0.2;
	}

}
