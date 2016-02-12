package lab2;

import java.util.ArrayList;
import java.util.List;

public class Queue
{
    private List<Person> elements;

    public Queue() {
	elements = new ArrayList<>();
    }

    public int size() {
	return elements.size();
    }

    public boolean isEmpty() {
	return elements.isEmpty();
    }

    public boolean contains(final Object o) {
	return elements.contains(o);
    }

    public void clear() {
	elements.clear();
    }

    public void enqueue(Person person) {
	elements.add(person);
    }

    public Person dequeue() {
	return elements.remove(0);
    }


}