package builderPattern;

import builderPattern.burger.ChickenBurger;
import builderPattern.burger.VegBurger;
import builderPattern.drinks.Coke;
import builderPattern.drinks.Pepsi;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new Pepsi());
		meal.addItem(new VegBurger());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new Coke());
		meal.addItem(new ChickenBurger());
		return meal;
	}

	Meal customMeal = new Meal();

	public void chooseDrink(String drink, int items) {

		if (drink.equalsIgnoreCase("COKE")) {
			for (int i = 0; i < items; i++) {
				customMeal.addItem(new Coke());
			}
		} else if (drink.equalsIgnoreCase("PEPSI")) {
			for (int i = 0; i < items; i++) {
				customMeal.addItem(new Pepsi());
			}
		}
	}

	public void chooseBurger(String burger, int items) {
		if (burger.equalsIgnoreCase("VEGETAL")) {
			for (int i = 0; i < items; i++) {
				customMeal.addItem(new VegBurger());
			}
		} else if (burger.equalsIgnoreCase("CHICKEN")) {
			for (int i = 0; i < items; i++) {
				customMeal.addItem(new ChickenBurger());
			}
		}
	}

	public Meal prepareCustomMeal() {

		return customMeal;
	}
}
