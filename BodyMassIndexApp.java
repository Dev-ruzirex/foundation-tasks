import java.util.Scanner;
public class BodyMassIndexApp {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your weight in pounds: ");
    double firstNumber = input.nextDouble();

    System.out.print("Enter your height in inches: ");
    double secondNumber = input.nextDouble();

    double weight = firstNumber * 0.45359237;
    double height = (secondNumber * 0.0254) * (secondNumber * 0.0254);

    double bMi = weight/height;

    System.out.print("Body Mass Index is: " + bMi);

    }
}


    
