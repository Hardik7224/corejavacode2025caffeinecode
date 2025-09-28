package section4_Scanner_class;
import java.util.Scanner;
// How to read integer value from keyboard
public class Example1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int x;
        int y;

        System.out.println("Enter the value of x : ");
        x = Input.nextInt();

        System.out.println("Enter the value of y : ");
        y = Input.nextInt();

        System.out.println("The value of x and y " + x + "and" + y);

    }
}