import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Food extends Item{
    private double weight;
    private LocalDate bestBefore;

    public double getWeight(){
        return this.weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public LocalDate getBestBefore(){
        return this.bestBefore;
    }

    public void setBestBefore(LocalDate bestBefore){
        this.bestBefore = bestBefore;
    }


    public Food(String sku, String name, double netSalePrice, double weight, LocalDate bestBefore){
        super(sku, name, netSalePrice);
        this.weight = weight;
        this.bestBefore = bestBefore;
    }

    public Food(String sku, String name, double weight, LocalDate bestBefore){
        super(sku, name);
        this.weight = weight;
        this.bestBefore = bestBefore;
    }

    @Override
    public String getItemType(){
        return "Food";
    }


    public static double getVAT(){
        return 0.07;
    }

    @Override
    public String toString(){
        String s = super.toString();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY.");
        s += ", best before: " + formatter.format(this.bestBefore);
        return s;
    }
}
