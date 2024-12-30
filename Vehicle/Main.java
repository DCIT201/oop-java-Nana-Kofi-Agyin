package Vehicle;

public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        Customer customer = new Customer("Mark Smith", "CR2374");

        // viewing available vehicles
        agency.viewAvailableVehicles();

        // Car renting
        agency.rentVehicle("V235", customer , 8);

        // Car returning
        agency.returnVehicle("V2492", customer);
    }
}
