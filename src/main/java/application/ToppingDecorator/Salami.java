package application.ToppingDecorator;

import application.ambstractEntities.Consumazione;

public class Salami extends ToppingDecorator {

	public Salami(Consumazione pizza) {
		super(pizza);
		this.name = "salame";
		this.prezzo = 0.99;
		this.calorie = 86;
	}

	public String StampAdd() {
		return this.name + " = calorie: " + this.calorie + ", prezzo: " + this.prezzo + "$";
	}
}
