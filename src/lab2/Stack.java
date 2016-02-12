package lab2;

import java.util.ArrayList;
import java.util.List;

public class Stack
{
    private List<Person> elements;

    public Stack() {
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

    public void push(Person person) {
	elements.add(person);
    }

    public Person pop() {
	int lastPerson = elements.size();
	lastPerson--;
	return elements.remove(lastPerson);
    }


}