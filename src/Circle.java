// Nils E Lindfors TE15 
// 2017-10-25
// 13:44
public class Circle {
    private double radius;

   public Circle(){
        radius = 1;
    }
    public Circle(double r){
       radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        radius = r;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getCircumference(){
        return 2*radius*Math.PI;
    }

    public String toString(){
        return "Circle[radius="+ radius+"]";
    }

}
