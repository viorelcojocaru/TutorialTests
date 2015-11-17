package builderPattern;

import java.util.Date;

public class BuilderPatternDemo {

	/**
	 * @param args
	 * 
	 * 
	 */

	public static void main(String[] args) {
		 MealBuilder mealBuilder=new MealBuilder();
		Meal nonVegMeal= mealBuilder.prepareNonVegMeal();
		nonVegMeal.showItems();
		System.out.println(nonVegMeal.getCost());
		System.out.println("---------------------------");
		System.out.println("Date"+new Date(System.currentTimeMillis()));
		Meal vegMeal=mealBuilder.prepareVegMeal();
		vegMeal.showItems();
		System.out.println(vegMeal.getCost());
		System.out.println("---------------------------");
		System.out.println("Date"+new Date(System.currentTimeMillis()));
		
		mealBuilder.chooseBurger("VEGETAL",1);
		mealBuilder.chooseDrink("Coke",3);
		mealBuilder.chooseBurger("CHICKEN",2);
		mealBuilder.chooseDrink("pepsi", 20);
		Meal customMeal=mealBuilder.prepareCustomMeal();
		customMeal.showItems();
		System.out.println(customMeal.getCost());
		
	}

}
