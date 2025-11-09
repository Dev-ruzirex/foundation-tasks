import java.util.Scanner;
public class DistanceCalculator {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.print("Enter InitialVelocity: ");
    double u = input.nextDouble();

    System.out.print("Enter Time span: ");
    double t = input.nextDouble();

    System.out.print("Enter Acceleration: ");
    double a = input.nextDouble();
    
    double m = u * t;

    double n = (0.5 * a * t * t);

    double distance = m + n;

System.out.printf("The distance covered is %f", distance);

}
}
