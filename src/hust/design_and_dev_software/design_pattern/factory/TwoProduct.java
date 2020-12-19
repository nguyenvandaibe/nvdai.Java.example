package hust.design_and_dev_software.design_pattern.factory;

public class TwoProduct extends Product {

	@Override
	public TwoProduct createProduct() {
		return new TwoProduct();
	}

}
