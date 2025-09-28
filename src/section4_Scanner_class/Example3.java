package section4_Scanner_class;
import java.util.Scanner;
//How to read short value from keyboard
public class Example3 {
    public static void main(String[] args){
        short s1;
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the short number : ");
        s1 = Input.nextShort();

        System.out.println("Short Value : " + s1);
    }
}