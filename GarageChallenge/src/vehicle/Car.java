package vehicle;

public class Car extends Vehicle {

	private final String hornPlays = "La Cucaracha";

	public Car(int id, int wheels, double engine, double totalCost, String hornPlays) {
		super(id, wheels, engine, totalCost);

	}

	public String gethornPlays() {
		return hornPlays;
	}

	@Override
	public double getEngine() {
		return engine = 1.5;
	}

	@Override
	public double getTotalCost() {
		return totalCost=wheels*engine;
	}
	

	@Override
	public String toString() {
		return "Car [hornPlays=" + hornPlays + ", id=" + id + ", wheels=" + wheels + ", engine=" + engine
				+ ", totalCost=" + totalCost + "]";
	}

}
