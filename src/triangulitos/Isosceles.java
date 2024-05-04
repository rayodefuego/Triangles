package triangulitos;

public class Isosceles extends Triangle {
	private double height;
	private double base;
	public Isosceles(double side1, double side2, double base, double height ) throws Exception {
		super(side1, side2, base);	
		this.height = height;
		this.base = base;
	}
	public String Classify() {
		if (side1==side2 || side2==side3 || side1==base) {
			return "Triangle is isosceles";
		}
		else {
			return "Triangle is not isosceles";
		}
	}
	@Override
	public String toString() {
		return Classify();
	}
	public double calculateArea(){
		return (base*height)/2;
	}
	
}
