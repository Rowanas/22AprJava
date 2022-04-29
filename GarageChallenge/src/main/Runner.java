package main;

import garage.Garage;
import vehicle.*;

public class Runner {

	public static void main(String[] args) {

		Garage gar = new Garage();

		Motorbike M1 = new Motorbike(1, 2, 0.25, 7.64, true);
		Car C1 = new Car(2, 4, 1.2, 123.87, "La Cucaracha");
		Truck T1 = new Truck(3, 8, 10, 1024.65, "Flatbed");
		gar.addVeh((Vehicle) M1);
		gar.addVeh((Vehicle) C1);
		gar.addVeh((Vehicle) T1);
		gar.displayVehicles();
		gar.removeType("Truck");
		gar.displayVehicles();				
		gar.fixVeh(1);
		gar.displayVehicles();


	}
}
