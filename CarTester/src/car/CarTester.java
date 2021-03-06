package car;

public class CarTester {

	public static void main(String[] args) {
		System.out.println("Car Toy Application");

		Car car = new Car("BMW", "320i Saloon");
		FastCar fastCar = new FastCar("BMW", "M320", 180);
		FamilyCar familyCar = new FamilyCar("BMW", "320i Tourer", 5);

		System.out.println("Car " + car.getMake() + " " + car.getModel());
		System.out.println("Fast Car " + fastCar.getMake() + " " + fastCar.getModel());
		System.out.println("Family Car " + familyCar.getMake() + " " + familyCar.getModel());
	}

}
