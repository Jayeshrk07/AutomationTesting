package Oct.oct18_Switch_condition;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        //web automation
        //I will ask user which browser you want me to run the code
        //chrome, edge, firefox, safari
        //based on the browser, i will run the code

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser:");

        String browser = scanner.next();
        switch (browser){
            case "chrome":
                System.out.println("Running the code in chrome");
                break;
            case "edge":
                System.out.println("Running the code in edge");
                break;
            case "firefox":
                System.out.println("Running the code in firefox");
                break;
            case "safari":
                System.out.println("Running the code in safari");
                break;
            default:
                System.out.println("Invalid browser");
        }
    }
}
