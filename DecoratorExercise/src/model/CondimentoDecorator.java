package model;

public abstract class CondimentoDecorator extends Pizza{
	Pizza pizza;
	
	public CondimentoDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

    public String getDescricao() {
        return pizza.getDescricao() + " + " + descricao;
    }
 
    public double getPreco() {
        return pizza.getPreco() + preco;
    }

}
