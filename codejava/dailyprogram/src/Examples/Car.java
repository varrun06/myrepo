package Examples;

// Instance variables
public class Car {
   
    private String make;
    private String model;
    private int year;
    private double price;

    
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

 
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

  
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        
        Car car1 = new Car("Toyota", "Camry", 2020, 25000.0);
        Car car2 = new Car("Honda", "Accord", 2022, 28000.0);

        
        System.out.println("Car 1's make: " + car1.getMake());
        System.out.println("Car 2's year: " + car2.getYear());

        car1.setPrice(26000.0);
        car2.setModel("Civic");

        
        System.out.println("Car 1's information:");
        car1.displayInfo();

        System.out.println("Car 2's information:");
        car2.displayInfo();
    }
}

