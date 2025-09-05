package section3_Operators_And_Expression;

public class Example4 {
    public static void main (String[] args){
        // proving sin^2 (A) + cos^2 (A) =1
        double a=(Math.pow(Math.sin((Math.PI/4)),2))+(Math.pow(Math.cos((Math.PI/4)),2));
        System.out.println(a);
        // calculating logarithm
        double num=Math.log10(1000);
        System.out.println(num);
        // eliminating decimals
        double floorValue=Math.floor(12.8233);
        System.out.println(floorValue);
        // round off decimals
        double ceilValue=Math.ceil(12.8233);
        System.out.println(ceilValue);
    }
}
