package views;
import cuadrilaterals.*;
import triangulitos.*;
public class Main {
    public static void main(String[] args) {
        try {
            //Square s1 = new Square(0);
			Scalene a1 = new Scalene(0, 0, 0);
            //System.out.println("Area of square: " + s1.calculateArea()); // Assuming a method calculateArea exists
			System.out.println(a1.calculateArea());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
