package Practice2;

public class Cylinder extends Circle{
    double height = 4;
    public Cylinder(){

    }
    public Cylinder( double height){
        this.height = height;
    }
    public Cylinder(double height, double radius, String color ){
        this.height = height;
        this.color = color;
        this.radius = radius;
    }
    public double getVolume(){
        return this.height * super.getArea();
    }
    public String toString(){
        return "I am a Cyclinder, i was born from " + super.toString() + "  with a height " + this.height;
    }
}
