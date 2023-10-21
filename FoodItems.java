import java.util.Scanner;

enum FoodItems{
    PIZZA, BURGER, DRINKS, SWEETS, PASTA
}

public class food {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int charValue = System.in.read();
        char ch = scanner.next().charAt(0);
        FoodItems enumChoice = FoodItems.BURGER;
        switch (enumChoice) {
            case PIZZA:
                System.out.println("You have orderd Pizza");
                break;
            case BURGER:
                System.out.println(
                        "This is the enum value" + enumChoice + "and this is the index" + enumChoice.ordinal());
                break;
            case DRINKS:
                System.out.println("You have orderd Drinks");
                break;
            case SWEETS:
                System.out.println("You have ordered Sweets");
                break;
            case PASTA:
                System.out.println("You have ordered Pasta");
                break;
            default:
                System.out.println("Invalid input");

        }
    }
}