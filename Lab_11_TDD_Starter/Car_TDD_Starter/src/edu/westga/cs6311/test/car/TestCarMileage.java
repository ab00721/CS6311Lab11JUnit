package edu.westga.cs6311.test.car;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.cs6311.model.Car;

class TestCarMileage {

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
	void TestGetCarMileage() {
		assertEquals(0, this.myTestCar.getMileage(), "Testing get car price");
	}
	
	@Test
	void TestGetCarDemoMileage() {
		assertEquals(0, this.myTestCar.getDemoMileage(), "Testing get car price");
	}
	
	@Test
	void TestInvalidICarMileageAdjustment() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.myTestCar.adjustMileage(0);
		});	
	}
	
	@Test
	void TestValidCarMileageAdjustment() {
		this.myTestCar.adjustMileage(1);
		
		assertEquals(1, this.myTestCar.getMileage(), "Testing get car price");
	}
	
	@Test
	void TestInvalidCarDemoMileageAdjustment() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.myTestCar.adjustDemoMileage(0);
		});	
	}
	
	@Test
	void TestValidCarDemoMileageAdjustment() {
		this.myTestCar.adjustDemoMileage(1);
		
		assertEquals(1, this.myTestCar.getDemoMileage(), "Testing get car price");
	}
}
