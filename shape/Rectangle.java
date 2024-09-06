package shape;

public class Rectangle implements Shape{
	double length;
	double breadth;
	@Override
	public double calculateArea() {
		return this.length*this.breadth;
	}

	@Override
	public double calculatePerimeter() {
		return 2*(length+breadth);
	}

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
}
