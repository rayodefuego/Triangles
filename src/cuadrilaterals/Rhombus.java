package cuadrilaterals;
public class Rhombus extends Quadrilateral{
	protected double diagonal_1;
	protected double diagonal_2;
	
	public Rhombus (double diagonal1, double diagonal2) throws Exception {
		super(diagonal1, diagonal1, diagonal2, diagonal2);
		this.diagonal_1 = diagonal1;
		this.diagonal_2= diagonal2;
	}
	public double calculateArea(){
		return (diagonal_1*diagonal_2)/2;
	}
	@Override
	public String toString() {
		return "Rhombus [diagonal_1=" + diagonal_1 + ", diagonal_2=" + diagonal_2 + ", calculateArea()="
				+ calculateArea() + "]";
	}

}

