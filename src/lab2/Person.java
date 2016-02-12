package lab2;

import java.time.LocalDate;
import java.time.Period;

public class Person
{
    private String name;
    private LocalDate birthDay;

    public Person(final String name, final LocalDate birthDay) {
	this.name = name;
	this.birthDay = birthDay;
    }

    public static void main(String[] args) {
	Person Anton = new Person("Anton", LocalDate.of(1995, 2, 4));
	Person Emmy = new Person("Emmy", LocalDate.of(1997, 2, 4));
	Person Fisk = new Person("Fisk", LocalDate.of(2016, 1, 21));
	System.out.println(Anton);
	System.out.println(Emmy);
	System.out.println(Fisk);
    }

    @Override public String toString() {
	return name+" "+getAge();
    }


    public int getAge() {
	return Period.between(birthDay, LocalDate.now()).getYears();
    }

}