package lab3;

import java.awt.*;
import java.util.ArrayList;

public class TestShapes
{
    public static void main(String[] args) {
	final ArrayList<Shape> shapes = new ArrayList<>();
	Circle c1 = new Circle(0, 0, 20, Color.BLACK);
	Circle c2 = new Circle(60, 0, 20, Color.BLACK);
	Circle c3 = new Circle(20, 20, 40, Color.BLACK);

	shapes.add(c1);
	shapes.add(c2);
	shapes.add(c3);

	Rectangle r1 = new Rectangle(100, 100, 20, 20, Color.YELLOW);
	Rectangle r2 = new Rectangle(120, 100, 20, 20, Color.PINK);
	Rectangle r3 = new Rectangle(100, 120, 20, 20, Color.GREEN);
	Rectangle r4 = new Rectangle(120, 120, 20, 20, Color.BLACK);

	shapes.add(r1);
	shapes.add(r2);
	shapes.add(r3);
	shapes.add(r4);

	Text t1 = new Text(200, 100, 20, Color.ORANGE, "Jag är en fisk");
	Text t2 = new Text(200, 130, 20, Color.RED, "som heter");
	Text t3 = new Text(200, 160, 20, Color.YELLOW, "Pelle");

	shapes.add(t1);
	shapes.add(t2);
	shapes.add(t3);



//	for (Shape shape : shapes) {
//	    shape.draw();
//	}
    }
}