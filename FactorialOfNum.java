package com.example;
import java.util.Scanner;
public class FactorialOfNum {
 public static double factorial(int number){
   if(number == 1)
    return 1;
   return (number*factorial(number-1));
 }
 public static void main(String args[]){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a number : ");
   int number = input.nextInt();
   System.out.println("Factorial of " + number + " : " + factorial(number));
 }
}
