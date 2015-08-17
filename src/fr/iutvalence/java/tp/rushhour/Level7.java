package fr.iutvalence.java.tp.rushhour;

import java.util.LinkedList;
import java.util.List;

/**
 * @author thevenba
 *
 */
public class Level7 extends Board {

	@Override
	protected List<Vehicle> createVehicle() {
		// TODO Auto-generated method stub
		final List<Vehicle> vehicles = new LinkedList<>();
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 2, Color.RED, new Position(2, 2)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 2, Color.ORANGE, new Position(0, 3)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 2, Color.LIGHT_GREEN, new Position(1, 1)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 2, Color.PINK, new Position(1, 5)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 2, Color.DARK_GREEN, new Position(3, 5)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 2, Color.DARK_PURPLE, new Position(2, 3)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 2, Color.LIGHT_BLUE, new Position(1, 4)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 2, Color.LIGHT_YELLOW, new Position(3, 3)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 2, Color.LIGHT_GRAY, new Position(5, 3)));
		return vehicles;
	}

}
