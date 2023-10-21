public class CMD {
    public static void main(String[] args) {

        int sum = 0;
        for (int a = 0; a < args.length; a++) {
            sum = sum + Integer.parseInt(args[a]);
        }

        System.out.println("This is the sum :" + sum);