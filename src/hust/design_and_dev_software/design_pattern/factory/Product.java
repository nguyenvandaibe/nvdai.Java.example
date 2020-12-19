package hust.design_and_dev_software.design_pattern.factory;

public abstract class Product {
	protected String name;
	
	public abstract Product createProduct();
}
