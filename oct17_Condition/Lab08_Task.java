package Oct.oct17_Condition;

import java.util.Scanner;

//que
public class Lab08_Task {
    public static void main(String[] args) {
        /*
        Grade Calculator:
        Write a program that calculates and displays the letter grade
        for a given numerical score (e.g. A,B,C,D, OR F)
        based on the following grading scale:

        A: 90-100
        B: 80-99
        C: 70-89
        D: 60-79
        F: 0-59

       *Logic Building - JAVA*

       Step 1:
       Find the I/O -
       Input - Score -> range 0 -100 -> data type -> int
       Output - Grade -> data type -> char

       step 2:
       Basic logic/ rough logic
       if (score >= 90 && score <= 100) -> return or print grade - A
       else if score <=89 && score >= 80) -> return or print grade - B
       else if score <=79 && score >= 70) -> return or print grade - C
       D,E
       else -> grade - F

       Step 3:
       Write the Code
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your score:");
        int score = sc.nextInt();
        char grade = 'F';

        if (score >= 90 && score <=100){
            grade = 'A';
        } else if (score>=80 && score <=89) {
            grade = 'B';
        } else if (score >=70 && score <=79) {
            grade = 'C';
        } else if (score >= 60 && score <=69) {
            grade = 'D';
        } else if (score <= 0 || score >100) {
            System.out.println("LOL!! , are you God?");
            grade = 'O';
        }else {
            grade = 'F';
        }
        System.out.println("your grade is ->" + grade);
    }
}
