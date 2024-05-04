package triangulitos;

import exceptions.InvalidTriangle;
import interfaces.Shape;

public abstract class Triangle implements Shape {
	protected double side1,side2,side3;
	public Triangle (double side1, double side2, double side3) throws Exception {
		if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
			throw new InvalidTriangle("Invalid triangle exception");
		}
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	public double calculatePerimeter(){
		return side1+side2+side3;
	}
	public abstract double calculateArea();
	public void scale(double scaleFactor){
		this.side1 = side1*scaleFactor;
		this.side2 = side2*scaleFactor;
		this.side3 = side3*scaleFactor;
	}
	public abstract String Classify();
}