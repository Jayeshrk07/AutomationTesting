package Oct.oct18_Switch_condition;

public class Lab05 {
    public static void main(String[] args) {
        int itemcode = 001;

        switch (itemcode){
            case 001:
                System.out.println("It's a laptop");
                break;
            case 002:
                System.out.println("It's a desktop");
                break;
            case 003:
                System.out.println("It's a mobile phone");
                break;
            default:
                System.out.println("Invalid itemcode");
        }

    }
}
