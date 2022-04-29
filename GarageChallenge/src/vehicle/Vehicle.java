package vehicle;

public class Vehicle {

	public int id;
	public int wheels;
	public double engine;
	public double totalCost;
	
	public Vehicle(int id, int wheels, double engine, double totalCost) {
		super();
		this.id=id;
		this.wheels=wheels;
		this.engine=engine;
		this.totalCost=totalCost;
		
		
	}

	public String toString() {
		return "Vehicle [id=" + id + ")\t " + "wheels=" + wheels + ", engine=" + engine + ", totalCost=" + totalCost
				+ "]";
	}

	public int getId() {
		return id;
	}

	public int getWheels() {
		return wheels;
	}

	public double getEngine() {
		return engine;
	}

	public double getTotalCost() {
		return totalCost;
	}
	
	
}
