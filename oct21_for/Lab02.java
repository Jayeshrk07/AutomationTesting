package Oct.oct21_for;

public class Lab02 {
    public static void main(String[] args) {

        //if i=0 then use i <10
        //if i=1 then use i <=10

        for (int i = 0; i < 10; i++) {    // 0-9 time it will execute -> 10 times
            System.out.println(i);
        }
        for (int j = 1; j <= 10; j++) {     // 1-10 time it will execute -> 10 times
            System.out.println(j);
        }
        for (int j = 0; j <= 10; j++) {     // 0-10 time it will execute -> 11 times
            System.out.println(j);
        }
    }
}