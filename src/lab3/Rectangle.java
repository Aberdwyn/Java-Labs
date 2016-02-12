package lab3;

import java.awt.*;

public class Rectangle extends AbstractShape
{
    protected int width;
    protected int height;

    public Rectangle(final int x, final int y, final int width, final int height, final Color color) {
	super(color, x, y);
	if (height < 0 || width < 0) {
	    throw new IllegalArgumentException("Height and Width has to be positive.");
	}
	this.width = width;
	this.height = height;
    }

    public int getWidth() {
	return width;
    }

    public int getHeight() {
	return height;
    }

    @Override public String toString() {
	return "Rectangle{" +
	       "x=" + x +
	       ", y=" + y +
	       ", width=" + width +
	       ", height=" + height +
	       ", color=" + color +
	       '}';
    }

    @Override public void draw(final Graphics g) {
	//System.out.println("Ritar; " + this);
	g.setColor(color);
	g.drawRect(x, y, width, height);
    }
}
