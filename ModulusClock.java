import java.util.Scanner;

public class ModulusClock{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int hour, minute, changeHour, changeMinute, helpVar;
		int minutesInHour = 60;
		int hoursInTime = 12;

		System.out.print("Current hour: ");
		hour = scanner.nextInt();
		System.out.print("Current minute: ");
		minute = scanner.nextInt();
		System.out.print("Number of hours later: ");
		changeHour = scanner.nextInt();
		System.out.print("Number of minutes later: ");
		changeMinute = scanner.nextInt();

		minute += changeMinute;
		helpVar = minute / minutesInHour;
		minute = minute % minutesInHour;
		changeHour += helpVar;
		hour += changeHour;
		hour = hour % hoursInTime;
		if ( hour == 0){
			hour = 12;
		}
		System.out.println("Time: " + hour + ":" + minute);
	}
}