package commandPattern;

import java.util.ArrayList;
import java.util.List;

import commandPattern.command.Order;

public class Brocker {
	private List<Order> orderList = new ArrayList<Order>();

	public void takeOrder(Order order) {
		orderList.add(order);
	}

	public void placeOrders(){
		
		for (Order oneOrder : orderList) {
			oneOrder.execute();
		}
		orderList.clear();
	}
}
