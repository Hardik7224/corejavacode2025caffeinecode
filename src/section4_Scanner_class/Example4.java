package section4_Scanner_class;
import java.util.Scanner;
//How to read long value from keyboard
public class Example4 {
    public static void main(String[] args){
        long l1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the long number:");
        l1=input.nextLong();
        System.out.println("Long Value : " + l1);
    }
}