<<<<<<< HEAD
public class Main {
public static void main(String[] args) {

    Vehicle v1 = new Vehicle("Ford", "Mustang",1967);

System.out.println("VEHICLE 1");
v1.displayInfo();
System.out.println("Age: " + v1. calculateAge());
System.out.println("Vintage? " + v1. isVintage());

Vehicle v2 = new Vehicle ("Toyota", "Coralla", 2018);

System.out.println("VEHICLE 2"); 
v2.displayInfo();
System.out.println("Age: " + v2.calculateAge()) ;
System.out.println( "Vintage? " + v2.isVintage());

Vehicle v3 = new Vehicle( "Honda", "Civic", 2023);

System.out.println("VEHICLE 3");
 v3.displayInfo();
System.out.println("Age: " + v3. calculateAge());
System.out.println("Vintage? " + v3.isVintage());
}
}
=======
public class Main {
    public static void main(String[] args) {
       
        Vehicle v1 = new Vehicle();
        v1.brand = "Ford";
        v1.model = "Mustang";
        v1.year = 1967;
        
        
        System.out.println("--- VEHICLE 1 ---");
        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage? " + v1.isVintage());


        Vehicle v2 = new Vehicle();
        v2.brand = "Toyota";
        v2.model = "Corolla";
        v2.year = 2018;
        
        System.out.println("--- VEHICLE 2 ---");
        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Vintage? " + v2.isVintage());


        Vehicle v3 = new Vehicle();
        v3.brand = "Honda";
        v3.model = "Civic";
        v3.year = 2023;
        
        System.out.println("--- VEHICLE 3 ---");
        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Vintage? " + v3.isVintage());


            }
}  
 
>>>>>>> 4f2257e479d697240c7b30a9ec62e5580d01f859
