package Oct.oct15_Increment_Decrement;

/*Increment & Decrement
Increment Operator (++)
- Prefix Increment: ++variable
- Postfix Increment: variable++
*/

public class Lab01 {
    public static void main(String[] args) {
        //pre-increment - ++operand
        //value is increamented first &
       int a = 10;
       int b = ++a;

       System.out.println(b);
       System.out.println(a);

       //post-increment
        int c = 10;
        int d = c++;

        System.out.println(d);
        System.out.println(c);



    }
}
