import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        double[] numberList = {6.45, 13.2, 97.54, 64.9, 44.4, 2.5, 31.81, 33.33, 49.1, 72.6};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int number = scanner.nextInt();

        double result = -1.0;

        for (double numInList: numberList) {
            if (numInList < number && numInList > result) {
                result = numInList;
            }
        }
        if (result != -1.0) {
            System.out.printf("Broj %.2f je najveći broj iz liste, takav da je manji od %d", result, number);
        }else{
            System.out.printf("Svi brojevi u listi su veći od broja %d", number);
        }
    }
}