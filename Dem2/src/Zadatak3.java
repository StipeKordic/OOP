import java.util.HashSet;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite rijec: ");
        String rijec = scanner.nextLine();

        HashSet<String> setRijeci = new HashSet<>();

        while (!rijec.equals("kraj")){
            setRijeci.add(rijec);
            System.out.println("Unesite rijec: ");
            rijec = scanner.nextLine();
        }

        System.out.println(setRijeci);
    }
}
