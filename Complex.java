import java.util.Scanner;
public class Complex {
    double real, imaginary;
    Complex(double r, double i){
        this.real=r;
        this.imaginary=i;
    }
    public static Complex add(Complex n1,Complex n2){
        Complex t1 =new Complex(0,0);
        t1.real = n1.real + n2.real;
        t1.imaginary = n1.imaginary + n2.imaginary;
        return t1;
    }
    public static Complex difference(Complex n1,Complex n2){
        Complex t2 =new Complex(0,0);
        t2.real = n1.real - n2.real;
        t2.imaginary = n1.imaginary - n2.imaginary;
        return t2;
    }
    public static Complex product(Complex n1,Complex n2){
        Complex t3 =new Complex(0,0);
        t3.real = n1.real * n2.real;
        t3.imaginary = n1.imaginary * n2.imaginary;
        return t3;
    }
    public static void main( String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter First real and imaginary number:");
        Complex num1 = new Complex(input.nextDouble(),input.nextDouble());
        System.out.println("Enter Second real and imaginary number:");
        Complex num2 = new Complex(input.nextDouble(),input.nextDouble());
        Complex temp1 = add(num1,num2);
        Complex temp2 = difference(num1,num2);
        Complex temp3 = product(num1,num2);
        System.out.println("Addition:\t" + temp1.real +" + "+ temp1.imaginary+"i");
        System.out.println("Difference:\t" + temp2.real +" + "+ temp2.imaginary+"i");
        System.out.println("Product:\t" + temp3.real +" + "+ temp3.imaginary+"i");
    }
}
