package com.example;
import java.util.Scanner;
public class EmuWorkingHours {
 public static void main(String args[]){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a number of Employees : ");
   int row = input.nextInt();
   System.out.println("Enter a working hours for each employees : ");
   int[][] emu = new int[row][7];
   for(int i = 0 ; i < emu.length;i++){
     System.out.print("Enter emu " + (i+1) + "'s working hours : ");
     for(int j = 0 ; j < emu[i].length ; j++){
     emu[i][j] = input.nextInt();
     }
   } 
   int[] workingHours = new int[row];
   int[] workingHoursOccrance = new int[row];
   for(int i = 0 ; i < emu.length;i++){
     int sum = 0;
     for(int j = 0 ; j < emu[i].length ; j++)
     sum += emu[i][j];
     workingHoursOccrance[i] = i;
     workingHours[i] = sum;
   } 
   for(int i = 1 ; i < workingHours.length ; i++){
     for(int j = 0 ; j < workingHours.length - i ; j++){
       if(workingHours[j] > workingHours[j+1] ){
         int temp = workingHours[j];
         workingHours[j] = workingHours[j+1];
         workingHours[j+1] = temp;
         int tem = workingHoursOccrance[j];
         workingHoursOccrance[j] = workingHoursOccrance[j+1] ;
         workingHoursOccrance[j+1] = tem;
       }
     }
   }
   System.out.println("Employee         " + "\t total working hours in week   ");
   for(int i = 0 ; i < workingHours.length ; i++){
     System.out.println((workingHoursOccrance[i] + 1)+ "                   " + workingHours[i]);
   }
 }
}
