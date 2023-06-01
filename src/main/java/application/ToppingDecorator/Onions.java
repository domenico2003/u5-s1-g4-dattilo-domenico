package application.ToppingDecorator;

import application.ambstractEntities.Consumazione;

public class Onions extends ToppingDecorator {

	public Onions(Consumazione pizza) {
		super(pizza);
		this.name = "cipolla";
		this.prezzo = 0.69;
		this.calorie = 22;
	}

	public String StampAdd() {
		return this.name + " = calorie: " + this.calorie + ", prezzo: " + this.prezzo + "$";
	}
}
