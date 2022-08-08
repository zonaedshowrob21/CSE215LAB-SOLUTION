
public class TestTriangle {
	public static void main(String[] args) {
		
		Polygon shape = new Triangle(3.0, 4.0, 5.0);
		System.out.println("Area = " + shape.area());
		System.out.println("Perimeter = " + shape.perimeter());
		
		}
}