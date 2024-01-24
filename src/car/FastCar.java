package car;

public class FastCar extends Car {
	private int speed = 0;

	public FastCar(String make, String model, int speed) {
		super();
		this.setMake(make);
		this.setModel(model);
		this.speed = speed;
	}

	public FastCar() {
		super();
		this.speed = 0;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
