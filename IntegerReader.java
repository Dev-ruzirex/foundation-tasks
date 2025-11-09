import java.util.Scanner;
public class IntegerReader {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number between 0 and 1000: ");
    int number = input.nextInt();

    int ones = number % 10;
    int twos = (number/10) % 10;
    int hundreds = (number/100) % 10;
    int thousands = (number/1000) % 10;
    int sum = ones + twos + hundreds + thousands;

    System.out.print("The sum of the digit is: " + sum);

    }
}
