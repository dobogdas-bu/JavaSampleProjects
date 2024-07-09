/**
 * BankingProceduralStyle.java (Assignment 2, Part 1)
 * @author YOUR NAME
 */

package cs520.assignment2.part1;

import java.util.Scanner;

public class BankingProceduralStyle {

	public static void main(String[] args) {

		// Code goes here
		int initialDeposit_a = 5000;
		String bankName_a ="Bank A";
		double rate_a = .04;
		int term_a = 3;
		double final_A;

		int initialDeposit_b = 5000;
		String bankName_b = "Bank B";
		double rate_b = .03;
		int term_b = 4;
		double final_B;

		// FinalValue = InitialDeposit * (1+r)^t
		final_A = initialDeposit_a * (Math.pow(1 + rate_a, term_a));
		System.out.printf("Bank A 3-year CD of $5000 at 4.00%% is worth $%.2f\n",final_A);

		final_B = initialDeposit_a * (Math.pow(1 + rate_b, term_b));
		System.out.printf("Bank B 4-year CD of $5000 at 3.00%% is worth $%.2f\n",final_B);

		if (final_A > final_B) {
			double difA = final_A-final_B;
			System.out.printf("Bank A's CD exceed Bank B by $%.2f",difA);
		} else{
			double difB = final_B-final_A;
			System.out.printf("Bank B's CD exceeds Bank A by $%.2f",difB);
		}


	}



}
