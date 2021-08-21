package com.example;

public class VarLenArgList {
 public static void main(String args[]){
  //passing the variable argument in same type 
  System.out.println("Maximum number : " + maxNum(2,56,89,99.9,100.78,67.55));
  //passing Array to be intialized first and than pass the argument in method
  System.out.println("Maximum number : " + maxNum(new double[]{2.3,67,89}));
  //here is no argument pass than method array length is 0 than exception call and thorw the method 
  System.out.println("Maximum number : " + maxNum());
 }
 //declared variable length argument which 
 //convert into Array elements 
 public static double maxNum(double... number){
   double max = number[0];
   if(number.length == 0){
     System.out.println("No Arguments pass ");
     return 0;
   }
   for(int i = 1 ; i < number.length ; i++)
    if(max < number[i])
     max = number[i];
   return max;
 }
}
