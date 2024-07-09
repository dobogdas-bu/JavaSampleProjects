/**
 * Module1NumberTest.java (Assignment 1)
 * @author David Bogdas
 */

package cs520.assignment1;

import java.util.Random;

public class Module1NumberTest {

	public static void main(String[] args) {

		// Use the following variable for all random-number generation in this file
		Random random = new Random();

		// Your code goes here
		int small = 0;
		int medium = 0;
		int large = 0;
		int limit = random.nextInt((900) + 100);
		double limitPct = (double) limit;
		double smallPct = 0.0;
		double mediumPct = 0.0;
		double largePct = 0.0;
		boolean isEqualToLimit;


			for (int i =1; i<=limit; i++){
				int number = random.nextInt(300);
				if(number < 100){
					small++;
				} else if (number >=100 && number <200){
					medium++;
				}else if (number >=200) {
					large++;
				}
			}


		smallPct = small/limitPct*100;
		mediumPct = medium/limitPct*100;
		largePct = large/limitPct*100;


		System.out.println("The loop ran "+ limit + " times.");
		System.out.printf("Small: %d (%2.2f percent)%n", small, smallPct);
		System.out.printf("Medium: %d (%2.2f percent)%n", medium, mediumPct);
		System.out.printf("Large: %d (%2.2f percent)%n", large, largePct);


		int total = small + medium + large;// add another value here to make isEqualToLimit false i.e +15;
		if (total == limit){
			isEqualToLimit=true;
		} else{
			isEqualToLimit=false;
		}


		if(isEqualToLimit == true){
			System.out.println("Number total equals limit "+limit);
		} else{
			System.out.println("Number total does not equal limit "+limit);

		}

	}

}
