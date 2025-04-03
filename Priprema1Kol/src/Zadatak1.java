import java.util.HashMap;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite prvu rijec: ");
        String word1 = scanner.nextLine();
        System.out.println("Unesite drugu rijec: ");
        String word2 = scanner.nextLine();

        if (areAnagrams(word1, word2)){
            System.out.printf("Rijeci %s i %s su anagrami.", word1, word2);
        }else{
            System.out.printf("Rijeci %s i %s nisu anagrami.", word1, word2);
        }
    }
    public static boolean areAnagrams(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        HashMap<Character, Integer> str1HashMap = getCharFrequency(str1);
        System.out.println(str1HashMap);
        HashMap<Character, Integer> str2HashMap = getCharFrequency(str2);
        System.out.println(str2HashMap);
        return str1HashMap.equals(str2HashMap);
    }
    private static HashMap<Character, Integer> getCharFrequency(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i<str.length(); i++) {
            charCount.put(str.charAt(i), charCount.getOrDefault(str.charAt(i), 0) + 1);
        }
        return charCount;
    }
}