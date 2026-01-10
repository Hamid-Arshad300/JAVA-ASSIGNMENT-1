
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        int orignalprice;
        int discountedprice;
        int discountper;
        Scanner inp;
        inp = new Scanner(System.in);
        System.out.print("The orignal price is:");
        orignalprice = inp.nextInt();
        System.out.println("The discount percentage is:");
        discountper = inp.nextInt();
        discountedprice = orignalprice-(orignalprice * discountper/100);
        System.out.println(discountedprice);
    }
}