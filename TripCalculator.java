import java.util.Scanner;
public class TripCalculator {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.print("Enter the driving distance: ");
    double distance = input.nextDouble();

    System.out.print("Enter miles per galon: ");
    double milesPerGallon = input.nextDouble();

    System.out.print("Enter the price of fuel per per gallon: ");
    double pricePerGallon = input.nextDouble();

    double totalGallon = distance/milesPerGallon;

    double total = totalGallon * pricePerGallon;

    System.out.print("The cost of driving is $" + total);


}
}
