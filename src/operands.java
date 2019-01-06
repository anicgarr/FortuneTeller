
public class operands {

	public static void main(String[] args) {
		int startingMoney = 29;
		int endingMoney = 41;
		int moneyGained = (endingMoney - startingMoney);
		System.out.println("Trevon received " + moneyGained + " dollars.");

		int recipeCups = 7;
		int currentCups = 2;
		int moreCups = (recipeCups - currentCups);
		System.out.println("Lisa needs to put " + moreCups + " more cups into her muffins.");

		int perPersonCost = 13;
		int numberOfPeople = 4;
		int totalCost = (perPersonCost * numberOfPeople);
		System.out.println("The total bill is " + totalCost + ".");

		int costOfPackageOfDiapers = 8;
		int totalMoney = 40;
		int numberOfPackagesPurchased = (totalMoney / costOfPackageOfDiapers);
		System.out.println(
				"You can buy " + numberOfPackagesPurchased + " packages of diapers with " + totalMoney + " dollars.");

		int milesJulia = 47;
		int milesPranav = (milesJulia - 30);
		System.out.println("Pranav ran " + milesPranav + " miles last week.");

		int costOfEnvelopeBox = 3;
		int totalMoneyForEnvelopes = 12;
		int numberOfBoxesPurchased = (totalMoneyForEnvelopes / costOfEnvelopeBox);
		System.out.println("You can buy " + numberOfBoxesPurchased + " boxes of envelopes with "
				+ totalMoneyForEnvelopes + " dollars.");

		double saladCost = 5.12d;
		double currentMoney = 27.10d;
		double moneyBeforeTheSalad = (currentMoney + saladCost);
		System.out.println("Norachai had $" + moneyBeforeTheSalad + " before he bought the salad.");

	}
}