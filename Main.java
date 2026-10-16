public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Ford", "Mustang", 1967);
        Vehicle v2 = new Vehicle("Toyota", "Corolla", 2018);
        Vehicle v3 = new Vehicle("Honda", "Civic", 2023);

        System.out.println("VEHICLE 1");
        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage? " + v1.isVintage());
        System.out.println("Details: " + v1.getBrand() + ", " + v1.getModel() + ", " + v1.getYear());

        System.out.println("VEHICLE 2");
        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Vintage? " + v2.isVintage());
        System.out.println("Details: " + v2.getBrand() + ", " + v2.getModel() + ", " + v2.getYear());

        System.out.println("VEHICLE 3");
        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Vintage? " + v3.isVintage());
        System.out.println("Details: " + v3.getBrand() + ", " + v3.getModel() + ", " + v3.getYear());

        System.out.println();
        System.out.println("setYear TESTS (Vehicle 1)");

        boolean result = v1.setYear(2000);
        System.out.println("setYear(2000): " + result + " | year: " + v1.getYear()
                + " | age: " + v1.calculateAge() + " | vintage: " + v1.isVintage());

        result = v1.setYear(1885);
        System.out.println("setYear(1885): " + result + " | year: " + v1.getYear());

        result = v1.setYear(2027);
        System.out.println("setYear(2027): " + result + " | year: " + v1.getYear());

        System.out.println();
        System.out.println("CONSTRUCTOR TESTS");

        Vehicle low = new Vehicle("Test", "Low", 1885);
        System.out.println("New vehicle with year 1885 -> initial year: " + low.getYear());

        Vehicle high = new Vehicle("Test", "High", 2027);
        System.out.println("New vehicle with year 2027 -> initial year: " + high.getYear());
    }
}