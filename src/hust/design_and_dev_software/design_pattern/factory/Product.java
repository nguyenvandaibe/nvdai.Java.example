package hust.design_and_dev_software.design_pattern.factory;

public abstract class Product {
	protected String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract Product createProduct(String productName);
}
