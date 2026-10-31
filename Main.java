public class Main {

	public static void printDetails(Vehicle vehicle){
			vehicle.displayInfo();
			vehicle.moveForward();
			vehicle.moveBackwards();
			vehicle.moveLeft();
			vehicle.moveRight();
			
		}

	public static void main(String[] args) {
		
		
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