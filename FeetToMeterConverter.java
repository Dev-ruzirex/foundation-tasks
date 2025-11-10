import java.util.Scanner;
    public class FeetToMeterConverter {
    public static void main(String [] args) {
    Scanner input = new Scanner(System.in);


    System.out.print("Please enter number: ");
    double number = input.nextDouble();

    double meters = number * 0.305;

    System.out.print(number + "feet is " + meters + "meters");
 }
}
