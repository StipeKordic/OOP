import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        int a = scanner.nextInt();
        System.out.println("Unesite drugi broj: ");
        int b = scanner.nextInt();

        int nzd = NZD(a,b);
        System.out.println("NZD je: "+nzd);
        if (nzd == 1){
            System.out.println("Brojevi su relativno prosti");
        }else{
            System.out.println("Brojevi nisu relativno prosti");
        }
    }
    static int NZD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return NZD(b, a % b);
        }
    }
}
