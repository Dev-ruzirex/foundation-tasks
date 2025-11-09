import java.util.Scanner;
public class PoundToKilogramConverter {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter ya number: ");
    double number = input.nextDouble();

    
    double kilogram = number * 0.454;

    System.out.print(number + " pounds is " + kilogram);

    }
}

