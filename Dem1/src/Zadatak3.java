import java.util.Scanner;
public class Zadatak3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite prvu stranicu: ");
        int a = scanner.nextInt();
        System.out.println("Unesite drugu stranicu: ");
        int b = scanner.nextInt();
        System.out.println("Unesite treću stranicu: ");
        int c = scanner.nextInt();

        double P = calculateArea(a, b, c);

        System.out.printf("Trokut sa stranicama a=%d b=%d c=%d ima površinu %.2f", a, b, c, P);
    }
    public static double calculateArea(int a, int b, int c){
        if (a + b <= c || b + c <= a || a + c <= b) {
            System.out.println("Nije moguće konstruirati trokut");
            System.exit(0);
        }
        double s = (a + b + c) / 2.0;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
