package commandPattern.command;

import commandPattern.Stock;


public class BuyStock implements Order {
	private Stock abcStock;
	
	public BuyStock(Stock stock) {
		this.abcStock=stock;
	}

	@Override
	public void execute() {
		abcStock.buy();

	}

}
