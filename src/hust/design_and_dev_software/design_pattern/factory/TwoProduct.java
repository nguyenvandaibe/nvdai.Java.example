package hust.design_and_dev_software.design_pattern.factory;

public class TwoProduct extends Product {
	
	public TwoProduct(String productName) {
		this.name=productName;
	}

	@Override
	public TwoProduct createProduct(String productName) {
		return new TwoProduct(productName);
	}

}
