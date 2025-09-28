package section4_Scanner_class;
import java.util.Scanner;
// How to read byte value from keyboard
public class Example2 {
    public static void main(String[] args){
            byte b1;
            Scanner Input = new Scanner(System.in);

            System.out.println("Enter the byte value : ");
            b1 = Input.nextByte();

            System.out.println("The value of byte b1 : " + b1);
    }
}