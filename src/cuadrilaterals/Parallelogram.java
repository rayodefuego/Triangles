package cuadrilaterals;


public class Parallelogram extends Quadrilateral {
	
	protected double height ;
	protected double base ;

	public Parallelogram(double longSide,  double shortSide, double height) throws Exception {
		super (longSide, shortSide,longSide, shortSide );
		this.height = height;
		this.base = longSide;
	}
	
	
	public Parallelogram() throws Exception { //sobrecarga
		super (-1, -1, -1, -1);
	}

	@Override
	public double calculateArea() { //sobreecrbir estructura de superclase
		return base*height;
	}


	@Override
	public String toString() {
		return "Parallelogram [height=" + height + ", base=" + base + ", calculateArea()=" + calculateArea()
				+ ", calculatePerimeter()=" + calculatePerimeter() + "]";
	}
	@Override
	public Parallelogram clone() {
		try {
		Parallelogram temp = new Parallelogram(this.edge1, this.height, this.base);
		return temp;
		}
		catch(Exception e){
			return null;
		}
	}
	
}


