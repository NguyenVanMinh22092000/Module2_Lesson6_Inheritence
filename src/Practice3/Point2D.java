package Practice3;

public class Point2D {
    public float x =0.0f;
    public float y =0.0f;
   public Point2D(float x, float y){
        this.x = x;
        this.y = y;
   }
   public Point2D(){

   }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY( float x, float y ){
       setX(x);
       setY(y);
    }
    public float[] getXY(){
       float[] array = {getY(), getX()};
       return  array;
    }
    public String toString(){
       return "I am a 2D with x = " + this.x + " and y = " + this.getY();
    }
}
