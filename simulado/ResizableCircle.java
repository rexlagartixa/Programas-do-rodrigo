package simulado;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius){
        super(radius);
    }
    
    public String toString(){
        return "ResizebleCircle[ " + super.toString() +" ]";
    }
    
    public void resize(int percent){
        radius *= percent/100;
    }
    
}
