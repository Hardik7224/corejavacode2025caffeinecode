package section4_Scanner_class;
import java.util.Scanner;
public class Example7 {
        public static void main(String[] args)
        {
            Scanner Input = new Scanner(System.in);
            boolean b1;

            System.out.println("Enter the boolean value : ");
            b1 = Input.nextBoolean();

            System.out.println("The Value Of Boolean B1 : " + b1);
        }
    }