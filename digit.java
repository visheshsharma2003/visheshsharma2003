public class digit {
    public static void main(String[] args) {
        int count = 0;

        int Num = 123;
        while (Num != 0) {
            Num = Num / 10;
            Num /= 10;
            ++count;

            System.out.println("number of digit " + count);
        }

    }
}