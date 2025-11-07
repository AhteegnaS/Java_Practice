class Engine {
	String  fuelType;
	double power;
	public Engine(String fuelType, double power) {
		super();
		this.fuelType = fuelType;
		this.power = power;
	}
	
}
public class Car {
  String brand;
  String engine;
  
  Engine e = new Engine("petrol", 45.87);
}
