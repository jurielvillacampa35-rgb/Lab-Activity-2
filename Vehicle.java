<<<<<<< HEAD
public class Vehicle {

String brand;
String model; 
int year;

Vehicle(String brand, String model, int year){
this.brand = brand;
this.model = model;
this.year = year;
}

void displayInfo() {
System.out.println(brand + ", " + model + ", "+ year);
}
int calculateAge() {
return 2026 - year;
}
boolean isVintage() {
return calculateAge() > 25;
}

    }

=======
public class Vehicle {

    String brand;
    String model;
    int year;

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println( "Model: " + model);
         System.out.println("Year: " + year);
    }

    int calculateAge() {
        return 2026 - year;
    }

    boolean isVintage() {
        return calculateAge() > 25;
    }
}
>>>>>>> 4f2257e479d697240c7b30a9ec62e5580d01f859
