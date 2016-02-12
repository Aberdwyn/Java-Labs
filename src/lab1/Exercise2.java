package lab1;

public class Exercise2
{
    public static void main(String[] args) {
	int min = 10;
	int max = 20;
	System.out.println(sumFor(min, max));
	System.out.println(sumWhile(min, max));
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
