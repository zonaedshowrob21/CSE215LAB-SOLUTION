
public abstract class Polygon {
	
	private int numSide;
	
	public Polygon() {
		this.numSide = 0;	
	}
	
	public int getNumSide() {
		return numSide;
	}
	
	public void setNumSide(int numSide) {
		this.numSide = numSide;
	}
	
	public abstract double area();
	
	public abstract double perimeter();
	
}