import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite novi broj: ");
        double broj = scanner.nextDouble();

        ArrayList<Double> nizBrojeva = new ArrayList<>();

        double ukupniZbroj = 0.0;

        while (broj != 0){
            nizBrojeva.add(broj);
            ukupniZbroj += broj;
            System.out.println("Unesit broj: ");
            broj = scanner.nextDouble();
        }
        if (nizBrojeva.isEmpty()){
            System.out.println("Aritemticki prosjek je 0");
        }
        else{
        System.out.println("Aritmeticki prosjek je: " + ukupniZbroj/nizBrojeva.size());
        }
    }
}
