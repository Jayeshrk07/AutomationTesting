package Oct.oct10_Constants_Literals;

public class Lab03_Literals {
    public static void main(String[] args) {
        //literals->
        //data_type variable_name = variable_value
        boolean have_car = false;
        boolean have_bike = true;
        // boolean has two type variable , true or false = literal boolean


        //Binary literal
        int age =65; // Decimal system - y, base will be 10
        //binary literal
        int binary_num = 0b1010;
        //Octal base
        int octal = 0101;

        // char literal
        char c1 = 'A';
        char c2 = 'B';
        char c3 = 'C';

        //Escape char
        char new_line = '\n'; //newline
        char tab_line = '\t'; //Tab sapce
        char back_space = '\b'; //Backspace
        char car_r = '\r'; //Carriage return
        char formfeed_f = '\f'; //Formfeed
        char single_quote_char = '\''; //Single quote character
        char double_quote_char = '\"'; //Double quote character
        char backslash_char = '\\'; //Backslash Character


        System.out.println("Jayesh"+ new_line + "Kapadane");
        System.out.println("Jayesh"+ tab_line + "Kapadane");
        System.out.println("Jayesh"+ back_space + "Kapadane");
        System.out.println("Jayesh"+ car_r + "Kapadane");
        System.out.println("Jayesh"+ formfeed_f + "Kapadane");
        System.out.println("Jayesh"+ single_quote_char + "Kapadane");
        System.out.println("Jayesh"+ double_quote_char + "Kapadane");
        System.out.println("Jayesh"+ backslash_char + "Kapadane");

    }
}
