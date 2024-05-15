public abstract class Vozilo {
    String regOznake;
    String marka;
    String model;

    public Vozilo(String regOznake, String marka, String model){

        this.regOznake = regOznake;
        this.marka = marka;
        this.model = model;
    }

    public abstract void pokreniMotor();

    @Override
    public String toString(){
        return String.format("Registarske oznake %s %n Marka: %s %nModel %s", this.regOznake, this.marka, this.model);
    }
}
