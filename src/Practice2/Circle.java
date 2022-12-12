package Practice2;

 class Circle {
    double radius = 2;
    String color = "Green";
    public Circle(){

    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    public String toString( ){
        return "I am a circle with radius " + this.radius;
    }
}
