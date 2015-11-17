package commandPattern;

import commandPattern.command.BuyStock;
import commandPattern.command.SellStock;

public class CommandPatternDemo {

	public static void main(String[] args) {

		Stock abcStock = new Stock();

		BuyStock buyStock = new BuyStock(abcStock);
		SellStock sellStock = new SellStock(abcStock);

		Brocker broker = new Brocker();
		broker.takeOrder(buyStock);
		broker.takeOrder(buyStock);
		broker.takeOrder(buyStock);
		broker.takeOrder(buyStock);
		broker.takeOrder(sellStock);

		broker.placeOrders();
		System.out.println("-----------------");
		broker.takeOrder(sellStock);
		broker.placeOrders();
	}
}
