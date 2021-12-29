package flyweight;

public class PaintApp {

    public void render(int numberOfShapes){
        Shape [] shapes = new Shape[numberOfShapes];
        for(int i = 1; i< numberOfShapes; i++){
            if(i%2 == 0){
                shapes[i] = new Circle();
                ((Circle) shapes[i]).setRadius(i);
                ((Circle) shapes[i]).setLineColor("Blue");
                ((Circle)shapes[i]).setFillColor("Red");
                shapes[i].draw();
            }
            else {
                shapes[i] = new Rectangle();
                ((Rectangle) shapes[i]).setBreadth(i);
                ((Rectangle) shapes[i]).setLenght(i);
                ((Rectangle) shapes[i]).setFillStyle("Solid");
                shapes[i].draw();
            }
        }
    }
}
