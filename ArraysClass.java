package com.example;

import java.lang.reflect.Array;
import java.util.Arrays;


public class ArraysClass {
 public static void main(String args[]){
   int[] arr = {2,5,7,2,1,9,5,9,23,12,56,34,45,22,11,20};
   //In sort method parallelSort is more efficient to sort 
   Arrays.parallelSort(arr,3,9);
   for(int i = 0 ; i < arr.length ; i++)
    System.out.print(arr[i] + " ");
    System.out.println();
   Arrays.sort(arr);
   for(int i = 0 ; i < arr.length ; i++)
    System.out.print(arr[i] + " ");
    //binarySearch method serach elements and return index 
   System.out.println("\n" + arr[Arrays.binarySearch(arr,23)] + " Index is " + Arrays.binarySearch(arr,23));
   //use to same elements in array fill method 
   Arrays.fill(arr,1,10,5);
   
   //toString method its return string to represent array of all elements
  // its use to travasing more efficient to converted String 
   
 }
}
