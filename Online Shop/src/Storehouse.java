import java.util.*;
public class Storehouse {
	
	private HashMap<String,Integer> storeHousePrices;
	private HashMap<String,Integer> storeHouseStocks;
	
	public Storehouse() {
		
		this.storeHousePrices = new HashMap<>();
		this.storeHouseStocks = new HashMap<>();
	}
	
	public void addProduct(String product,int price, int stock) {
		
		this.storeHousePrices.put(product,price);
		this.storeHouseStocks.put(product,stock);
	}
	
	public int price(String product) {
		
		if(this.storeHousePrices.containsKey(product)) {
			
			return this.storeHousePrices.get(product);
		}else {
			
			return -99;
		}
	}
	
	public int stock(String product) {
		
		if (this.storeHouseStocks.containsKey(product)) {
			
			return this.storeHouseStocks.get(product);
		}else {
			
			return 0;
		}
	}
	
	public boolean take(String product) {
		
		if (this.storeHouseStocks.containsKey(product) && this.storeHouseStocks.get(product)>0){
			
			int stock = this.storeHouseStocks.get(product);
			stock--;
			this.storeHouseStocks.put(product,stock);
			
			return true;
			
		}else {
			
			return false;
		}
	}
	
	public Set<String> products(){
		
		return this.storeHousePrices.keySet();
	}
}