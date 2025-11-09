import java.util.Scanner;
public class MileToKilometer {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter the number: ");
    double number = input.nextDouble();

    double result = number * 1.6;

    System.out.print(number + " " + "miles is" + " " + result + " " + "kilometers" );
    
}
}
