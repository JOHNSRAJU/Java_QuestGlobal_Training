package shape;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		Shape shape[]= new Shape[3];
		System.out.println("Enter the radius of circle - ");
		
		double radius = sc.nextDouble();
		while (radius<0){
			System.out.println("Enter a valid input - ");
			radius = sc.nextDouble();
		}
		shape[0]=new Circle(radius);
		System.out.println("Enter the Length and breadth of rectangle - ");
		double length = sc.nextDouble();
		double breadth = sc.nextDouble();
		while (length<0||breadth<0){
			System.out.println("Enter a valid input - ");
			length = sc.nextDouble();
			breadth = sc.nextDouble();
		}
		shape[1]=new Rectangle(length,breadth);
		System.out.println("Enter the side of square - ");
		double side = sc.nextDouble();
		if (side<0){
			System.out.println("Enter a valid input - ");
			side = sc.nextDouble();
		}
		sc.close();
		shape[2]=new Square(side);
		for(Shape s:shape) {
			System.out.println("Area of "+s.getClass().getSimpleName()+" = "+s.calculateArea());
			System.out.println("Perimeter of "+s.getClass().getSimpleName()+" = "+s.calculatePerimeter()+"\n");
		}
	}

}
