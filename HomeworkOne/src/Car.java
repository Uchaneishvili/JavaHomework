
public class Car {
	public String manufacturer;
	public String model;
	public String vin;
	public String color;
	public String interiorColor;
	
	
	public Car (String carManufacturer, String carModel, String vinCode, String carColor, String carInteriorColor) {
		this.manufacturer = carManufacturer;
		this.model = carModel;
		this.vin = vinCode;
		this.color = carColor;
		this.interiorColor = carInteriorColor;
	}

	public Car() {
		
	}
}

