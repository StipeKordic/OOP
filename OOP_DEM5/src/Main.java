public class Main {
    public static void main(String[] args) {
    /*
    Pravokutnik pravokutnik = new Pravokutnik(3,5);
    Krug krug = new Krug(3);

        System.out.println("Pravokutnik:");
        pravokutnik.printInfo();

        System.out.println("Krug: ");
        krug.printInfo();

        Oblik.usporediPovrsinu(pravokutnik, krug);*/


        Automobil auto1 = new Automobil("A12B123", "Audi", "A6", 4);
        System.out.println(auto1);
        auto1.pokreniMotor();

        Avion avio1 = new Avion("C45D456", "Boeing", "737", 4);
        System.out.println(avio1);
        avio1.pokreniMotor();

    }
}