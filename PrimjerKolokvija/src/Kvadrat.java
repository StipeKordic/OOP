public class Kvadrat {
    private double a;

    public Kvadrat(double a){
        this.a = a;
    }

    public double getA(){
        return this.a;
    }

    public void setA(double a){
        this.a = a;
    }

    public double povrsina(){
        return this.a*this.a;
    }

    public double opseg(){
        return 4*this.a;
    }
}
