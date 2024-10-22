package Oct.oct22_while;

public class Lab01 {
    public static void main(String[] args) {
        //Taking input by BufferReader
        //Take user input for the age and print the output
        // 30, 29, 28, ..........1

        String arg_age_string =[0];
        //String -> Int
        int age = Integer.parseInt(arg_age_string);
        //System.out.println(age);

        while (age > 0) {
            System.out.println(age);
            age--;
        }
    }
}
