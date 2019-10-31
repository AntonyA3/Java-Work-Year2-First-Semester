package main;
import lib.OrderLine;
import java.util.ArrayList;

public class OrderListDemo {
	public static void main(String[] args) {
		ArrayList<OrderLine> orders = new ArrayList<>();
		
		orders.add(new OrderLine("Milk", 100, 30));
		orders.add(new OrderLine("Oranges",20,10));
		orders.add(new OrderLine("Eggs", 40, 300));
		orders.add(new OrderLine("Grapes",2,10));
		
		
		orders.stream().forEach(order -> System.out.println(order.toString()));
		int cost = orders.stream().mapToInt(order -> order.getCost()).sum();
		int ordersLength = orders.size();
		double averageCost = cost/ordersLength;
		
		System.out.println(cost+","+ ordersLength+"," + averageCost);
		
		
		
	}
	

}
