package section3_Operators_And_Expression;

public class Example3 {
    // Calculating area and perimeter of a circle
    public static void main (String[] args){
        int radius=10;
        double area=Math.PI*(Math.pow(radius,2));
        System.out.println("Area : "+area);
        double perimeter=2*Math.PI*radius;
        System.out.println("Perimeter : "+perimeter);
    }
}
