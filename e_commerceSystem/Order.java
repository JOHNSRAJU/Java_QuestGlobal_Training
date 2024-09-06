package e_commerceSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Order {
	private String orderId;
	private Customer customer;
	private List<Product> items;
	private Map<Product,Double> productQuantities;

	public String getOrderId() {
		return orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public List<Product> getItems() {
		return items;
	}
	public Order(String orderId, Customer customer) {
		this.orderId = orderId;
		this.customer = customer;
		this.items = new ArrayList<Product>();
		this.productQuantities=new HashMap<Product, Double>();
	}
	
	void addItem(Product item,double quantity) {
		boolean itHas = false;
		for(Product list:items) {
			if(list.getProductId().equals(item.getProductId())) {
				System.out.println("Its already added");
				itHas=true;
			}
		}
		if(itHas==false) {
			items.add(item);
			System.out.println("Its added successfully");
			productQuantities.put(item, quantity);
		}
	}
	void removeItem(Product item) {
		items.remove(item);
		productQuantities.remove(item);
	}
	double calculate() {
		double total=0;
		for(Product list:items) {
			total=productQuantities.get(list)*list.getPrice();
		}
		return total;
	}
		
}
