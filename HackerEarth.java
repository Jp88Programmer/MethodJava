package com.example;
import java.util.Scanner;
public class HackerEarth {
 public static void main(String args[]){
   Scanner input = new Scanner(System.in);
   int test = input.nextInt();
   while(test > 0){
    int num = input.nextInt();
    int[] arr = new int[num];
    for(int i = 0 ; i < num ; i++)
     arr[i] = input.nextInt();
    String str = "" + arr[0];
    for(int i = 1 ; i < arr.length ; i++)
     str = str + arr[i];
    System.out.println(str);
    char[] arr1 = new char[str.length()];
    for(int i = 0 ; i < str.length(); i++)
     arr1[i] = str.charAt(i);
    for(int i = 0 ; i < arr1.length ; i++)
     System.out.print(arr[i] + " ");
   }
 }
}
