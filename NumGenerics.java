import java.util.Scanner;

class GenericException extends Exception{
    GenericException(String str){
        super(str);

    }
}

public class NumGenerics {

    static <T> void operation(T n) {

        try {
            if(n instanceof Number) {

                double res = Double.parseDouble(n.toString()) * 2/3;

                System.out.println("Answer: "+res);
            }
            else {
                GenericException me = new GenericException("It is not a number.");
                throw me;
            }

        }
        catch(GenericException me) {
            System.out.println(me);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value: ");
        String a = sc.next();
        operation(Double.parseDouble(a));
        sc.close();
    }

}
