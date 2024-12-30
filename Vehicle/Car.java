package Vehicle;

public abstract class Car extends Vehicle implements Rentable {
    public Car(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

   @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
   }

   @Override
    public boolean isAvailableForRental() {
        return isAvailable();
   }

   @Override
    public String toString() {
        return getModel() + getVehicleId() + getBaseRentalRate();
   }
}
