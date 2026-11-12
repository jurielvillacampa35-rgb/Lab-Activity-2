public class Main {

	public static void printDetails(Vehicle vehicle){
			vehicle.displayInfo();
			vehicle.moveForward();
			vehicle.moveBackwards();
			vehicle.moveLeft();
			vehicle.moveRight();
			System.out.println(" ");
			
		}
		
		public static void performService(Serviceable item){
			item.service();
		}

	public static void main(String[] args) {

		Serviceable car = new Car("Ford", "Mustang", 1963, 2);
		Serviceable motor = new Motorcycle("Honda", "Click V3", 2024, 125);
		Serviceable truck = new Truck("Hyundai", "Mighty", 2025, 6);
		Serviceable printer = new Printer();


		
		
	
		//Polymorphism using Arrays
		Vehicle[] vehicles = {
			new Car("Ford", "Mustang", 1963, 2),
			new Motorcycle("Honda", "Click V3", 2024, 125),
			new Truck("Hyundai", "Mighty", 2025, 6)
		};
		
		for(Vehicle currentVehicle: vehicles){
			printDetails(currentVehicle);
		}

			Serviceable[] service = {
			car,
			motor,
			truck,
			printer
		};

		System.out.println(" ");
		
		//Loop for serviceable
		for(Serviceable currentService: service){
			performService(currentService);
		}

}
}