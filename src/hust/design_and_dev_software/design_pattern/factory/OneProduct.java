package hust.design_and_dev_software.design_pattern.factory;

public class OneProduct extends Product{
//	static {
//		ProductFactory productFactory = new ProductFactory();
//		productFactory.registerProduct("ID1", new OneProduct());
//	}
	
	

	@Override
	public OneProduct createProduct() {
		return new OneProduct();
	}

}
