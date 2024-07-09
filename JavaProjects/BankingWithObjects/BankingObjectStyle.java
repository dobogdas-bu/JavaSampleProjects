/**
 * BankingObjectStyle.java (Assignment 2, Part 2)
 * @author YOUR NAME
 */

package cs520.assignment2.part2;

public class BankingObjectStyle {

	public static void main(String[] args) {

		// Code goes here
		BankCD bank1CD = new BankCD("Bank A");
		BankCD bank2CD = new BankCD("Bank B");

		bank1CD.setInitialDeposit(5000);
		bank1CD.setNumberOfYears(3);
		bank1CD.setRate(.04);

		bank2CD.setInitialDeposit(5000);
		bank2CD.setNumberOfYears(4);
		bank2CD.setRate(.03);

		bank1CD.printCDDetails();
		bank2CD.printCDDetails();

		if (bank1CD.getFinalValue() > bank2CD.getFinalValue()) {
			double difA = bank1CD.getFinalValue()- bank2CD.getFinalValue();
			System.out.printf("Bank A's CD exceed Bank B by $%.2f",difA);
		} else{
			double difB = bank2CD.getFinalValue()- bank1CD.getFinalValue();
			System.out.printf("Bank B's CD exceeds Bank A by $%.2f",difB);
		}

	}

}
