public class Main {
public static void main(String[] args) {

    Vehicle v1 = new Vehicle("Ford", "Mustang",1967);

System.out.println("VEHICLE 1");
v1.displayInfo();
System.out.println("Age: " + v1.calculateAge());
System.out.println("Vintage? " + v1.isVintage());

Vehicle v2 = new Vehicle ("Toyota", "Coralla", 2018);

System.out.println("VEHICLE 2"); 
v2.displayInfo();
System.out.println("Age: " + v2.calculateAge()) ;
System.out.println( "Vintage? " + v2.isVintage());

Vehicle v3 = new Vehicle( "Honda", "Civic", 2023);

System.out.println("VEHICLE 3");
 v3.displayInfo();
System.out.println("Age: " + v3.calculateAge());
System.out.println("Vintage? " + v3.isVintage());
}
}