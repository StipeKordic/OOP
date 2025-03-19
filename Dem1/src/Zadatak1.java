import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite duljinu niza: ");
        int size = scanner.nextInt();
        if (size <= 0){
            System.out.println("Broj nije veći od 0, prekid programa...");
            System.exit(0);
        }

        int[] randomArray = new int[size];

        for(int i = 0; i < randomArray.length; i++){
            int randomNum = (int) (Math.random()*100);
            randomArray[i] = randomNum + 1;
            System.out.print(randomNum + 1 + " ");
        }
        System.out.println();
        //Ispis od zadnjeg elementa prema prvom
        for(int i = randomArray.length - 1; i >= 0; i--){
            System.out.print(randomArray[i] + " ");
        }

        int maxNumber = randomArray[0];
        int maxIndex = 0;
        int minNumber = randomArray[0];
        int minIndex = 0;

        for(int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] > maxNumber) {
                maxNumber = randomArray[i];
                maxIndex = i;
            }
            if (randomArray[i] < minNumber){
                minNumber = randomArray[i];
                minIndex = i;
            }
        }
        System.out.printf("%nNajveći broj u nizu je %d i nalazi se na indeksu %d", maxNumber, maxIndex);
        System.out.printf("%nNajmanji broj u nizu je %d i nalazi se na indeksu %d", minNumber, minIndex);
    }
}