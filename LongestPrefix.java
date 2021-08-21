package com.example;
import java.util.Scanner;
public class LongestPrefix {
 public static void main(String args[]){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a first string : ");
   String str1 = input.next();
   System.out.println("------------------------------");
   System.out.print("Enter a second string : ");
   String str2 = input.nextLine();
   System.out.println(LongestPrefix(str1,str2));
 }
 public static String LongestPrefix(String str1, String str2){
   boolean firstComp = str1.charAt(0) == str2.charAt(0);
  // if(!firstComp)
  // return ;
   String concate = " " + str1.charAt(0);
   for(int i = 1 ; i < Math.min(str1.length(),str2.length()) && firstComp ; i++){
     if(str1.charAt(i) == str2.charAt(i))
     concate = concate + str1.charAt(i);
   }
   return concate;
 }
}
