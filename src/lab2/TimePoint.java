package lab2;

public class TimePoint
{
    private String time;
    private int hour;
    private int minute;

    public TimePoint(final String time) {
	this.time = time;
	String[] parts = time.split(":");
	this.hour = Integer.parseInt(parts[0]);
	this.minute = Integer.parseInt(parts[1]);
    }

    public int getHour() {
	return hour;
    }

    public int getMinute() {
	return minute;
    }

    @Override public String toString() {
	return time;
    }

    public int compareTo(TimePoint other) {
	if (hour > other.getHour()) {
	    return 1;
	}

	else if (hour < other.getHour()) {
	    return -1;
	}

	else  {
	    if (minute > other.getMinute()) {
		return 1;
	    }

	    else if (minute < other.getMinute()) {
		return -1;
	    }

	    else {
		return 0;
	    }
	}
    }
}