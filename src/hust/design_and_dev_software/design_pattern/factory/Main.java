package hust.design_and_dev_software.design_pattern.factory;

public class Main {
//	static {
//		try {
//			Class.forName("OneProduct");
//			System.out.println("Class loading");
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	public static void main(String[] args) {
		ProductFactory factory = new ProductFactory();
		factory.registerProduct("ID1", new OneProduct(""));
		factory.registerProduct("ID2", new TwoProduct(""));
		OneProduct p1 = (OneProduct) factory.createProduct("ID1", "The first product");
		TwoProduct p2 = (TwoProduct) factory.createProduct("ID2", "The second product");
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
	}

}
