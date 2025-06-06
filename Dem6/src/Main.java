import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite broj izmedju 1 i 10: ");

        try {
            int broj = scanner.nextInt();
            if (broj < 0 || broj > 10){
                throw new ArrayIndexOutOfBoundsException("Broj " + broj + " nije izmedju 1 i 10!");
            }
            System.out.println(broj);
            System.out.println(100 / broj);
        }catch (InputMismatchException ime) {
            System.out.println("Unijeli ste niz slova!");
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Broj nije izmedju 1 i 10!");
        }catch (Exception e){
            System.out.println("Desila se greska: " + e.getMessage());
        }finally {
            System.out.println("Program je zavrsio sa izvrsavanjem!");
        }*/

        HashMap<String, Double> ponuda = new HashMap<String, Double>();
        ponuda.put("jabuka", 1.0);
        ponuda.put("kruh", 2.0);
        ponuda.put("mlijeko", 2.5);

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Dostupni proizvodi su: " + ponuda.keySet());
            System.out.println("Unesite proizvod koji zelite: ");
            String proizvod = scanner.nextLine();

            System.out.println("Unesite kolicinu koju zelite: ");
            int kolicina = scanner.nextInt();
            if (kolicina < 1 || kolicina > 10){
                throw new IllegalArgumentException("Broj " + kolicina + " nije izmedju 1 i 10!");
            }
            double cijena = ponuda.get(proizvod) * kolicina;

            System.out.println(cijena);
        }catch (NullPointerException npe){
            System.out.println("Proizvod nije dostupan!");
        }catch (InputMismatchException ime){
            System.out.println("Unesite cijeli broj za kolicinu!");
        }catch (Exception e){
            System.out.println("Desila se greska: " + e.getMessage());
        }finally {
            System.out.println("Program je zavrsio sa izvodjenjem!");
        }

        System.out.println("Izvan try-catch mehanizma");


        System.out.println("_______DRUGI ZADATAK______");

        PartTimeEmployee pte = new PartTimeEmployee(1, "Ante", RazinaIskustva.SREDNJA, 10.0);
        FullTimeEmployee fte = new FullTimeEmployee(2, "Marko", RazinaIskustva.VISOKA, 2000.0);
        EmployeeManagmentSystem mangmentSystem = new EmployeeManagmentSystem();
        mangmentSystem.addEmployee(pte);
        mangmentSystem.addEmployee(fte);
        try {
            System.out.println(mangmentSystem.findEmployeeById(1));
            System.out.println(mangmentSystem.findEmployeeById(3));
        }catch(Exception e){
            System.out.println("Desila se greska: " + e.getMessage());
        }
    }
}