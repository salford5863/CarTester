package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import car.FastCar;

public class FastCarTest {

	@Test
	public void test() {
		FastCar fastCar = new FastCar("BMW", "320M", 180);
		assertTrue(fastCar.getMake().equals("BMW"));
		assertTrue(fastCar.getModel().equals("320M"));
		assertTrue( fastCar.getSpeed() == 180);
	}

}
