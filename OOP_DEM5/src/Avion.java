public class Avion extends Vozilo{
    private int brojMotora;

    public Avion(String regOznake, String marka, String model, int brojMotora){
        super(regOznake, marka, model);
        this.brojMotora = brojMotora;
    }

    public void pokreniMotor(){
        System.out.println("Avion je pokrenut");
    }
}
