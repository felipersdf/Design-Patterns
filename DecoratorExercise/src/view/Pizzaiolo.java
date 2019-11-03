package view;

import condimentosExtras.Bacon;
import condimentosExtras.Catupiry;
import condimentosExtras.CreamCheese;
import condimentosExtras.Oregano;
import condimentosExtras.Tomato;
import condimentosFixos.Frango;
import condimentosFixos.Mozzarella;
import condimentosFixos.Pepperoni;
import model.Pizza;

public class Pizzaiolo {

	public static void main(String[] args) {
		//Pizza Mozzarella + Catupiry + Tomato
		Pizza pizzaM = new Mozzarella();
		pizzaM = new Catupiry(pizzaM);
		pizzaM = new Tomato (pizzaM);
		
		System.out.println("Pizza: " + pizzaM.getDescricao() + "\n R$: " + pizzaM.getPreco());
		
		// Pizza Pepperoni + Catupiry + Oregano + Bacon
		Pizza pizzaP = new Pepperoni();
		pizzaP = new Catupiry(pizzaP);
		pizzaP = new Oregano(pizzaP);
		pizzaP = new Bacon (pizzaP);
		
		System.out.println("Pizza: " + pizzaP.getDescricao() + "\n R$: " + pizzaP.getPreco());
		
		// Pizza Frango + Catupiry + Tomato + Oregano + Bacon + CreamCheese
		Pizza pizzaF = new Frango();
		pizzaF = new Catupiry(pizzaF);
		pizzaF = new Tomato(pizzaF);
		pizzaF = new Oregano(pizzaF);
		pizzaF = new Bacon(pizzaF);
		pizzaF = new CreamCheese(pizzaF);
		
		System.out.println("Pizza: " + pizzaF.getDescricao() + "\n R$: " + pizzaF.getPreco());

	}

}
