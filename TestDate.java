import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class TestDate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please fill a day (1-31) :");
		int day = sc.nextInt();
		System.out.println("Please fill a month (1-12) :");
		int month = sc.nextInt();
		System.out.println("Please fill a year :");
		int year = sc.nextInt();
		sc.close();

		SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
		Calendar calendar = new GregorianCalendar(year, month - 1, day);// -1 car janvier commence a 0

		System.out.println("The date is : " + format.format(calendar.getTime()));
		System.out.println("The day of week is : " + calendar.get(Calendar.DAY_OF_WEEK));

	}
}