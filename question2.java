
import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        double radius;
        double circumference;
        double area;
        Scanner input;
        input=new Scanner(System.in);
        System.out.println("the radius of circle is:");
        radius=input.nextDouble();
        System.out.println("the circumference of circle is");
        circumference=2*Math.PI*radius;
        System.out.println(circumference);
        System.out.println("the area of circle is");
        area=Math.PI*radius*radius;
        System.out.println(area);

    }
}




