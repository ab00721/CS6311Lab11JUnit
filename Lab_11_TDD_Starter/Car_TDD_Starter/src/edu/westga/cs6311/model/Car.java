package edu.westga.cs6311.model;

/**
 * Car model - functionality/design driven by the tests located within project.
 * 
 * @author CS6311
 * @version Fall 2022
 *
 */
public class Car {
	private String model; 
	private String make;
	private int price;
	private int miles;
	private String color;
	
	/**
	 * Creates new car and sets the make, model, price, miles, and color
	 * 
	 * @precondition Make, model, and color are not null or empty. Price and Miles are not negative. 
	 * @postcondition getModel() == model, getMake() == make, getPrice() == price, getTotalMiles() == miles, && getColor() == color. 
	 * 
	 * @param model to set car model
	 * @param make to set car make 
	 * @param price to set car price 
	 * @param miles to set car miles
	 * @param color to set car color 
	 */
	public Car(String model, String make, int price, int miles, String color) {
		
		if (model == null) {
			throw new IllegalArgumentException("Model can not be null");
		}
		
		if (model.length() == 0) {
			throw new IllegalArgumentException("Model can not be empty");
		}
		
		if (make == null) {
			throw new IllegalArgumentException("Make can not be null");
		}
		
		if (make.length() == 0) {
			throw new IllegalArgumentException("Make can not be empty");
		}
		
		if (price < 0) {
			throw new IllegalArgumentException("Price can not be negative");
		}
		
		if (miles < 0) {
			throw new IllegalArgumentException("Miles can not be negative");
		}
		
		if (color == null) {
			throw new IllegalArgumentException("Color can not be null");
		}
		
		if (color.length() == 0) {
			throw new IllegalArgumentException("Color can not be empty");
		}
			
		this.setModel(model);
		this.setMake(make);
		this.setPrice(price);
		this.setMileage(miles);
		this.setCarColor(color);		
	}
	
	/**
	 * Subtracts discount price from price and sets price to difference 
	 * 
	 * @precondition discount price is not the same as price
	 * @postcondition getPrice() == (price - discountPrice)
	 * 
	 * @param discountPrice to set discount price 
	 */
	public void discountPrice(int discountPrice) {
		
		if (discountPrice == this.getPrice()) {
			throw new IllegalArgumentException("discount price can not be same as price");
		}
		
		int newPrice = this.getPrice() - discountPrice;
		this.setPrice(newPrice);
	}
	
	/**
	 * Adds adjusted miles to miles and sets miles to sum 
	 * 
	 * @precondition adjust amount is not 0
	 * @postcondition getMileage() == (miles + adjustMiles)
	 * 
	 * @param adjustMiles to set number of miles to add  
	 */
	public void adjustMileage(int adjustMiles) {
		
		if (adjustMiles == 0) {
			throw new IllegalArgumentException("Mileage can not be adjusted by 0"); 
		}
		
		int newMiles = this.getMileage() + adjustMiles;
		this.setMileage(newMiles);
	}
	
	/**
	 * Adds adjusted miles to demo miles and sets miles to sum 
	 * 
	 * @precondition adjust amount is not 0
	 * @postcondition getMileage() == (miles + adjustMiles)
	 * 
	 * @param adjustDemoMiles to set number of miles to add  
	 */
	public void adjustDemoMileage(int adjustDemoMiles) {
		
		if (adjustDemoMiles == 0) {
			throw new IllegalArgumentException("Demo mileage can not be adjusted by 0"); 
		}
		
		int newDemoMiles = this.getDemoMileage() + adjustDemoMiles;
		this.setDemoMileage(newDemoMiles);
	}
	
	/**
	 * Checks if this car has same mileage as input car 
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @param car to set input car 
	 * @return true if cars have same mileage and false if cars have different mileage 
	 */
	public boolean mileageIsEqual(Car car) {
		
		if (this.getMileage() == car.getMileage()) {
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if this car has same color as input car 
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @param car to set input car 
	 * @return true if cars have same color and false if cars have different color 
	 */
	public boolean colorIsSame(Car car) {
		
		if (this.getColor() == car.getColor()) {
			return true; 
		}
		return false;
	}
	
	/**
	 * Checks if this car has same model and price as input car 
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @param car to set input car 
	 * @return true if cars have same model and price and false if cars have different model or price  
	 */
	public boolean modelAndPriceIsSame(Car car) {
		
		if (this.getModel() == car.getModel() && this.getPrice() == car.getPrice()) {
			return true;
		}
		return false;
	}
	
	/**
	 * Getter for the car model
	 * 
	 * @return the model of the car 
	 */
	public String getModel() {
		return this.model;
	}
	
	/**
	 * Getter for the car make
	 * 
	 * @return the make of the car 
	 */
	public String getMake() {
		return this.make;
	}
	
	/**
	 * Getter for the car price
	 * 
	 * @return the price of the car 
	 */
	public int getPrice() {
		return this.price;
	}
	
	/**
	 * Getter for the car total miles
	 * 
	 * @return the total miles on the car 
	 */
	public int getTotalMiles() {
		return this.miles;
	}
	
	/**
	 * Getter for the car mileage
	 * 
	 * @return the miles on the car
	 */
	public int getMileage() {
		return this.miles;
	}
	
	/**
	 * Getter for the car demo mileage
	 * 
	 * @return the mileage on the car 
	 */
	public int getDemoMileage() {
		return this.miles;
	}
	
	/**
	 * Getter for the car color
	 * 
	 * @return the color of the car 
	 */
	public String getColor() {
		return this.color;
	}
	
	/**
	 * Setter for the car model
	 * 
	 * @param model the model of the car 
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	/**
	 * Setter for the car make
	 * 
	 * @param make the make of the car 
	 */
	public void setMake(String make) {
		this.make = make;
	}
	
	/**
	 * Setter for the car price
	 * 
	 * @param price the price of the car 
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	/**
	 * Setter for the car mileage
	 * 
	 * @param miles the mileage on the car 
	 */
	public void setMileage(int miles) {
		this.miles = miles;
	}
	
	/**
	 * Setter for the car demo mileage 
	 * 
	 * @param demoMiles the demo mileage on the car 
	 */
	public void setDemoMileage(int demoMiles) {
		this.miles = demoMiles;
	}
	
	/**
	 * Setter for the car color
	 * 
	 * @precondition color is not null or empty 
	 * @postcondition getColor() == color
	 * 
	 * @param color the color of the car 
	 */
	public void setCarColor(String color) {
		
		if (color == null) {
			throw new IllegalArgumentException("Color can not be null");
		}
		
		if (color.length() == 0) {
			throw new IllegalArgumentException("Color can not be empty");
		}
		
		this.color = color;
	}
}