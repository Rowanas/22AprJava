package vehicle;

public class Truck extends Vehicle {

	private String bedType = "Flatbed";

	public Truck(int id, int wheels, double engine, double totalCost, String bedType) {
		super(id, wheels, engine, totalCost);
	}

	public String getbedType() {
		return bedType;
	}

	@Override
	public double getEngine() {
		return engine = 10;
	}

	@Override
	public int getWheels() {
		return wheels = 8;
	}

	@Override
	public double getTotalCost() {
		return totalCost = engine % wheels * wheels + 1000;
	}

	@Override
	public String toString() {
		return "Truck [bedType=" + bedType + ", id=" + id + ", wheels=" + wheels + ", engine=" + engine + ", totalCost="
				+ totalCost + "]";
	}

}
