public class Rectangle extends Shape{
  public int   weight = 1;
  public int height = 1;

  public Rectangle (){

  }
  public Rectangle( int w, int h){
    this.height = h;
    this.weight = w;
  }
  public Rectangle( int weight, int height, String color, boolean filled){
    this.weight = weight;
    this.height = height;
    this.color = color;
    this.filled = filled;
  }

  public int getWeight() {
    return weight;
  }
  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }
  public int getArea(){
    return  this.weight * this.height;
  }
  public int getPerimeter (){
    return (this.height + this.weight)* 2;
  }
  @Override
  public String toString(){
    return "A Rectangle with width = " + this.weight + " with height = "
            + this.height + " which is a subclass of " + super.toString();
  }
}
