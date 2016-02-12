package lab2;

import java.time.LocalDate;

public class StackTest
{
    public static void main(String[] args) {
	Stack newStack = new Stack();
	Person Anton = new Person("Anton", LocalDate.of(1995, 2, 4));
	Person Emmy = new Person("Emmy", LocalDate.of(1997, 2, 4));
	Person Fisk = new Person("Fisk", LocalDate.of(2016, 1, 21));
	Person Joakim = new Person("Joakim", LocalDate.of(1994, 7, 19));
	Person Erik = new Person("Erik", LocalDate.of(1994, 9, 27));

	newStack.push(Anton);
	newStack.push(Emmy);
	newStack.push(Fisk);
	newStack.push(Joakim);
	newStack.push(Erik);

	while (! newStack.isEmpty()) {
	    System.out.println(newStack.pop());
	}

    }

}