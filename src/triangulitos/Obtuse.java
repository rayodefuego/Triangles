package triangulitos;

public class Obtuse extends Angles{
	public Obtuse(double angle1, double angle2, double angle3) {
		super(angle1, angle2, angle3);
	}
	public String Classify() {
		if (angle1>90 && angle2 !=90 && angle3!=90) {
			return "Triangle is a Right triangle";
		}
		else {
			if (angle2>90 && angle1!=90 && angle3!=90) {
				return "Triangle is a right triangle";
			}
			else {
				if (angle3>90 && angle2!=90 && angle1!=90) {
					return "Triangle is a right Triangle";
				}
				else {
					return "Triangle is not a right triangle";
				}
			}
		}
	}
	@Override
	public String toString() {
		return Classify();
	}

}
