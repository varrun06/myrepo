package Examples;
// Inheritance
class Vehicle {

 String brand;
 int year;


 public Vehicle(String brand, int year) {
     this.brand = brand;
     this.year = year;
 }


 public void displayInfo() {
     System.out.println("Brand: " + brand + ", Year: " + year);
 }
}


class Car extends Vehicle {

 int numberOfDoors;


 public Car(String brand, int year, int numberOfDoors) {
    
     super(brand, year);

     
     this.numberOfDoors = numberOfDoors;
 }


 public void start() {
     System.out.println(brand + " car is starting.");
 }
}


class Motorcycle extends Vehicle {

 boolean hasSidecar;


 public Motorcycle(String brand, int year, boolean hasSidecar) {
     
     super(brand, year);

     
     this.hasSidecar = hasSidecar;
 }

 
 public void wheelie() {
     System.out.println(brand + " motorcycle is doing a wheelie!");
 }
}


public class InheritanceExample{
 public static void main(String[] args) {
     
     Car car = new Car("Toyota", 2022, 4);

     
     car.displayInfo();  
     car.start();        

     System.out.println();

     
     Motorcycle motorcycle = new Motorcycle("Harley Davidson", 2021, true);

     
     motorcycle.displayInfo(); 
     motorcycle.wheelie();      
 }
}
