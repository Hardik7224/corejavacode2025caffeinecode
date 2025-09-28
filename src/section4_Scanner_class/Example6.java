package section4_Scanner_class;
import java.util.Scanner;
//How to read double value from keyboard
public class Example6 {
    public static void main(String[] args){
        double d1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the double number:");
        d1=input.nextDouble();
        System.out.println("Double Value : " + d1);
    }
}