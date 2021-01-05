package hust.design_and_dev_software.design_pattern.singleton;

public class SingleObject {
	// đối tượng duy nhất
	private static SingleObject instance;

	// không cho phép khởi tạo đối tượng từ ngoài lớp
	private SingleObject() {

	}
	
	public static SingleObject getInstance() {
		if (instance == null) {
			instance = new SingleObject();
		}
		return instance;
	}
}
