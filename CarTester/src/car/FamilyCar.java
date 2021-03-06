package car;

public class FamilyCar extends Car {
	private int seats = 0;

	public FamilyCar(String make, String model, int seats) {
		super(make, model);
		this.seats = seats;
	}

	public FamilyCar() {
		super();
		this.seats = 0;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
}
