
public class Main {
    public static void main(String[] args) {
        RentalShop shop = new RentalShop();

        shop.addVehicle(new Car("C1", "Swift", 1500));
        shop.addVehicle(new Bike("B1", "Activa", 400));
        shop.addVehicle(new Truck("T1", "Tata Ace", 2500));

        Customer asha = new Customer("Asha");
        Customer ravi = new Customer("Ravi");

        try {
            shop.rent(asha, "B1", 8);
            shop.rent(ravi, "T1", 2);
            shop.rent(ravi, "B1", 3);
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        shop.giveBack("B1");
        shop.showAvailable();
    }
}
