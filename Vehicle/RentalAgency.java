package Vehicle;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> vehicles;

    public RentalAgency() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // View Available Vehicles
    public void viewAvailableVehicles() {
        System.out.println("Available Vehicles:");
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable()) {
                System.out.println(vehicle);
            }
        }
    }

    // Rent Vehicle
    public void rentVehicle(String vehicleId, Customer customer, int days) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailable()) {
                vehicle.setAvailable(false);
                System.out.println(customer.getName() + " has rent a vehicle" + vehicle.getModel() + " " + days);
                return;
            }
        }

        System.out.println(customer.getName() + " has not rent a vehicle" + vehicleId);
    }

    //Return Vehicle
    public void returnVehicle(String vehicleId, Customer customer) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                vehicle.setAvailable(true);
                System.out.println(vehicle.getModel() + " " + customer.getName() + " has returned the vehicle");
            }
        }
        System.out.println("Vehicle ID not found. ");
    }
}
