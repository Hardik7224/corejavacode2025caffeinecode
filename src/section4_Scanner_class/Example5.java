package section4_Scanner_class;
import java.util.Scanner;
//How to read float value from keyboard
public class Example5 {
    public static void main(String[] args){
        float f1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the float number:");
        f1=input.nextFloat();
        System.out.println("Float Value : " + f1);
    }
}