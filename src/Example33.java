
import java.util.Scanner;
public class Example33 {
    public static void main(String[] argv) {
        int n;
        double x;
        double squareRoot = 0;
        Scanner inputValue=new Scanner(System.in);
        System.out.println("Enter a number:");
        n= inputValue.nextInt();
        x = n /2f;
        do {
                squareRoot = 0.5 * (x + n / x);
                x = squareRoot;
            System.out.println(" The square root of number " + n + "is: " + squareRoot);
        } while ((x-squareRoot) < 0.000001);
    }
}