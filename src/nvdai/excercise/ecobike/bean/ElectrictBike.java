package nvdai.excercise.ecobike.bean;

public class ElectrictBike extends Bike {

	protected int battery;

	public ElectrictBike() {
		super();
	}

	public ElectrictBike(String id, int battery) {
		super(id);
		this.battery = battery;
	}

}
