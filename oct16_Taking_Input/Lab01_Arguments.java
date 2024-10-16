package Oct.oct16_Taking_Input;

//How to take user inputs in java:
//1. Arguments (In Console)
//2. Scanner class
//3. BufferReader (Input stream)

public class Lab01_Arguments {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
       // System.out.printf("%d, %d, %d", args[0], args[1], args[2]);
        int age = Integer.parseInt(args[0]);
        System.out.println(age>25 ? "Allowed to go" : "Not Allowed");
    }
}
