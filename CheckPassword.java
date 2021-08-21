package com.example;
import java.util.Scanner;
public class CheckPassword {
 public static void main(String args[]){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a Password : ");
   String password = input.next();
   checkPassword(password);
 }
 public static void checkPassword(String password){
   if(password.length() < 8)
   System.out.println("Invalid Password");
   else{
     int count = 0;
     for(int i = 0 ; i < password.length() ; i++){
       if(Character.isLetterOrDigit(password.charAt(i))){
       if(Character.isDigit(password.charAt(i)))
       count++;}
        else{
System.out.println("Invalid Password"); break;}

     }
     if(count < 2)
     System.out.println("Invalid Password");
     System.out.println("Valid Password");
   }
 }
}
