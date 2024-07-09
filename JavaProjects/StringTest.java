/**
 * StringTest.java (Assignment 3, Part 1)
 * @author YOUR NAME
 */

package cs520.hw3.part1;

import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please enter your name, age, city: ");
            String input = scanner.nextLine();

            input = input.trim();

            int index1 = input.indexOf(',');

            String name = input.substring(0, index1);
            System.out.println("Name:" + name + "( length: " + name.length()+")");

            int index2 = input.indexOf(',', index1 + 1);
            String ageString = input.substring(index1+1, index2);
            int age = Integer.parseInt(ageString);
            int ageInTen = age+10;
            System.out.println("Age: " + age);
            System.out.println("Age in 10 years: " + ageInTen);

            String city = input.substring(index2+1);
            System.out.println("City: " + city + " (length: " + city.length()+")");
        }catch(Exception e){
            System.out.println("Sorry, an error has occurred. Please check your input and try again.");
            e.printStackTrace();
        }
    }

}
