import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int number = scanner.nextInt();
        if (isPrime(number)){
            System.out.printf("Broj %d je prost broj.", number);
        }else{
            System.out.printf("Broj %d nije prost broj.%n", number);
            System.out.printf("Prosti brojevi do broja %d: ", number);
            for(int i=2; i < number; i++){
                if (isPrime(i)){
                    System.out.print(i + " ");
                }
            }
        }

    }
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}