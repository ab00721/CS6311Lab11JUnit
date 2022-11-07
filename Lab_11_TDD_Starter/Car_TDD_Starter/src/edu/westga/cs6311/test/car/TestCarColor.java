package edu.westga.cs6311.test.car;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.cs6311.model.Car;

public class TestCarColor {
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
		assertEquals("Blue", this.myTestCar.getColor(), "Testing get car color");
	}

	@Test
	void TestInvalidNullChangeCarColor() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.myTestCar.setCarColor(null);
		});
	}

	@Test
	void TestInvalidEmptyChangeCarColor() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.myTestCar.setCarColor("");
		});
	}

	@Test
	void TestValidChangeCarColor() {

		this.myTestCar.setCarColor("Green");

		assertEquals("Green", this.myTestCar.getColor(), "Testing update car color");
	}
}
