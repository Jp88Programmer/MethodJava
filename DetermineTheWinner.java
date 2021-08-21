package com.example;
import java.util.Scanner;
public class DetermineTheWinner {
 public static void main(String args[]){
   Scanner input = new Scanner(System.in);
   int testCase = input.nextInt();
   while(testCase > 0){
   int[] intialScore = new int[4];
   for(int i = 0; i<4 ; i++)
   intialScore[i] = input.nextInt();
   int[] decrease = new int[4];
   for(int i = 0; i<4 ; i++)
   decrease[i] = input.nextInt();
   int[] flashTime = new int[4];
   for(int i = 0; i<4 ; i++)
   flashTime[i] = input.nextInt();
   int[] ciscoTime = new int[4];
   for(int i = 0; i<4 ; i++)
   ciscoTime[i] = input.nextInt();
   int flashScore = 0;
   int ciscoScore = 0;
   for(int i = 0 ; i < 4 ; i++){
     flashScore += intialScore[i] - decrease[i]*flashTime[i];
     ciscoScore += intialScore[i] - decrease[i]*ciscoTime[i];
   }
   int flashRequireTime = flashTime[0];
   int ciscoRequireTime = ciscoTime[0];
   for(int i = 1 ; i < 4 ; i++){
     if(flashRequireTime < flashTime[i])
      flashRequireTime = flashTime[i];
     if(ciscoRequireTime < ciscoTime[i])
      ciscoRequireTime = ciscoTime[i];
   }
   if(flashScore < ciscoScore)
    System.out.println("Cisco");
   else if(flashScore > ciscoScore)
    System.out.println("Flash");
   else{
     if(flashRequireTime < ciscoRequireTime)
      System.out.println("Flash");
     else if(flashRequireTime > ciscoRequireTime)
      System.out.println("Cisco");
     else
      System.out.println("Tieo");
   }
   testCase--;
  }
 }
}
