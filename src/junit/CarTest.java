package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import car.Car;

public class CarTest {

	@Test
	public void test() {
		Car car = new Car("BMW", "320i Saloon");
		assertTrue(car.getMake().equals("BMW"));
		assertTrue(car.getModel().equals("320i Saloon"));
	}

}
