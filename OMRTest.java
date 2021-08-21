package com.example;
import java.util.Scanner;
public class OMRTest {
 public static void main(String args[]){
   char[][] answer = getMcqsShit();
   char[][] m = {{'-','-','1','-'},
   {'-','1','-','-'},{'-','-','1','-'},{'-','-','-','1'},{'-','-','1','-'},{'1','-','-','-'},{'-','1','-','-'},{'-','-','1','-'},{'1','-','-','-'},{'-','-','-','1'}};
   int rightAnswer = 0;
   int roughAnswer = 0;
   int noAnswer = 0;
   int attemptQuestions = 0;
   for(int i = 0; i < answer.length ;i++){
   int countNoAns = 0;
   int tieAns = 0;
     for(int j = 0 ; j < answer[i]. length ; j++){
       if(answer[i][j] == '-')
        countNoAns++;
       else
        attemptQuestions++;
       if(m[i][j] == '1' && answer[i][j] == '1')
        rightAnswer++;
       else if( m[i][j] == '1' || answer[i][j] == '1')
        tieAns++;
     }
     if(countNoAns == 4)
      noAnswer++;
     if(tieAns == 2)
      roughAnswer++;
   }
   int rightAnsMarks = rightAnswer*4;
   int negativeMarks = roughAnswer*4;
   int totalMarks = rightAnsMarks - roughAnswer;
   ShowMcqShit(answer);
   System.out.println("Attempts Questions : " + attemptQuestions);
   System.out.println("Correct Answers : " + rightAnswer);
   System.out.println("Incorrect Answers : " + roughAnswer);
   System.out.println(" Not Attempt Questions : " + noAnswer);
   System.out.println("Correct Answers Marks : " + rightAnsMarks);
   System.out.println("InCorrect Answers Marks : " + negativeMarks);
   System.out.println("Total Marks : " + totalMarks);
 }
 public static char[][] getMcqsShit(){
   Scanner input = new Scanner(System.in);
   char[][] answer = new char[10][4];
   System.out.println("Enter a your Answer (E.X : - - 1 - Answer is Option C) : ");
   for(int i = 0; i < answer.length ; i++){
     for(int j = 0; j < answer[i].length ; j++)
     answer[i][j] = input.next().charAt(0);
   }
  return answer;
 }
 public static void ShowMcqShit(char answer[][]){
   for(int i = 0; i < answer.length ; i++){
     for(int j = 0; j < answer[i].length ; j++)
     System.out.print(answer[i][j] + " ");
     System.out.println();
   }
  }
}
