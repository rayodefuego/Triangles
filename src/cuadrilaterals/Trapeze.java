package cuadrilaterals;
public class Trapeze extends Quadrilateral{
	protected double base1, base2, height, side1, side2;
	public Trapeze(double base1, double base2, double side1, double side2, double height) throws Exception {
		super(base1,base2,side1,side2);
		this.height=height;
		this.base1=base1;
		this.base2=base2;
		this.side1=side1;
		this.side2=side2;
		
	}
	public double calculateArea() {
		return (base1+base2)*height/2;
	}
	public double calculatePerimeter(){
		return side1+side2+base1+base2;
	}
	@Override
	public String toString() {
		return "Trapeze [base1=" + base1 + ", base2=" + base2 + ", height=" + height + ", side1=" + side1 + ", side2="
				+ side2 + ", calculateArea()=" + calculateArea() + ", calculatePerimeter()=" + calculatePerimeter()
				+ "]";
	}

}
