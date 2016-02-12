package lab3;

import java.awt.*;

public class Text extends AbstractShape
{
    private int size;
    private String text;

    public Text(final int x, final int y, final int size, final Color color, final String text) {
	super(color, x, y);
	this.size = size;
	this.text = text;
    }

    @Override public String toString() {
	return "Text{" +
	       "x=" + x +
	       ", y=" + y +
	       ", size=" + size +
	       ", color=" + color +
	       ", text='" + text + '\'' +
	       '}';
    }

    public int getSize() {
	return size;
    }

    public String getText() {
	return text;
    }

    @Override public void draw(final Graphics g) {
	//System.out.println("Ritar: " + this);
	g.setColor(color);
	g.setFont(new Font("serif", Font.PLAIN, size));
	g.drawString(text, x, y);
    }
}
