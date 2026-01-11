
import java.util.Scanner;
public class question7 {
    public static void main(String[] args) {
        Scanner scan;
        scan = new Scanner(System.in);
        int a;
        a = scan.nextInt();
        System.out.println("THE NUMBER IS");
        if (a % 2 == 1) {
            System.out.println("ODD");
        } else {
            System.out.println("EVEN");
        }
    }
}
