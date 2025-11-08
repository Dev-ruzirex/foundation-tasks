import java.util.Scanner;
public class EggCounter {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("How many eggs do you have?: ");
    int number = input.nextInt();

    int gross = number/144;
    int dozen = gross/12;
    int leftover = gross % 12;

if (gross > 500) {
    System.out.print("Your number of egg is: " + gross + "gross, " + " " + dozen + "dozen, and" + leftover + "leftover");
   }

else {
        
        System.out.print("You have" + " " + dozen + " " + "dozen and " + " " + leftover + " " + "left over");
    }
}
}
