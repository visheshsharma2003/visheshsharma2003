public class count {

    public static void main(String[] args) {

        int count = 0;
        int n = 1234;

        while (n != 0) {
            n /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }
}