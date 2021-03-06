
public class HomeworkOne {

	public static void main(String[] args) {
		
		Car car = new Car ("Audi", "Q7","WBY1Z4C59GV506883","Silver","Black");
		
		System.out.println(car.manufacturer);
		System.out.println(car.model);
		System.out.println(car.vin);
		System.out.println(car.color);
		System.out.println(car.interiorColor);

		
		Car superCar = new Car ();
		superCar.manufacturer = "Ford";
		superCar.model = "Fusion";
		superCar.vin = "5YJ3E1EA1JF155066";
		superCar.color = "blue";
		superCar.interiorColor = "Black";
		
		System.out.println("");
		System.out.println(superCar.manufacturer);
		System.out.println(superCar.model);
		System.out.println(superCar.vin);
		System.out.println(superCar.color);
		System.out.println(superCar.interiorColor);
		
		
		

	}

}
