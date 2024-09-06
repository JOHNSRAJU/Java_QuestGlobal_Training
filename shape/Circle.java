package shape;

class Circle implements Shape{
	double radius;
	@Override
	public double calculateArea() {
		return 3.14*radius*radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2*3.14*radius;
	}
	Circle(double radius){
		this.radius=radius;
	}
}
