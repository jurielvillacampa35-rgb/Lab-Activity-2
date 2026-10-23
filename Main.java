public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Ford", "Mustang", 2025, 2);
        
        Vehicle motorcycle = new Motorcycle("Honda", "Click V3", 2024, 125);

        Vehicle truck = new Truck("Hyundai", "Mighty", 2025, 6);

        Vehicle[] vehicles = {car, motorcycle, truck};

        System.out.println("=== Runtime polymorphism (method overriding) ===");
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println();
        }

        
    }
}
