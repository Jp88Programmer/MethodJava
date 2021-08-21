package com.example;
import java.util.Scanner;
public class ComputeLoan{
	public static void main(String[] args) {
	//make Scanner object input
	Scanner input = new Scanner(System.in);
	System.out.print("Enter amount (e.g. 100000) : ");
	//Read the loan amount 
	double loanAmount = input.nextDouble();
	//System.out.print("Enter the Annual Interest Rate (e.g  3.4% to  3.4) : ");
	//Entering Annual Interest Rate
  	//double interestRate = input.nextDouble();
	System.out.print("Enter the number of years (e.g 5) : ");
	//promote the user to enter number of year
	int numberOfYear = input.nextInt();
	System.out.println("InterestRate  Monthly Payment   Total Payment ");
	for(double interestRate = 5 ;  interestRate <= 8 ; interestRate+=1/8.0){
  //calculate montlyInterestRate //
	double montlyInterestRate = interestRate / 1200.0;
	//calculate montly payment
	double montlyPayment = loanAmount*montlyInterestRate/(1-1/Math.pow(1+montlyInterestRate,numberOfYear*12));
	//calculate total payment
	double totalPayment = montlyPayment * numberOfYear * 12 ;
	//attaining two digits after the point 
	//montlyPayment =(int)(montlyPayment*100)/100.0;
	//totalPayment =(int)(totalPayment*100)/100.0;
	//Display the statement of interestRate ,montlyPayment and totalPayment
     System.out.printf("%8.3f%18.3f%18.3f\n",interestRate,montlyPayment, totalPayment);
	//System.out.println("Montly payment is : " + montlyPayment + "\nTotal Payment is : " + totalPayment);
	 }
	}
}
