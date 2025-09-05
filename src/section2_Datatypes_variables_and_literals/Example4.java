package section2_Datatypes_variables_and_literals;

//Rules For Naming Variables

public class Example4
{

    public static void main(String[] args) {

        // 1. Variables In Java Are Case Sensitive
        int number = 10;
        int Number = 100;
        int NUMBER = 1000;

        System.out.println(number);
        System.out.println(Number);
        System.out.println(NUMBER);

        // 2. Variable Name Can Contain Alphabets, Number And __ and $
        int number1 = 50;
        int number_1 = 500;
        int $number1 = 5000;
        int _number1 = 500000;

        // 3. Variable Name Should Not Be Any Keyword
//		int static = 12;
//		int public = 120;


        // 4. Variable identifier can be a class name
        int String = 1200;
        int Math = 12;

        // 5. Follow camelCase Naming Convention
        int sumOfNaturalNumbers = 50;
        int productOfNaturalNumbers = 1200;

    }
}
