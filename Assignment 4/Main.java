import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ValidKYCDates validator = new ValidKYCDates();
        Scanner scanner = new Scanner(System.in);
        int numberOfQueries = scanner.nextInt();
        scanner.nextLine();

        while (numberOfQueries > 0) {
            String input = scanner.nextLine();
            validator.printKYCRange(input);
            numberOfQueries--;
        }
    }
}