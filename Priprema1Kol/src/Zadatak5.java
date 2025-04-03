public class Zadatak5 {
    public static void main(String[] args) {
        double sum = 0;
        int first4 = (int) (Math.PI * 1e5);
        double calc4 = 0;
        int i=0;
        while(first4 != calc4) {
            i++;
            sum += 1.0/((double)i*i);
            calc4 = (int) (1e5 * Math.sqrt(6 * sum));
        }
        System.out.printf("Pi after %d steps is %.5f", i, Math.sqrt(6. * sum));

    }
}
