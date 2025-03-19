import java.util.Scanner;
public class Zadatak2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite rečenicu: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }

        int deleteWord = (int) (Math.random() * words.length);

        System.out.println("Bišemo riječ na indeksu " + deleteWord);
        for(int i = 0; i<words.length; i++){
            if (i!=deleteWord){
                System.out.println(words[i]);
            }
        }
    }
}
