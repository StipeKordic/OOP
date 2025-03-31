import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Zadatak1 {
    public static void main(String[] args) {

        /*String[] gradovi = new String[2];
        gradovi[0] = "Zagreb";
        gradovi[1] = "Split";

        ArrayList<String> gradoviList = new ArrayList<>();
        gradoviList.add("Dubrovnik");
        gradoviList.add("Osijek");

        System.out.println(gradoviList.get(1));


        LinkedList<String> gradoviLinkedList = new LinkedList<>();
        gradoviLinkedList.add("Zagreb");

        HashMap<Integer, String> gradoviHashMap = new HashMap<>();

        gradoviHashMap.put(1, "Zagreb");
        gradoviHashMap.put(2, "Split");
        System.out.println(gradoviHashMap);
        System.out.println(gradoviHashMap.keySet());

        HashSet<String> gradoviHashSet = new HashSet<>();

        gradoviHashSet.add("Zagreb");
        gradoviHashSet.add("Split");
        System.out.println(gradoviHashSet);
        gradoviHashSet.add("Split");
        System.out.println(gradoviHashSet);*/

        HashMap<String, Double> studenti = new HashMap<>();

        studenti.put("Ana", 177.6);
        studenti.put("Ivan", 179.5);
        studenti.put("Marija", 181.3);
        studenti.put("Petar", 187.6);

        System.out.println(studenti);

        HashMap<String, Double> visokiStudenti = new HashMap<>();

        for(String kljuc: studenti.keySet()){
            if(studenti.get(kljuc) > 180){
                visokiStudenti.put(kljuc, studenti.get(kljuc));
            }
        }
        System.out.println(visokiStudenti);

    }
}