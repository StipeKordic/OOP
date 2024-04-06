import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //PRVI ZADATAK
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite dimenziju kvadratne matrice:");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Dimenzija matrice mora biti pozitivan broj.");
            System.exit(1);
        }

        ArrayList<ArrayList<Integer>> matrica = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> red = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int randomNumber = (int) (Math.random() * 10);
                red.add(randomNumber);
            }
            matrica.add(red);
        }

        System.out.println("Ispis matrice:");
        ispisMatrice(matrica);

        int sum = zbrojiElemente(matrica);
        System.out.println("Zbroj elemenata koji nisu na rubu matrice: " + sum);
        */
        /*
        //DRUGI ZADATAK
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite početak raspona:");
        int pocetak = scanner.nextInt();

        System.out.println("Unesite kraj raspona:");
        int kraj = scanner.nextInt();

        System.out.println("Prosti brojevi u rasponu od " + pocetak + " do " + kraj + " su:");
        for (int i = pocetak; i <= kraj; i++) {
            if (jeLiProst(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("----------------------------");*/

        //TREĆI ZADATAK
        Predmet oop = new Predmet("OOP", 5);
        Predmet prog1 = new Predmet("Programiranje 1", 4);
        Predmet prog2 = new Predmet("Programiranje 2", 3);

        Student student = new Student("Pero", "Peric", 12345);
        student.dodajPredmet(oop);
        student.dodajPredmet(prog1);
        student.dodajPredmet(prog2);

        System.out.println(student);
    }

    //FUNKCIJA ZA ISPIS MATRICE (PRVI ZADATAK)
    public static void ispisMatrice(ArrayList<ArrayList<Integer>> matrica) {
        for (ArrayList<Integer> row : matrica) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    //FUNKCIJA ZA ZBRAJANJE ELEMENATA KOJI NISU NA RUBU MATRICE (PRVI ZADATAK)
    public static int zbrojiElemente(ArrayList<ArrayList<Integer>> matrica) {
        int zbroj = 0;
        int n = matrica.size();

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                zbroj += matrica.get(i).get(j);
            }
        }

        return zbroj;
    }

    //FUNKCIJA KOJA PROVJERAVA JE LI BROJ PROST (DRUGI ZADATAK)
    public static boolean jeLiProst(int broj) {
        if (broj <= 1) {
            return false;
        }
        for (int i = 2; i <= broj/2; i++) {
            if (broj % i == 0) {
                return false;
            }
        }
        return true;
    }
}