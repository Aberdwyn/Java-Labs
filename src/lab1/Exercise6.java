package lab1;

public class Exercise6
{
    public static void main(String[] args) {
	for (int i = 2; i < 100; i++) {
	    if (isPrime(i)) {
		System.out.println(i);
	    }
	}

    }

    public static boolean isPrime(int number) {
	for(int i = 2; i < number; i++) {
	    double rest = number % i;
	    if (rest == 0) {
		// number är en jämn multipel av i
		return false;

	    }
	}
	return true;
    }
}