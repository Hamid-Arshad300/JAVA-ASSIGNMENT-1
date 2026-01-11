
import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
        int orignalprice;
        int discountedprice;
        int discountper;
        Scanner inp;
        inp = new Scanner(System.in);
        System.out.println("The discounted price is");
        discountedprice = inp.nextInt();
        System.out.println("the discounted percentage is");
        discountper = inp.nextInt();
        orignalprice = discountedprice*100/(100-discountper);
        System.out.println("the orignal price is");
        System.out.println(orignalprice);
    }
}
