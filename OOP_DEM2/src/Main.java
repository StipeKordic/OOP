import java.util.*;

public class Main {
    public static void main(String[] args) {

        //ArrayList
        /*String[] gradovi = {"Zagreb", "Split"};

        ArrayList<String> gradoviList = new ArrayList<>();

        gradoviList.add("Dubrovnik");
        gradoviList.add("Osijek");
        gradoviList.add("Dubrovnik");

        System.out.println(gradovi);
        System.out.println(gradoviList);

        System.out.println(gradovi[0]);
        System.out.println(gradoviList.get(0));

        System.out.println(gradovi.length);
        System.out.println(gradoviList.size());

        gradoviList.set(1, "Zadar");

        gradoviList.remove("Dubrovnik");
        System.out.println(gradoviList);

        //Za stvaranje ArrayList-a iz klasičnog niza
        ArrayList<String> gradoviList2 = new ArrayList<>(Arrays.asList(gradovi));
        System.out.println(gradoviList2);

        System.out.println("------------------");

        //LinkedList

        LinkedList<String> gradoviLinkedist = new LinkedList<>();

        gradoviLinkedist.add("Zagreb");
        gradoviLinkedist.add("Split");

        System.out.println(gradoviLinkedist);

        gradoviLinkedist.set(1, "Karlovac");
        System.out.println(gradoviLinkedist);

        gradoviLinkedist.add(1, "Pula");

        System.out.println(gradoviLinkedist);

        System.out.println(gradoviLinkedist.get(2));


        System.out.println("------------------");

        //HashSet
        HashSet<String> gradoviSet = new HashSet<>();

        gradoviSet.add("Osijek");
        gradoviSet.add("Split");
        gradoviSet.add("Zadar");
        gradoviSet.add("Split");

        System.out.println(gradoviSet);

        gradoviSet.remove("Zagreb");

        System.out.println(gradoviSet);

        System.out.println(gradoviSet.isEmpty());
        gradoviSet.clear();
        System.out.println(gradoviSet.isEmpty());

        gradoviSet.addAll(gradoviList);

        System.out.println(gradoviSet);

        System.out.println("---------------");

        //HashMap

        HashMap<Integer, String> gradoviMap = new HashMap<>();

        gradoviMap.put(1, "Zagreb");
        gradoviMap.put(2, "Split");
        gradoviMap.put(3, "Zadar");

        System.out.println(gradoviMap);

        System.out.println(gradoviMap.get(2));

        System.out.println(gradoviMap.containsKey(1));

        System.out.println(gradoviMap.containsValue("Zagreb"));

        gradoviMap.replace(4, "Rijeka");
        gradoviMap.putIfAbsent(4, "Karlovac");

        System.out.println(gradoviMap);

        gradoviMap.remove(4);

        System.out.println(gradoviMap);*/

        //PRVI ZADATAK
        HashMap<String, Double> studenti = new HashMap<>();

        studenti.put("Ana", 175.6);
        studenti.put("Ivan", 185.6);
        studenti.put("Marija", 181.3);
        studenti.put("Petar", 171.3);

        System.out.println(studenti);

        HashMap<String, Double> visokiStudenti = new HashMap<>();

        for(String kljuc: studenti.keySet()){
            if (studenti.get(kljuc)>180){
                visokiStudenti.put(kljuc, studenti.get(kljuc));
            }
        }
        System.out.println(visokiStudenti);

        //DRUGI ZADATAK
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite novi broj: ");
        double broj = scanner.nextDouble();

        ArrayList<Double> nizBrojeva = new ArrayList<>();
        double zbroj = 0.0;

        while (broj != 0){
            nizBrojeva.add(broj);
            zbroj+=broj;
            System.out.println("Unesite novi broj: ");
            broj = scanner.nextDouble();
        }

        System.out.println(nizBrojeva);

        if(nizBrojeva.isEmpty()){
            System.out.println("Aritmeticki prosjek je 0");
        }else{
            System.out.println("Aritmeticki prosjek je "+zbroj/nizBrojeva.size());
        }
        //TRECI ZADATAK
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Unesite novu rijec: ");
        String rijec = scanner2.nextLine();

        HashSet<String> nizRijeci = new HashSet<>();

        while (!rijec.equals("kraj")){
            nizRijeci.add(rijec);
            System.out.println("Unesite novu rijec: ");
            rijec = scanner2.nextLine();
        }

        System.out.println(nizRijeci);

    }
}