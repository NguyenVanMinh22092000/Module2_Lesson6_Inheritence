public class Square extends Rectangle {
    public Square(){
    }
    public Square(int side){
        super(side, side);
    }
    public Square(int side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public int getSide() {
        return getWeight();
    }

    public void setSide(int side) {
        setWeight(side);
        setHeight(side);
    }
    @Override
    public void setWeight(int weight){
        setSide(weight);

    }
    @Override
    public void setHeight(int height){
        setSide(height);
    }
     @Override
    public String toString(){
        return "A Square with side = " + getSide() + "" +
                "which is a subclass of " + super.toString();
     }
}
