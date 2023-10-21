import java.util.*;
public class Calc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter the operation");
        char operation = sc.next().charAt(0);
        switch (operation) {
             case '+':
                 System.out.println("result is :" + (a + b));
                 break;
             case '-':
                  System.out.println("result is :" + (a - b));
                 break;
             case '*':
                 System.out.println("result is :" + (a * b));
                 break;
             case '/':
                 System.out.println("result is :" + (a / b));
                 break;        
                

        }



    }
    
    
}
