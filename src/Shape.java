public class Shape {
    String color = "green";
    boolean filled = true;

    public Shape(){

    }
    public Shape(String c, boolean f){
        this.color = c;
        this.filled = f;
    }
    public String getColor(){
        return  this.color;
    }
    public boolean getFilled(){
        return this.filled;
    }
    public void setColor(String color1){
        this.color = color1;
    }

    public void setFilled(boolean fill) {
        this.filled = fill;
    }
    @Override
    public String toString(){
        return "Your shape have color in " + this.color + " and the status is " + filled;
    }
}
