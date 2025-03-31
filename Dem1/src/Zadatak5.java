public class Zadatak5 {
    public static void main(String[] args) {
        boolean[] numbers = new boolean[39];
        System.out.println(numbers[0]);
        System.out.println("Izvučeni brojevi u redosljedu izvlačenja:");
        for (int i = 0; i < 7; ) {
            int num = (int) (Math.random() * 39);
            if (!numbers[num]) {
                numbers[num] = true;
                System.out.print(num + 1 + " ");
                i++;
            }
        }
        System.out.println(" ");
        System.out.println("-------------------");
        System.out.println("Izvučeni brojevi poredani od najmanjeg do najvećeg:");
        for (int i = 0; i < 39; i++) {
            if (numbers[i]) {
                System.out.print(i + 1 + " ");
            }
        }
    }
}
