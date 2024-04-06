import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //----------PRVI ZADATAK----------

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite duljinu niza: ");
        int size = scanner.nextInt();

        int[] randomArray = new int[size];

        for(int i = 0; i<randomArray.length; i++){
            randomArray[i] = (int) (Math.random()*100);
        }
        for(int i = randomArray.length-1; i>=0; i--){
            System.out.println(randomArray[i]);
        }

        int largestNumber = randomArray[0];
        int smallestNumber = randomArray[0];
        int smallestIndex = 0;
        int largestIndex = 0;

        for(int i = 0; i<randomArray.length; i++){
            if (randomArray[i]>largestNumber){
                largestNumber = randomArray[i];
                largestIndex = i;
            }
        }

        System.out.println("Najveći broj je " + largestNumber +" na indeksu " + largestIndex);*/

        //----------DRUGI ZADATAK----------

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite rečenicu: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        for(int i = 0; i<words.length; i++){
            System.out.println(words[i]);
        }

        int deleteWord = (int) (Math.random() * words.length);

        System.out.println(deleteWord);
        String newSentence = "";
        for(int i = 0; i<words.length; i++){
            if (i!=deleteWord){
                newSentence+=words[i] + " ";
            }
        }

        System.out.println(newSentence);*/

        //----------TREĆI ZADATAK----------

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite prvu stranicu: ");
        int a = scanner.nextInt();
        System.out.println("Unesite drugu stranicu: ");
        int b = scanner.nextInt();
        System.out.println("Unesite trecu stranicu: ");
        int c = scanner.nextInt();


        if(a+b<=c || b+c<=a || a+c<=b){
            System.out.println("Nije moguće konstruirati trokut");
            System.exit(1); //Naredba za prekid programa, argument 1 znači da je program završio sa izvođenjem, ali uz neku grešku
        }

        Double s = Double.parseDouble(String.valueOf(a+b+c))/2;

        Double P = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.printf("Trokut sa stranicama a=%d b=%d c=%d površina iznosi %.2f",a,b,c,P);*/


        //----------ČETVRTI ZADATAK----------

        /*Scanner scanner = new Scanner(System.in);
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
        }*/

        //----------PETI ZADATAK----------
        /*System.out.println("Izvučeni brojevi u redosljedu izvlačenja:");
        boolean[] numbers = new boolean[39];

        for (int i = 0; i < 7; ) {
            int num = (int) (Math.random() * 39);
            if (!numbers[num]) {
                numbers[num] = true;
                System.out.println(num + 1);
                i++;
            }
        }
        System.out.println("-------------------");
        System.out.println("Izvučeni brojevi poredani od najmanjeg do najvećeg:");
        for (int i = 0; i < 39; i++) {
            if (numbers[i]) {
                System.out.println(i + 1);
            }
        }*/
    }

    //----------POMOĆNA FUNKCIJA ZA ČETVRTI ZADATAK----------

    /*static int NZD(int a, int b){
        if (b==0){
            return a;
        }else{
            return NZD(b, a%b);
        }
    }*/
}