
import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        int max;
        int obt;
        double percentage;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("The maximum number is");
        max = input.nextInt();
        System.out.println("The obtained number is");
        obt = input.nextInt();
        percentage = 1.0 * obt / max * 100;
        System.out.println(percentage);
    }
}






