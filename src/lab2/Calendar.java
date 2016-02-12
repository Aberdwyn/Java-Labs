package lab2;

import java.util.ArrayList;
import java.util.List;

public class Calendar
{

    private List<Appointment> appointments;

    public Calendar() {
	appointments = new ArrayList<>();
    }

    public void show() {
	for (Appointment appointment : appointments) {
	    System.out.println(appointment);
	}
    }

    public void book(int year, String month, int day, String start, String end, String subject) {

	if (year < 2016) {
	    throw new IllegalArgumentException("There is no point in planning the past. Not a valid year");
	}

	String[] startParts = start.split(":");
	int startHour = Integer.parseInt(startParts[0]);
	int startMinute = Integer.parseInt(startParts[1]);

	if ((startHour < 0 && startMinute < 0) || (startHour > 23 && startMinute > 59)) {
	    throw new IllegalArgumentException("The start time is not valid");
	}

	String[] endParts = start.split(":");
	int endHour = Integer.parseInt(endParts[0]);
	int endMinute = Integer.parseInt(endParts[1]);

	if ((endHour < 0 && endMinute < 0) || (endHour > 23 && endMinute > 59)) {
	    throw new IllegalArgumentException("The end time is not valid");
	}

	int monthNumber = Month.getMonthNumber(month);
	if (monthNumber == -1) {
	    throw new IllegalArgumentException("Not a valid month");
	}

	int monthDays = Month.getMonthDays(month);
	if (day > monthDays) {
	    throw new IllegalArgumentException("Not a valid day");
	}

	if (start.compareTo(end) == 1) {
	    throw new IllegalArgumentException("Not a valid timespan. End needs to come after the start");
	}

	Month newMonth = new Month(month, monthNumber, monthDays);
	Date newDate = new Date(year, newMonth, day);
	TimePoint startTimePoint = new TimePoint(start);
	TimePoint endTimePoint = new TimePoint(end);
	TimeSpan newTimeSpan = new TimeSpan(startTimePoint, endTimePoint);
	Appointment newAppointment = new Appointment(subject, newDate, newTimeSpan);

	appointments.add(newAppointment);
    }


}