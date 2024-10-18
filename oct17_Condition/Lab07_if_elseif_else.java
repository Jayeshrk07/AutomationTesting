package Oct.oct17_Condition;

import java.util.Scanner;

public class Lab07_if_elseif_else {
    public static void main(String[] args) {
        //condition - 2 outputs,
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num1:");
        int num1= sc.nextInt();
        System.out.println("Enter the Num2:");
        int num2 = sc.nextInt();

        // 1 -> num1 > num2
        // 2 -> num2 > num1
        // 3 -> num1==num2
        if (num1 > num2){
            System.out.println("Num1 > Num2");
        } else if (num2 > num1) {
            System.out.println("Num2 > num 1");
        }
        else {
            System.out.println("Equal");
        }
    }
}
