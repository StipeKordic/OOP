public class Automobil extends Vozilo implements Pokretljivo{

    private int brojVrata;

    public Automobil(String regOznake, String marka, String model, int brojVrata){
        super(regOznake, marka, model);
        this.brojVrata = brojVrata;
    }

    public void pokreniMotor(){
        System.out.println("Automobil je pokrenut");
    }

    public void kreciSe(){
        System.out.println("Automobil se kreća");
    }
}
