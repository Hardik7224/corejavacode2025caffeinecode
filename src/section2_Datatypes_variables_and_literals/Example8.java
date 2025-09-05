package section2_Datatypes_variables_and_literals;

public class Example8
{
    // Checking The Binary Bits Of An Integer
    public static void main(String[] args)
    {
        Integer x = 10;
        System.out.println("Total Number Of Set Bits " + Integer.bitCount(x));

        Integer y = 12;
        System.out.println("Total Number Of Set Bits " + Integer.bitCount(x));

        // Printing The Last Active Bit From MSB & LSB
        Integer z = 120;
        System.out.println("Last Active Bit From MSB : " + Integer.highestOneBit(z));
        System.out.println("Last Active Bit From LSB : " + Integer.lowestOneBit(z));

    }
}