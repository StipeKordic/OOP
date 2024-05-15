public class Item {
    private String name;
    private String sku;
    private double netSalePrice;

    public String getname(){
        return this.name;
    }

    public String getSku(){
        return this.sku;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSku(String sku){
        this.sku = sku;
    }

    public double getNetSalePrice(){
        return this.netSalePrice;
    }

    public void setNetSalePrice(double netSalePrice){
        this.netSalePrice = netSalePrice;
    }

    public Item(String name, String sku, double netSalePrice){
        this.name = name;
        this.sku = sku;
        this.netSalePrice = netSalePrice;
    }

    public Item(String name, String sku){
        this.name = name;
        this.sku = sku;
        this.netSalePrice = 0;
    }

    public static double getVAT(){
        return 0.17;
    }

    public String getItemType(){
        return "";
    }

    public double getPrice(int n){
        return n * this.netSalePrice * (1 + getVAT());
    }

    @Override
    public String toString(){
        return String.format("%s - %s", this.sku, this.name);
    }
}
