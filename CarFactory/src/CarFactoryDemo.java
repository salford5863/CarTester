
public class CarFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Car Factory");
		
		CarFactory carFactory = new CarFactory();
		Car car1 = carFactory.getCar("Fast");
		System.out.println(car1.model());
		Car car2 = carFactory.getCar("Family");
		System.out.println(car2.model());
	}

}
