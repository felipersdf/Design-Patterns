package condimentosExtras;

import model.CondimentoDecorator;
import model.Pizza;

public class CreamCheese extends CondimentoDecorator{
	public CreamCheese(Pizza pizza){
		super(pizza);
		descricao = "Cream Cheese";
		preco = 2.5;
	}

}
