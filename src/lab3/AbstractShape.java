package lab3;

import java.awt.*;

public abstract class AbstractShape implements Shape
{

    protected int x;
    protected int y;
    protected Color color;

    public AbstractShape(final Color color, final int x, final int y) {
	this.color = color;
	this.x = x;
	this.y = y;

    }

    @Override public int getX() {
	return x;
    }

    @Override public int getY() {
	return y;
    }

    @Override public Color getColor() {
	return color;
    }

    @Override public boolean equals(final Object o) {
	if (this == o) return true;
	if (o == null || getClass() != o.getClass()) return false;

	final AbstractShape that = (AbstractShape) o;

	if (x != that.x) return false;
	if (y != that.y) return false;
	if (color != null ? !color.equals(that.color) : that.color != null) return false;

	return true;
    }

    @Override public int hashCode() {
	int result = x;
	result = 31 * result + y;
	result = 31 * result + (color != null ? color.hashCode() : 0);
	return result;
    }
}
