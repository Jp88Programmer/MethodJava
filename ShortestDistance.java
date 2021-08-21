package com.example;
import java.util.Scanner;
public class ShortestDistance {
 public static double distance(double x1, double y1, double x2, double y2){
   return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
 }
 public static void main(String args[]){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a number of points : ");
   int row = input.nextInt();
   System.out.print("Enter a "+ row + " Corrdinate points : ");
   double[][] point = new double[row][2];
   for(int i = 0; i < point.length ; i++){
     point[i][0] = input.nextDouble();
     point[i][1] = input.nextDouble();
   }
   double shortestDistance = distance(point[0][0], point[0][1], point[1][0],point[1][1]);
   int pointIndex1 = 0;
   int pointIndex2 = 0; 
   for(int i = 0 ; i < point.length ; i++){
     for(int j = i+1 ; j < point.length ; j++){
       double dis = distance(point[i][0], point[i][1], point[j][0],point[j][1]);
       if(shortestDistance > dis){
        shortestDistance = dis;
        pointIndex1 = i;
        pointIndex2 = j;
        }
     }
   }
   System.out.println("Nearest point pair :      (" + point[pointIndex1][0] + "," + point[pointIndex1][1] + ") (" + point[pointIndex2][0] + "," + point[pointIndex2][1] + ") \nDistance : " + shortestDistance);
 }
}
