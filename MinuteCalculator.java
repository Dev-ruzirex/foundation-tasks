import java.util.Scanner;
public class MinuteCalculator {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of minutes: ");
    int minutes = input.nextInt();

    int minutesPerDay = 60 *24;
    int minutesPerYear = minutesPerDay * 365;

    int years = minutes / minutesPerYear;
    int daysRemaining = (minutes % minutesPerYear) / minutesPerDay;

    System.out.print(minutes + " minutes is " + years + " years and " + daysRemaining + " days");


}
}
