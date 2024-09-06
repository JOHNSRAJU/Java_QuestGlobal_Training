package e_commerceSystem;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		Product product1 = new Product("P001", "Apple", 10, 8);
		Product product2 = new Product("P002", "Orange", 50, 10);
		Customer customer2 = new Customer("C002", "Toms", "toms@gmail.com");
		
		Order order1 = new Order("O001", customer2);
		System.out.println(order1.getItems());
		order1.addItem(product1,2);
		List<Product> items = order1.getItems();
		System.out.println("Current List");
		for(Product p:items) {
			System.out.println(p.getName());
		}
		order1.addItem(product2,2);
		System.out.println("Current List");
		for(Product p:items) {
			System.out.println(p.getName());
		}
		order1.removeItem(product2);
		System.out.println("Current List");
		for(Product p:items) {
			System.out.println(p.getName());
		}
		System.out.println("Total price - "+order1.calculate());
	}

}
