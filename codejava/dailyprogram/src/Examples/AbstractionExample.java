package Examples;

//Abstract class
abstract class Shape {
 
 public abstract double calculateArea();


 public void display() {
     System.out.println("This is a shape.");
 }
}

class Circle extends Shape {

 private double radius;

 
 public Circle(double radius) {
     this.radius = radius;
 }


 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }

 
 public void displayInfo() {
     System.out.println("Circle with radius " + radius);
 }
}


class Rectangle extends Shape {
 
 private double length;
 private double width;


 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 
 @Override
 public double calculateArea() {
     return length * width;
 }

 
 public void displayInfo() {
     System.out.println("Rectangle with length " + length + " and width " + width);
 }
}


public class AbstractionExample {
 public static void main(String[] args) {
     
     Circle circle = new Circle(5.0);
     Rectangle rectangle = new Rectangle(4.0, 6.0);

     
     circle.display();
     circle.displayInfo();
     System.out.println("Circle area: " + circle.calculateArea());

     System.out.println();

     rectangle.display();
     rectangle.displayInfo();
     System.out.println("Rectangle area: " + rectangle.calculateArea());
 }
}

