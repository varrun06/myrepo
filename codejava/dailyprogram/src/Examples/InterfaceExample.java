package Examples;

//Interface
interface Shape {

	double calculateArea();

	double calculatePerimeter();
	String DESCRIPTION = "This is a shape.";
}


class Circle implements Shape {

	private double radius;


	public Circle(double radius) {
		this.radius = radius;
	}


	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}


	public void displayInfo() {
		System.out.println("Circle with radius " + radius);
	}
}


class Rectangle implements Shape {

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

	@Override
	public double calculatePerimeter() {
		return 2 * (length + width);
	}


	public void displayInfo() {
		System.out.println("Rectangle with length " + length + " and width " + width);
	}
}


public class InterfaceExample {
	public static void main(String[] args) {

		Circle circle = new Circle(5.0);
		Rectangle rectangle = new Rectangle(4.0, 6.0);


		circle.displayInfo();
		System.out.println("Circle area: " + circle.calculateArea());
		System.out.println("Circle perimeter: " + circle.calculatePerimeter());
		System.out.println(Shape.DESCRIPTION);  

		System.out.println();

		rectangle.displayInfo();
		System.out.println("Rectangle area: " + rectangle.calculateArea());
		System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
		System.out.println(Shape.DESCRIPTION);  
	}
}

