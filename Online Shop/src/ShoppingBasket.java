import java.util.*;
public class ShoppingBasket {
	
	private HashMap<String,Purchase>basket;
	
	public ShoppingBasket() {
		this.basket = new HashMap<>();
	}
	
	public void add(String product,int price) {
		
		if (this.basket.containsKey(product)) {
			
			this.basket.get(product).increaseAmount();
		}else {
			
			Purchase purchase = new Purchase(product,1,price);
			this.basket.put(product,purchase);
		}
	}
	
	public int price() {
		
		int priceBasket = 0;
		
		for (Purchase p : this.basket.values()) {
			
			priceBasket = priceBasket + p.price();
		}
		
		return priceBasket;
	}
	
	public void print() {
		
		for (Purchase p: this.basket.values()) {
			
			System.out.println(p);
		}
	}
}