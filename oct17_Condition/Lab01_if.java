package Oct.oct17_Condition;

import java.util.Scanner;

/*
if condition
1. only if condition
2. if - else
3. if with elseIf, else

Basic Syntax

if (condition) {
  //code to be executed if the condition is true
  }
 */
public class Lab01_if {
    public static void main(String[] args) {
        //int age = 20;
        //take user input
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        //allowed to vote or not
        //if age is greater than 18
        if (age > 18){
            System.out.println("allowed to vote");
        }

    }
}
