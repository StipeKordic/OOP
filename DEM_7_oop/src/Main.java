import java.util.InputMismatchException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> names = new HashMap<>();

        System.out.println("Unesite imena: ");

        String name = scanner.nextLine();

        while(!(name.equals("kraj"))){
            Integer brojPonavljanja = names.get(name);
            if (brojPonavljanja == null){
                names.put(name, 1);
            }else{
                names.put(name, brojPonavljanja + 1);
            }
            name = scanner.nextLine();
        }

        System.out.println(names);*/

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<>();

        System.out.println("Unesite 5 brojeva: ");

        for(int i = 0; i<5; i++){
            try{
            System.out.println("Unesite broj " + (i + 1) + ":");
            Integer broj = scanner.nextInt();
            brojevi.add(broj);
            }catch (Exception e){
                System.out.println("Pogrešan unos");
                scanner.next();
                i--;
            }


        }
        System.out.println(brojevi);


        System.out.println("Unesite indeks");
        try{
            int unos = scanner.nextInt();
            System.out.println(brojevi.get(unos));
        }catch(IndexOutOfBoundsException e){ //Greška ne predavanju je bila što je ovdje bio ArrayIndexOutOfBoundsException umjesto IndexOutOfBoundsException
            System.out.println("Nema tog indeksa");
        }catch(InputMismatchException e){
            System.out.println("Unos je neispravan");
        }

    }
}