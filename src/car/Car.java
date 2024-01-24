package car;

public class Car {
	private String make = null;
	private String model = null;

	public Car(String make, String model) {
		super();
		this.make = make;
		this.model = model;
	}

	public Car() {
		super();
		this.make = null;
		this.model = null;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
