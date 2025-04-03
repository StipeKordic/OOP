import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int originalNumber = scanner.nextInt();
        int reversed = 0;

        while (originalNumber > 0) {
            int digit = originalNumber % 10;
            reversed = reversed * 10 + digit;
            originalNumber = originalNumber / 10;
        }

        System.out.println("Obrnuti broj: " + reversed);

    }
}