package flyweight;

public class Rectangle implements Shape{
    private int lenght;
    private int breadth;
    private String fillStyle;
    private String label;

    public Rectangle(){
        label = "Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("Drawing Rectnagle: " +lenght +":" +breadth +fillStyle);
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public String getFillStyle() {
        return fillStyle;
    }

    public void setFillStyle(String fillStyle) {
        this.fillStyle = fillStyle;
    }
}
