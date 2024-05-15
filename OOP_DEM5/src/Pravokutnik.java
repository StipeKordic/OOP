public class Pravokutnik extends Oblik{

    private double sirina;
    private double visina;

    public Pravokutnik(double sirina, double visina){
        this.sirina = sirina;
        this.visina = visina;
    }

    public void setVisina(double visina){
        if (visina <= 0){
            System.out.println("Visina mora biti veća od 0");
        }else{
            this.visina = visina;
        }
    }
    @Override
    public double izracunajPovrsinu(){
        return this.sirina * this.visina;
    }

    @Override
    public double izracunajOpseg(){
        return 2 * (this.visina + this.sirina);
    }
}
