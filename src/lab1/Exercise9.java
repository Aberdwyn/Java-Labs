package lab1;
import javax.swing.*;

public class Exercise9
{
    public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("Please input a value");
	double number = Double.parseDouble(input);

	System.out.println("Roten ur "+number+" är "+findRoot(number));
    }

    public static double findRoot(double number) {
	double x = number;
	for (int i = 0; i < 10; i++) {
	    x = x - (x*x-number)/(2*x);
	}
	return x;
    }

}