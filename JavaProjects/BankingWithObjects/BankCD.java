/**
 * BankCD.java (Assignment 2, Part 2)
 * @author YOUR NAME
 */

package cs520.assignment2.part2;

public class BankCD {

	// Code goes here
    private String bankName;
    private int initialDeposit;
    private double rate;
    private int numberOfYears;


    BankCD(String bankName){
        setBankName(bankName);
    }

    public double getFinalValue(){
        double finalValue= initialDeposit * (Math.pow(1 + rate, numberOfYears));
        return finalValue;
    }

    public void printCDDetails(){

        System.out.printf(bankName+ " "+numberOfYears+"-year CD of "+initialDeposit+" at %%"+(rate*100)+" is worth $%.2f\n",getFinalValue());
    }



    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(int initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
}
