
import java.util.ArrayList;
import java.util.List;

public class RentalShop {
    private List<Vehicle> fleet = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void rent(Customer customer, String vehicleId, int days) {
        if (days <= 0) {
            throw new IllegalArgumentException(
                    "Rental days must be greater than zero.");
        }

        Vehicle selected = null;

        for (Vehicle vehicle : fleet) {
            if (vehicle.getId().equalsIgnoreCase(vehicleId)) {
                selected = vehicle;
                break;
            }
        }

        if (selected == null) {
            throw new IllegalArgumentException(
                    "Vehicle " + vehicleId + " was not found.");
        }

        if (!selected.isAvailable()) {
            throw new IllegalStateException(
                    selected + " is already rented");
        }

        Rental rental = new Rental(selected, customer, days);
        selected.setAvailable(false);
        customer.addRental(rental);

        System.out.printf("%s rented %s for %d days = %.2f%n",
                customer.getName(), selected, days,
                rental.getTotalRent());
    }

    public void giveBack(String vehicleId) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getId().equalsIgnoreCase(vehicleId)) {
                if (vehicle.isAvailable()) {
                    System.out.println(vehicle + " is not currently rented.");
                    return;
                }

                vehicle.setAvailable(true);
                return;
            }
        }

        throw new IllegalArgumentException(
                "Vehicle " + vehicleId + " was not found.");
    }

    public void showAvailable() {
        System.out.println("Available vehicles:");

        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailable()) {
                System.out.println("  " + vehicle);
            }
        }
    }
}
