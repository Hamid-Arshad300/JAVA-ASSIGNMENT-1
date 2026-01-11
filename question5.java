
import java.util.Scanner;
public class question5 {
    public static void main(String[] args) {
        Scanner search;
        search = new Scanner(System.in);
        double watt;
        double voltage;
        System.out.println("the voltage in volt is:");
        voltage = search.nextDouble();
        double current;
        System.out.println("the current in amperes is :");
        current = search.nextDouble();
        watt = voltage * current;
        System.out.println("THE TOTAL WATT IS");
        System.out.println(watt);
    }
}
