package vehicle;

public class Motorbike extends Vehicle {

	private boolean pillion = true;
	private int wheels = 2;

	public Motorbike(int id, int wheels, double engine, double totalCost, boolean pillion) {
		super(id, wheels, engine, totalCost);
		this.id = id;
		this.wheels = wheels;
	}

	public boolean getpillion() {
		return pillion;
	}

	@Override
	public int getWheels() {
		return wheels;
	}

	@Override
	public double getEngine() {
		return engine;
	}

	@Override
	public double getTotalCost() {
		return totalCost;
	}

	@Override
	public String toString() {
		return "Motorbike [pillion=" + pillion + ", id=" + id + ", wheels=" + wheels + ", engine=" + engine
				+ ", totalCost=" + totalCost + "]";
	}
}
