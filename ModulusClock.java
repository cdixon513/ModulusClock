import java.util.Scanner;

public class ModulusClock{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int hour, minute, changeHour, changeMinute, helpVar;

		System.out.print("Current hour: ");
		hour = scanner.nextInt();
		System.out.print("Current minute: ");
		minute = scanner.nextInt();
		System.out.print("Number of hours later: ");
		changeHour = scanner.nextInt();
		System.out.print("Number of minutes later: ");
		changeMinute = scanner.nextInt();

		minute += changeMinute;
		helpVar = minute / 60;
		minute = minute % 60;
		changeHour += helpVar;
		hour += changeHour;
		hour = hour % 12;
		if ( hour == 0){
			hour = 12;
		}
		System.out.println("Time: " + hour + ":" + minute);
	}
}