package lab3;

import java.awt.*;

public class Circle extends AbstractShape
{
    private int radius;

    public Circle(final int x, final int y, final int radius, final Color color) {
	super(color, x, y);
	if (radius < 0) {
	    throw new IllegalArgumentException("Negativ radie ej tillåten!");
	}
	this.radius = radius;
    }

    public int getRadius() {
	return radius;
    }

    @Override public String toString() {
	return "Circle{" +
	       "x=" + x +
	       ", y=" + y +
	       ", radius=" + radius +
	       ", color=" + color +
	       '}';
    }

    @Override public void draw(final Graphics g) {
	//System.out.println("Ritar: " + this);
	g.setColor(color);
	g.drawOval(x, y, 2*radius, 2*radius);
    }
}
