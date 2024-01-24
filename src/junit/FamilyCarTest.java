package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import car.FamilyCar;

public class FamilyCarTest {

	@Test
	public void test() {
		FamilyCar familyCar = new FamilyCar("BMW", "320M", 5);
		assertTrue(familyCar.getMake().equals("BMW"));
		assertTrue(familyCar.getModel().equals("320M"));
		assertTrue(familyCar.getSeats() == 5);
	}

}
