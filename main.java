import java.util.Scanner;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<String> day = new ArrayList();		//Create arrayList to store days of the week
		ArrayList<Integer> avgTemp = new ArrayList();	// Create arrayList to store daily average temperatures.
		int userInput;
		int weeklyAvg;
		int weeklySum = 0;
		
		Scanner scnr = new Scanner(System.in);
		
		day.add("Monday");
		day.add("Tuesday");
		day.add("Wednesday");
		day.add("Thursday");
		day.add("Friday");
		day.add("Saturday");
		day.add("Sunday");
		
		avgTemp.add(57);
		avgTemp.add(63);
		avgTemp.add(71);
		avgTemp.add(54);
		avgTemp.add(78);
		avgTemp.add(77);
		avgTemp.add(76);

		//calculate weekly average
		for (int i = 0; i < avgTemp.size(); ++i) {
			weeklySum = weeklySum + avgTemp.get(i);
		}		
		weeklyAvg = weeklySum / avgTemp.size();
		
		System.out.println("Select day of week: | 1 - Monday | 2 - Tuesday | 3 - Wednesday | 4 - Thursday | "
				+ "5 - Friday | 6 - Saturday | 7 - Sunday | 8 - Entire Week | 9 - Quit");
		
		//Need to get user input first time to accommodate below loop condition.
		System.out.print("Selection: ");
		userInput = scnr.nextInt();
		
		
		// Create loop until user quits program.
		while (userInput != 9) {
			if ((userInput != 8) && (userInput >= 1) && (userInput <= 7)) {		//Output for a single day (day of week + avg temp)
				System.out.println("Day of week: " + day.get(userInput - 1) + "\n" + "Average Temp: " + avgTemp.get(userInput - 1) + "\n");
			}
			else if (userInput == 8) {	//Output weekly average
				System.out.println("** Daily Averages **" + "\n");
				for (int i = 0; i < day.size(); ++i) {
					System.out.println(day.get(i) + " Average Temp: " + avgTemp.get(i));
				}
				System.out.print("\n" + "WEEKLY Average Temp: ");
				System.out.println(weeklyAvg + "\n");
			}
			
			else {	// Creating else statement if user inputs invalid number.
				System.out.println("INVALID INPUT! Try again, or -9- to quit.");
				System.out.print("Selection: ");
				userInput = scnr.nextInt();	
				continue;
			}
			
			// Obtain user input again to evaluate loop condition.
			System.out.println("Select day of week: | 1 - Monday | 2 - Tuesday | 3 - Wednesday | 4 - Thursday | "
					+ "5 - Friday | 6 - Saturday | 7 - Sunday | 8 - Entire Week | 9 - Quit");
			
			System.out.print("Selection: ");
			userInput = scnr.nextInt();		// loop exits if user inputs 9.	
		}
		
		System.out.print("\n" + "Goodbye!");
	}
}
