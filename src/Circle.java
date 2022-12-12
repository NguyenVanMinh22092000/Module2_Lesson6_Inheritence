public class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){

    }
    public  Circle( double radius){
        this.radius = radius;
    }
    public Circle( double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public  double gePerimeter(){
        return this.radius * Math.PI;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    @Override
    public String toString(){
        return "the radius of this shape is " + this.radius + " the area = " + this.getArea() + " , the perimeter = " + this.gePerimeter()
                + " the information from " + super.toString();
    }
}
