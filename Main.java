public class Main {

	public static void printDetails(Vehicle vehicle){
			vehicle.displayInfo();
		}

	public static void main(String[] args) {
		
		//Polymorphism using Parent as Reference, Upcasting 
		Vehicle vehicle = new Car("Ford", "Mustang", 1963, 2);
		vehicle.displayInfo();

		System.out.println(" ");
		//Polymorphism using Methods
		Car car = new Car("Ford", "Mustang", 1963, 2);
		Motorcycle motor = new Motorcycle("Honda", "Click V3", 2024, 125);
		Truck truck = new Truck("Hyundai", "Mighty", 2025, 6);
	
		printDetails(car);
		printDetails(motor);
		printDetails(truck);

		System.out.println(" ");
		//Polymorphism using Arrays
		Vehicle[] vehicles = {
			new Car("Ford", "Mustang", 1963, 2),
			new Motorcycle("Honda", "Click V3", 2024, 125),
			new Truck("Hyundai", "Mighty", 2025, 6)
		};
		
		for(Vehicle currentVehicle: vehicles){
			printDetails(currentVehicle);
		}

}
}