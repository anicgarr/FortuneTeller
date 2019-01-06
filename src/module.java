
import java.util.Scanner;

public class module {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		if(firstName.equalsIgnoreCase("quit")){
   System.exit(0);
}
		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		if(lastName.equalsIgnoreCase("quit")){
   System.exit(0);
}
		System.out.println("How old are you?");
		int age = input.nextInt();
		if(age.equalsIgnoreCase("quit")){
   System.exit(0);
}
		int retireYears;
		if (age % 2 == 0) {
			retireYears = 10;
		} else {
			retireYears = 50;
		}
		System.out.println("What month were you born? Please input as a number 1-12");
		int birthMonth = input.nextInt();

		long bankBalance = 0;
		switch (birthMonth) {
		case 1:
			bankBalance = 4201989;
			break;
		case 2:
			bankBalance = 4201989;
			break;
		case 3:
			bankBalance = 4201989;
			break;
		case 4:
			bankBalance = 4201989;
			break;
		case 5:
			bankBalance = 900000;
			break;
		case 6:
			bankBalance = 900000;
			break;
		case 7:
			bankBalance = 900000;
			break;
		case 8:
			bankBalance = 900000;
			break;
		case 9:
			bankBalance = 5;
			break;
		case 10:
			bankBalance = 5;
			break;
		case 11:
			bankBalance = 5;
			break;
		case 12:
			bankBalance = 5;
			break;
	
		}
		input.nextLine();
		String favColor;
		//boolean needsHelp = false;
		String modeTransportation = null;

		System.out.println("What is your favorite ROYGBIV color? Need Help? Enter Help.");
		
		do {
		//needsHelp=false;
				favColor = input.nextLine();
		
			if (favColor.equalsIgnoreCase("help")) {
				System.out.println(
						"The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet. Please enter your favorite ROYGBIV color");
						//needsHelp=true;
			} else if (favColor.equalsIgnoreCase("red")) {
				modeTransportation = "horse";
			} else if (favColor.equalsIgnoreCase("orange")) {
				modeTransportation = "Mercedes Benz";
			} else if (favColor.equalsIgnoreCase("yellow")) {
				modeTransportation = "bike";
			} else if (favColor.equalsIgnoreCase("green")) {
				modeTransportation = "Uber";
			} else if (favColor.equalsIgnoreCase("blue")) {
				modeTransportation = "Lyft";
			} else if (favColor.equalsIgnoreCase("indigo")) {
				modeTransportation = "spaceship";
			} else if (favColor.equalsIgnoreCase("violet")) {
				modeTransportation = "minivan";
			}else{
			System.out.println("Sorry that's not a valid color! Please enter a valid ROYGBIV color");
			}
		} while (modeTransportation ==null);

		{

			System.out.println("How many siblings do you have?");
			int siblings = input.nextInt();

			String vacationHome = null;
			if (siblings == 0) {
				vacationHome = "Cleveland, Ohio";
			} else if (siblings == 1) {
				vacationHome = "Rome, Italy";
			} else if (siblings == 2) {
				vacationHome = "Miami, Florida";
			} else if (siblings == 3) {
				vacationHome = "Cancun, Mexico";
			} else if (siblings > 3) {
				vacationHome = "San Francsico, California";
			} else if (siblings < 0) {
				vacationHome = "Dayton,Ohio";
			}

			System.out.println(firstName + " " + lastName + " will retire in " + retireYears + " years with $"
					+ bankBalance + " in the bank, a vacation home in " + vacationHome + " , and travel by "
					+ modeTransportation + ".");

			input.close();
		}
	}

}
