package lab1;

public class Exercise10
{
    public static void main(String[] args) {
//	int tal = 16777217;
//	double decimaltal = tal;
//	int tillbaka = (int)decimaltal;
//	System.out.println(tal);
//	System.out.println(decimaltal);
//	System.out.println(tillbaka);

	int big = 2147483647;
	long bigger = big+1;
	long biggest = big+1L;
	long biggerer = big + (long)big+1;
	System.out.println(big);
	System.out.println(bigger);
	System.out.println(biggest);
	System.out.println(biggerer);
    }
}