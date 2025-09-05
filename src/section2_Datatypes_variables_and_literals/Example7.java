package section2_Datatypes_variables_and_literals;

// Example On How To Convert Integer To Hexadecimal, Octal, Binary
public class Example7
{
    public static void main(String[] args) {

        int x = 10;
        System.out.println(Integer.toHexString(x));
        System.out.println(Integer.toOctalString(x));
        System.out.println(Integer.toBinaryString(x));

        // Extra Example
        float f = 12.12f;
        System.out.println(Float.toHexString(f));

        double d = 12.12;
        System.out.println(Double.toHexString(d));

    }
}
