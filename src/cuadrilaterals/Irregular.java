package cuadrilaterals;

public class Irregular extends Quadrilateral {
	
	private double diagonal;
	public Irregular(double diagonal,double edge1, double edge2, double edge3, double edge4) throws Exception {
		super(edge1, edge2, edge3, edge4);
		this.diagonal=diagonal;
	}

	@Override
	public double calculateArea() {
        double s = calculatePerimeter()/2;
		double alpha = Math.acos((edge2*edge2 + edge3*edge3 - diagonal*diagonal) / (2 * edge2 * edge3));
        double beta = Math.acos((edge1*edge1 + edge4*edge4 - diagonal*diagonal) / (2 * edge1 * edge4));
        double areaSquared = (s - edge1) * (s - edge2) * (s - edge3) * (s - edge4) - edge1 * edge2 * edge3 * edge4 * Math.pow(Math.cos((alpha + beta) / 2), 2);
        return Math.sqrt(areaSquared);
	}

	@Override
	public String toString() {
		return "Irregular [calculateArea()=" + calculateArea() + ", calculatePerimeter()=" + calculatePerimeter() + "]";
	}
	

}
