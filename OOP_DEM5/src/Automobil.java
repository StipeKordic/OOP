public class Automobil extends Vozilo{

    private int brojVrata;

    public Automobil(String regOznake, String marka, String model, int brojVrata){
        super(regOznake, marka, model);
        this.brojVrata = brojVrata;
    }

    public void pokreniMotor(){
        System.out.println("Automobil je pokrenut");
    }
}
