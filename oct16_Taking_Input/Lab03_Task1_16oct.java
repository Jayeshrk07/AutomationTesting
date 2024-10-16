package Oct.oct16_Taking_Input;
import java.util.Scanner;

public class Lab03_Task1_16oct {
    public static void main(String[] args) {
        Scanner Data = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = Data.nextLine();

        System.out.println("Enter your age:");
        int age = Data.nextInt();

        System.out.println("Enter your salary:");
        double salary = Data.nextDouble();

        System.out.println("Your Details:");
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Salary:" + salary);

        Data.close();
    }

}
