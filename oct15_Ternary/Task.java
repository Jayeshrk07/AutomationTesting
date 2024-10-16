package Oct.oct15_Ternary;
//finding the largest number between 3 operators a,b,c.
//condition ? waht_if_truue : what_if_false
public class Task {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 15;

        //rough logic
        //a>=b && a>=c ? a: b>=c ? b:c

        int result = (a>=b && a>=c) ? a: (b>=c ? b:c);
        System.out.println("Max number is -> " + result);

    }
}
