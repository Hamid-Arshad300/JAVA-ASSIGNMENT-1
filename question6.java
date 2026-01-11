
import java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
        Scanner search;
        search = new Scanner(System.in);
        double a; //a is the length of parallel side
        System.out.println("the length of one side is");
        a=search.nextDouble();
        double b; //b is another length of parallel side
        System.out.println("the length of another side is");
        b=search.nextDouble();
        double h; //h is the height;
        System.out.println("the height is");
        h= search.nextDouble();
        double k;
        System.out.println("the area of trapezoid");
        k = h * (a + b) / 2;
        System.out.println(k);
    }
}



