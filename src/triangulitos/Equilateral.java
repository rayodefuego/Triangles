package triangulitos;

public class Equilateral extends Triangle{
	private double height;

	public Equilateral(double side, double height) throws Exception{
		super(side, side, side);
		this.height = height;
	}
	public String Classify() {
		if (side1==side2 && side2==side3){
			return " Triangle is Equilateral";
		}
		return "Triangle is not Equilateral";
	}
	@Override
	public String toString() {
		return Classify();
	}

	public double calculateArea(){
		return (side1*height)/2;
	}
	
}
