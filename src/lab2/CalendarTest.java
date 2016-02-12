package lab2;

public class CalendarTest
{
    //(int year, String month, int day, String start, String end, String subject)

    public static void main(String[] args) {
	Calendar newCalendar = new Calendar();
	//Ska ge fel
	//newCalendar.book(2016, "Januasdry", 28, "13:15", "15:00", "Programmera i Java");
	//newCalendar.book(2016, "January", 28, "16:00", "15:00", "Programmera i Java");
	//newCalendar.book(2016, "January", 32, "13:15", "15:00", "Programmera i Java");



	newCalendar.book(2016, "January", 28, "09:10", "10:00", "Åka till skolan");
	newCalendar.book(2016, "January", 28, "10:00", "12:00", "Programmera i Java");
	newCalendar.book(2016, "January", 28, "12:00", "13:15", "Lunch");
	newCalendar.book(2016, "January", 28, "13:15", "15:00", "Programmera i Java");
	newCalendar.book(2016, "January", 28, "15:00", "15:15", "Rast");
	newCalendar.book(2016, "January", 28, "15:15", "17:20", "Programmera i Java");
	newCalendar.book(2016, "January", 28, "17:20", "17:30", "Gå till bussen");
	newCalendar.book(2016, "January", 28, "17:30", "18:20", "Åka hemmåt/Läsa");
	newCalendar.book(2016, "January", 28, "18:20", "18:40", "Gå hem");
	newCalendar.book(2016, "January", 28, "18:40", "20:30", "Träffa Emmy");

	newCalendar.show();
    }


}