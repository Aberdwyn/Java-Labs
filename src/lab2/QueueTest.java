package lab2;

import java.time.LocalDate;

public class QueueTest
{
    public static void main(String[] args) {
	Queue newQueue = new Queue();
	Person Anton = new Person("Anton", LocalDate.of(1995, 2, 4));
	Person Emmy = new Person("Emmy", LocalDate.of(1997, 2, 4));
	Person Fisk = new Person("Fisk", LocalDate.of(2016, 1, 21));
	Person Joakim = new Person("Joakim", LocalDate.of(1994, 7, 19));
	Person Erik = new Person("Erik", LocalDate.of(1994, 9, 27));

	newQueue.enqueue(Anton);
	newQueue.enqueue(Emmy);
	newQueue.enqueue(Fisk);
	newQueue.enqueue(Joakim);
	newQueue.enqueue(Erik);

	while (! newQueue.isEmpty()) {
	    System.out.println(newQueue.dequeue());
	}

    }

}