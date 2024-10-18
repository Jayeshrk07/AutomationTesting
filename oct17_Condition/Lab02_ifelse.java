package Oct.oct17_Condition;

import java.util.Scanner;

public class Lab02_ifelse {
    public static void main(String[] args) {
        //take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        //allowed to vote or not
        //if age is greater than 18
        //if age is less than 18
        if (age > 18){
            System.out.println("Allowed to vote");
        }
        else {
            System.out.println("Not Aloowed");
        }
    }
}
