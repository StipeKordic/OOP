public class Krug extends Oblik{

    private double radijus;

    public Krug(double radijus){
        this.radijus = radijus;
    }

    @Override
    public double izracunajPovrsinu(){
        return Math.PI*this.radijus*this.radijus;
    }

    @Override
    public double izracunajOpseg(){
        return Math.PI*2*this.radijus;
    }
}
