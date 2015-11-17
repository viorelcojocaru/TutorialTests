package commandPattern.command;

import commandPattern.Stock;


public class SellStock implements Order {
	private Stock abcStock;
	public SellStock(Stock stock) {
		this.abcStock=stock;
	}
	
	@Override
	public void execute() {
		abcStock.sell();

	}

}
