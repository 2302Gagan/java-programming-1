import java.util.Scanner;
import java.lang.Math;
public class Triangle {
     public double getArea(double a, double b, double c){
        double s = (a+b+c)/2;
        double result= Math.sqrt(s* (s-a) * (s-b) * (s-c));
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the Three Sides of a Triangle: ");
        double a,b,c;
        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        Triangle obj = new Triangle();
        System.out.println("Area of Triangle is "+ obj.getArea(a,b,c));
    }
}
