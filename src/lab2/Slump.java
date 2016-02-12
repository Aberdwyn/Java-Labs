package lab2;

import java.util.Random;

public class Slump
{
    public static void main(String[] args) {

	for (int i = 0; i < 25; i++) {
	    Random rnd = new Random();
	        System.out.println(rnd.nextInt(100));
	}
    }
}