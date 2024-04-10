import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int broj = (int) (Math.random() * 101) +1;
        System.out.println(broj);
        Scanner scanne = new Scanner(System.in);
        System.out.println("Pokusajte pogoditi broj: ");
        int pogodak = scanne.nextInt();

        while(pogodak!=broj){
            System.out.println("Unesite novi broj: ");
            if(broj>pogodak){
                System.out.println("Trazeni roj je veci");
            }else{
                System.out.println("Trazeni broj je manji");
            }
            pogodak = scanne.nextInt();
        }
        System.out.println("POGODAK");

        System.out.println(f(1, 4, 5));
    }

    public static double f(double x, double y, double z){
        return (x+y)*(x+z) * Math.sin(x) / (2*x-y);
    }
}