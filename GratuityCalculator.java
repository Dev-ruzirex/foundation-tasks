import java.util.Scanner;
public class GratuityCalculator {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter gratuity: ");
    double firstNumber = input.nextDouble();

    System.out.print("Please enter subtotal: ");
    double secondNumber = input.nextDouble();

    double subtotal = secondNumber/100;
    double gratuity = firstNumber * subtotal;
    double total = gratuity + firstNumber;

    System.out.print("The gratuity is $" + gratuity + " " + "the total is $" + total);
}
    } 
