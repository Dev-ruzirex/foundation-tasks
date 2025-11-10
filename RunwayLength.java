import java.util.Scanner;
public class RunwayLength {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.print("Enter acceleration: ");
    double take_off = input.nextDouble();

    System.out.print("Enter speed: ");
    double velocity = input.nextDouble();

    double speed = take_off * take_off;
    double accelaration = velocity * 2;

    double length = speed / accelaration;

    System.out.print("The minimum runway length for this airplane is " + length);
 }
} 

