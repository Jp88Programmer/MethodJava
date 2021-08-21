package com.example;

public class DackCards {
 public static void main(String args[]){
   int[] deck = new int[52];
   for(int i = 0 ; i < deck.length ; i++)
    deck[i] = i;
   String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
   String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9","10", "Jack","Queen", "King"};
   for(int i = 0 ; i < deck.length ; i++){
    //genrate random index 
     int j = (int)(Math.random()*deck.length);
    //Swap j to i
    int temp = deck[i];
    deck[i] = deck[j];
    deck[j] = temp;
   }
   for(int i = 0 ; i < 8 ; i++){
     String suit = suits[deck[i]/13];
     String rank = ranks[deck[i]%13];
     System.out.println("Card number " + deck[i] + " is : " + rank + " of " + suit);
   }
 }
}
