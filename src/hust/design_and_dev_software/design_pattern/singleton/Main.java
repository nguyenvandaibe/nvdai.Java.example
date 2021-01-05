package hust.design_and_dev_software.design_pattern.singleton;

public class Main {

	public static void main(String[] args) {
		System.out.println("--- Singleton Pattern ---");
		SingleObject instance1 = SingleObject.getInstance();
		SingleObject instance2 = SingleObject.getInstance();
		if (instance1.equals(instance2)) {
            System.out.println("Unique Instance");
        }
	}

}
