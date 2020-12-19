package hust.design_and_dev_software.design_pattern.factory;

import java.util.HashMap;

public class ProductFactory {
	@SuppressWarnings("rawtypes")
	private HashMap registerProductMap = new HashMap();
	
	@SuppressWarnings("unchecked")
	public void registerProduct(String productId, Product p) {
		registerProductMap.put(productId, p);
	}
	
	public Product createProduct(String productId, String productName) {
		return ((Product) registerProductMap.get(productId)).createProduct(productName);
	}
}
