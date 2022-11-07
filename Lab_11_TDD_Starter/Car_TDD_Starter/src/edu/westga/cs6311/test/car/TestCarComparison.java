package edu.westga.cs6311.test.car;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.cs6311.model.Car;

public class TestCarComparison {
	private Car myTestCarOne;
	private Car myTestCarTwo;
	private Car myTestCarThree;

	@BeforeEach
	void setUp() {
		this.myTestCarOne = new Car("Model 3", "Tesla", 35000, 0, "Blue");
		this.myTestCarTwo = new Car("Model Y", "Tesla", 63000, 2500, "Red");
		this.myTestCarThree = new Car("Model 3", "Tesla", 35001, 2501, "Yellow");
	}

	@AfterEach
	void tearDown() {

		this.myTestCarOne = null;
		this.myTestCarTwo = null;
		this.myTestCarThree = null;
	}

	@Test
	void TestCarMileageIsNotSame() {
		assertFalse(this.myTestCarOne.mileageIsEqual(this.myTestCarTwo));
	}
	
	@Test
	void TestCarMileageIsSame() {
		this.myTestCarOne.adjustMileage(this.myTestCarTwo.getMileage());
		
		assertTrue(this.myTestCarOne.mileageIsEqual(this.myTestCarTwo));
	}
	
	@Test
	void TestCarColorIsNotSame() {
		assertFalse(this.myTestCarOne.colorIsSame(this.myTestCarTwo));
	}
	
	@Test
	void TestCarColorIsSame() {
		this.myTestCarOne.setCarColor(this.myTestCarTwo.getColor());
		
		assertTrue(this.myTestCarOne.colorIsSame(this.myTestCarTwo));
	}
	
	@Test
	void TestCarModelAndPriceIsNotSame() {
		assertFalse(this.myTestCarOne.modelAndPriceIsSame(this.myTestCarTwo));
	}
	
	@Test
	void TestCarModelAndPriceIsSame() {
		this.myTestCarOne = this.myTestCarThree;
		
		assertTrue(this.myTestCarOne.modelAndPriceIsSame(this.myTestCarThree));
	}	
}
