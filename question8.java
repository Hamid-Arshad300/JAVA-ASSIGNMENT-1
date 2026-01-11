
import java.util.Scanner;
public class question8 {
    public static void main(String[] args) {
        Scanner scan;
        scan = new Scanner(System.in);
        double a;
        System.out.print("a:");
        a = scan.nextDouble();
        double b;
        System.out.print("b:");
        b = scan.nextDouble();
        double c;
        System.out.print("c:3.5");
        c = scan.nextDouble();
        double s;
        s = (a + b + c) / 2;
        double perimeter;
        perimeter = s * (s - a) * (s - b) * (s - c);
        System.out.println("the perimeter of triangle is");
        System.out.println(perimeter);
    }
}