package com.example;
import java.util.Scanner;
public class TicTacGame {
 public static void main(String args[]){
   char[][] box = getBox();
   int[] result = new int[2] ;
   char part1 = 'X' ;
   char part2 = 'O' ;
   for(int i = 0 ; ; i++){
   if(i == 3 ){
    System.out.println("Draw");
    box = getBox();
    }
   System.out.println("Part1 your turn");
   box = ChooseCell(box,part1);
   ShowBox(box); 
   result = process(box);
   if(result[0] == 1){
    System.out.println("X win");
    break;
    }
   else if(result[1] == 1){
    System.out.println("O win");
    break;
    }
   System.out.println("Part2 your turn");
   box = ChooseCell(box,part2);
   ShowBox(box);   
   result = process(box);
   if(result[0] == 1){
    System.out.println("X win");
    break;
    }
   else if(result[1] == 1){
    System.out.println("O win");
    break;
    }
   }
 }
 public static char[][] getBox(){
   char[][] box = new char[3][3];
   for(int i = 0;i < box.length ; i++){
    for(int j = 0;j < box[i].length ; j++)
     box[i][j]=' ';
   }
   return box;
 }
 public static void ShowBox(char[][] box){
   for(int i = 0 ; i < box.length ; i++){
     System.out.println("-------------");
     for(int j = 0 ; j < box[i].length ; j++)
       System.out.printf("| %c ", box[i][j]);
     System.out.println("|");
   }
   System.out.println("-------------");
 }
 public static int[] process(char[][] box){
   int jodX = 0;
   int jodO = 0;
   for(int i = 0 ; i < box.length ; i++){
     if(box[i][0] == box[i][1] && box[i][1] == box[i][2]){
       if(box[i][0] == 'X')
        jodX = 1 ;
       if(box[i][0] == 'O')
        jodO = 1 ;
     }
   }
   for(int j = 0 ; j < box.length ; j++){
     if(box[0][j] == box[1][j] && box[1][j] == box[2][j]){
       if(box[0][j] == 'X')
        jodX = 1 ;
       if(box[0][j] == 'O')
        jodO = 1 ;
     }
   }
   if(box[0][0] == box[1][1] && box[1][1] == box[2][2]){
      if(box[0][0] == 'X')
         jodX = 1 ;
       if(box[0][0] == 'O')
        jodO = 1 ;
   }
     if(box[0][2] == box[1][1] && box[1][1] == box[2][0]){
      if(box[0][2] == 'X')
        jodX = 1 ;
       if(box[0][2] == 'O')
        jodO = 1 ;
   }
   int[] pair = new int[2];
   pair[0] = jodX;
   pair[1] = jodO;
   return pair;
 }
 public static char[][] ChooseCell(char[][] box,char part){
   Scanner input = new Scanner(System.in);
   System.out.println("Enter a row and column (0,1,2 for each) : ");
   int rowValue = input.nextInt();
   int colsValue = input.nextInt();
   box[rowValue][colsValue] = part;
   return box;
 }
}
