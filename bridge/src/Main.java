import drawers.impl.LargeCircleDrawer;
import drawers.impl.SmallCircleDrawer;
import shape.Circle;
import shape.Shape;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5, 10, 10, new LargeCircleDrawer()),
                new Circle(20, 30, 100, new SmallCircleDrawer())};

        for (Shape next : shapes) {
            next.draw();
        }
    }
}