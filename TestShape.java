


public class TestShape {
    public static void main(String[] args) {
		//creating rectangle instance 
		Rectangle rect = new Rectangle("Reactangle", 4.5, 6.4);
		// printing rectangle properties
		System.out.println("Length : "+ rect.getLength());
		System.out.println("Width : "+ rect.getWidth());
		System.out.println("Perimiter : " + rect.perimeter());
		System.out.println("Area : "+ rect.area());
	}
}

abstract class Shape {
	// declaring name variable 
	private String name;
	// initializes shape name 
	public Shape (String name) {
		this.name = name;
	}
	// getters and setters about name of shape
	public String getName() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	//abstract method of area & perimiter
	public abstract double area();
	public abstract double perimeter();
}
 
class Rectangle extends Shape {
	// declaring variables length & width 
	private double length;
	private double width;
	//initializing name, length and width with data
	public  Rectangle(String name, double length, double width) {
		super(name);
		this.length = length;
		this.width = width;
	}
	//setters and getters 
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	//calculates return area 
	@Override 
	public double perimeter() {
		return 2 * (length + width);
	
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
}
