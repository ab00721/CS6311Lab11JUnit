package edu.westga.cs6311.test.car;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6311.model.Car;

class TestCarConstructor {

	@Test
	void TestNullMake() {
		assertThrows(IllegalArgumentException.class, ()-> { new Car("Model 3", null, 35000, 0, "Blue");});
	}

	@Test
	void TestEmptyMake() {
		assertThrows(IllegalArgumentException.class, ()-> { new Car("Model 3", "", 35000, 0, "Blue");});
	}

	@Test
	void TestNullModel() {
		assertThrows(IllegalArgumentException.class, ()-> { new Car(null, "Tesla", 35000, 0, "Blue");});
	}

	@Test
	void TestEmptyModel() {
		assertThrows(IllegalArgumentException.class, ()-> { new Car("", "Tesla", 35000, 0, "Blue");});
	}

	@Test
	void TestInvalidPrice() {
		assertThrows(IllegalArgumentException.class, ()-> { new Car("Model 3", "Tesla", -1, 0, "Blue");});
	}

	@Test
	void TestValidPrice() {
		Car myTestCar = new Car("Model 3", "Tesla", 1, 0, "Blue");

		assertEquals(1, myTestCar.getPrice(), "Testing car price");
	}

	@Test
	void TestInvalidMiles() {
		assertThrows(IllegalArgumentException.class, ()-> { new Car("Model 3", "Tesla", 1, -1, "Blue");});
	}

	@Test
	void TestValidMiles() {
		Car myTestCar = new Car("Model 3", "Tesla", 1, 1, "Blue");

		assertEquals(1, myTestCar.getTotalMiles(), "Testing car mileage");
	}

	@Test
	void TestNullColor() {
		assertThrows(IllegalArgumentException.class, ()-> { new Car("Model 3", "Tesla", 1, 1, null);});
	}

	@Test
	void TestEmptyColor() {
		assertThrows(IllegalArgumentException.class, ()-> { new Car("Model 3", "Tesla", 1, 1, "");});
	}

}
