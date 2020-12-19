package hust.design_and_dev_software.design_pattern.factory;

public class OneProduct extends Product{
//	static {
//		ProductFactory productFactory = new ProductFactory();
//		productFactory.registerProduct("ID1", new OneProduct());
//	}
	
	public OneProduct(String productName) {
		this.name = productName;
	}

	@Override
	public OneProduct createProduct(String productName) {
		return new OneProduct(productName);
	}

}
