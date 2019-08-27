package Exercise1;
import java.util.Scanner;

public class Question6 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value x = ");
        double x = scanner.nextDouble();
        System.out.print("Enter value y = ");
        double y = scanner.nextDouble();
        if (((x>=-2) && (x<=2) && (y>=0) && (y<=4)) || ((x>=-4) && (x<=4) && (y>=-3) && (y<=0))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

