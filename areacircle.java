import java.util.Scanner;

public class areacircle {

    public static void main(String args[]) {
        int radius;
        double area;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");
        radius = sc.nextInt();
        area = (radius * radius) * Math.PI;
        System.out.println("area of circle::" + area);
    }
}