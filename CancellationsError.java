package com.example;
import java.util.Scanner;
public class CancellationsError {
 public static void main(String args[]){
   final double BASE_VALUE = 1e-4;
   System.out.print("Enter a number : ");
   Scanner input = new Scanner(System.in);
   int number = input.nextInt();
   double sum = 0;
   for(int i = 1 ; i <= number ; i++){
     if(1.0/i < BASE_VALUE)
     sum += 1/i;
     else
     sum += 1.0/i;
   }
   System.out.println(sum);
 }
}
