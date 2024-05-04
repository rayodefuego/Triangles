package cuadrilaterals;
public class Rectangle extends Parallelogram{
	public Rectangle (double base, double height) throws Exception {
		super (base, base , height);
	}
	public double CalculateArea() {
		return base*height;
		
	}
	@Override
	public String toString() {
		return "Rectangle [CalculateArea()=" + CalculateArea() + ", calculatePerimeter()=" + calculatePerimeter() + "]";
	}
	
}
