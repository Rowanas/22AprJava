package garage;

import vehicle.*;
import java.util.ArrayList;

public class Garage {

	public ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public void displayVehicles() {
		for (Vehicle Vehicle : this.vehicleList) {
			System.out.println(Vehicle);
		}

	}

	public void addVeh(Vehicle vehicle) {
		vehicleList.add(vehicle);
	}
// I tried to find a solution that used getClass, but couldn't. I had to borrow .getSimpleName
	public void removeType(String s) {
		for (int i=0; i <vehicleList.size(); i++) {
			Vehicle j = vehicleList.get(i);
			if (j.getClass().getSimpleName().equals(s)) {
				vehicleList.remove(i);
				i--;
			}
		}
	}

	public void emptyGarage() {
			vehicleList.clear();
		}

	public void fixVeh(int id) {
			vehicleList.remove(id);
		}
}
