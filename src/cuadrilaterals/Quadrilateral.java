package cuadrilaterals;
import interfaces.Shape;

public abstract class Quadrilateral implements Shape, Cloneable{

    protected double edge1, edge2, edge3, edge4;

    public Quadrilateral(double edge1, double edge2, double edge3, double edge4) throws Exception{
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
        this.edge4 = edge4;
    }

    public double calculatePerimeter(){
        return edge1+edge2+edge3+edge4;
    }
    
    
    public abstract double calculateArea(); //obligatorio instanciar 
    public void scale(double scaleFactor){
        this.edge1 = edge1*scaleFactor;
        this.edge2 = edge2*scaleFactor;
        this.edge3 = edge3*scaleFactor;
        this.edge4 = edge4*scaleFactor;

    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();

    }

}
