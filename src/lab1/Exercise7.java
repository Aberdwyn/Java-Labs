package lab1;
import javax.swing.*;

public class Exercise7
{
    public static void main(String[] args) {
	int min = 10;
	int max = 20;
	String input =
		JOptionPane.showInputDialog("Please chose between for and while: ");
	switch (input) {
	    case "for":
		System.out.println(sumFor(min, max));
		break;
	    case "while":
		System.out.println(sumWhile(min, max));
		break;
	    default:
		System.out.println("Not a valid input");
	}

    }

    public static int sumFor(int min, int max) {
	int sum = 0;
	for(int i = min; i <= max; i++) {
	    sum = sum + i;
	}
	return sum;
    }

    public static int sumWhile(int min, int max) {
	int sum = 0;
	while (max >= min) {
	    sum += min;
	    min++;
	}
	return sum;
    }


}