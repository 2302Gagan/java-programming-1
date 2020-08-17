import java.util.Scanner;

public class Calculator {
    interface addition{
        int add(int a, int b);
    }
    interface subtraction{
        int difference(int a, int b);
    }
    interface multiply{
        int product(int a, int b);
    }
    interface division{
        int safeDivision(int a, int b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        addition a1 =  (int c, int d) ->{ return c+d;};
        System.out.println("Addition: "+ a1.add(a, b));

        subtraction s2=(int c, int d) ->{return c-d;};
        System.out.println("Difference: "+ s2.difference(a, b));

        multiply m3=(int c, int d) ->{return c*d;};
        System.out.println("Product: "+ m3.product(a, b));

        division d4=(int c, int d) ->{
            if(b==0) {
                return 0;
            }
            else {
                return a/b;
            }
        };
        System.out.println("Division: "+ d4.safeDivision(a, b));
        sc.close();


    }

}

