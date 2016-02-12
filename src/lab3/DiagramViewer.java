package lab3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DiagramViewer
{
    public static void main(String[] args) {

	List<Shape> shapes = new ArrayList();

	DiagramComponent comp = new DiagramComponent(shapes);

	Circle c1 = new Circle(0, 0, 20, Color.BLACK);
	Circle c2 = new Circle(80, 0, 20, Color.BLACK);
	Circle c3 = new Circle(20, 20, 40, Color.BLACK);

	Rectangle r1 = new Rectangle(100, 100, 20, 20, Color.YELLOW);
	Rectangle r2 = new Rectangle(120, 100, 20, 20, Color.PINK);
	Rectangle r3 = new Rectangle(100, 120, 20, 20, Color.GREEN);
	Rectangle r4 = new Rectangle(120, 120, 20, 20, Color.BLACK);

	Text t1 = new Text(200, 200, 20, Color.ORANGE, "Jag är en fisk");
	Text t2 = new Text(200, 230, 20, Color.RED, "som heter");
	Text t3 = new Text(200, 260, 20, Color.YELLOW, "Pelle");

	comp.addShape(c1);
	comp.addShape(c2);
	comp.addShape(c3);

	comp.addShape(r1);
	comp.addShape(r2);
	comp.addShape(r3);
	comp.addShape(r4);

	comp.addShape(t1);
	comp.addShape(t2);
	comp.addShape(t3);

	JFrame frame = new JFrame("Mitt fönster");
	frame.setLayout(new BorderLayout());
	frame.add(comp, BorderLayout.CENTER);
	frame.setSize(800, 600);
	frame.setVisible(true);
    }
}
