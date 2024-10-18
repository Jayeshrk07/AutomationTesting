package Oct.oct17_Condition;

import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
         //Create a program -> take user input
        // Check weather the input is even or odd number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number & I will tell you odd or even:");
        int num = sc.nextInt();

        //Modulus -> %
        // 10%2 == even -> 0
        // 10%2 == odd -> 1
        if (num%2 == 0){
            System.out.println("Num is even");
        } else {
            System.out.println("Num is odd");
        }
    }
}
