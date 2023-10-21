import java.util.*;

public class fahrehiet {
    public static void main(String[] args) {
        float temperature;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the temperature in fahrehiet");
        temperature = in.nextInt();
        temperature = ((temperature - 32) * 5) / 9;
        System.out.println("temperature in celsius=" + temperature);
    }

}