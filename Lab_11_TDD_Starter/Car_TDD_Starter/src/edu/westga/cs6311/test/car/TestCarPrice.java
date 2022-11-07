package edu.westga.cs6311.test.car;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.cs6311.model.Car;

class TestCarPrice {

	private Car myTestCar;

	@BeforeEach
	void setUp() {
		this.myTestCar = new Car("Model 3", "Tesla", 35000, 0, "Blue");
	}

	@AfterEach
	void tearDown(){

		this.myTestCar = null;
	}

	@Test
	void TestGetCarPrice() {
		assertEquals(35000, this.myTestCar.getPrice(), "Testing get car price");
	}

	@Test
	void TestInvalidDiscountCarPrice() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.myTestCar.discountPrice(35000);
		});
	}

	@Test
	void TestValidDiscountCarPrice() {
		this.myTestCar.discountPrice(34999);

		assertEquals(1, this.myTestCar.getPrice(), "Testing discount car price");
	}	
}
