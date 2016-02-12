package lab3;

import java.awt.Color;
import java.util.ArrayList;

public class TestCircle
{
    public static void main(String[] args) {
	final ArrayList<Circle> circles = new ArrayList<>();
	Circle c1 = new Circle(0, 0, 2, Color.BLACK);
	Circle c2 = new Circle(6, 0, 2, Color.BLACK);
	Circle c3 = new Circle(2, 2, 4, Color.BLACK);

	circles.add(c1);
	circles.add(c2);
	circles.add(c3);

	for (Circle circle : circles) {
	    System.out.println(circle.getX() + " " + circle.getY());
	}
    }
}