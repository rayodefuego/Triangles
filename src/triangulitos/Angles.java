package triangulitos;

public abstract class Angles {
	protected double angle1,angle2,angle3;
	public Angles(double angle1, double angle2, double angle3) {
		this.angle1=angle1;
		this.angle2=angle2;
		this.angle3=angle3;
	}
	public abstract String Classify();
}
