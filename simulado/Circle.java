package simulado;

public class Circle implements GeometricObject{
    protected double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }

    public String toString() {
        return "Circle{"+"raio: "+ radius+" Perimetro: "+ getPerimeter() + " Area: "+getArea()+" }";
    }
    
    
    public double getPerimeter(){
        return Math.PI * radius * 2;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
