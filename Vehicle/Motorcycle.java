package Vehicle;

public abstract class Motorcycle extends Car {

    public Motorcycle(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

    @Override
    public  boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return getModel() + " " + getVehicleId() + getBaseRentalRate();
    }
}
