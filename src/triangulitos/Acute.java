package triangulitos;

public class Acute extends Angles{
	public Acute(double angle1, double angle2,double angle3) throws Exception{
		super(angle1,angle2,angle3);
	}



	@Override
	public String Classify() {
		if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
			return "Triangle is Acute";
		}
		else {
			return "Triangle is not acute";
		}
	}



	@Override
	public String toString() {
		return Classify();
	}
	
}
