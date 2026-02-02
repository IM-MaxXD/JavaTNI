public class Bakery {
    private String flavor;
    private double unitPrce;
    private int packingCost = 5;

    public Bakery(String flaver, double unitPrce){
        this.flavor = flaver;
        this.unitPrce = unitPrce;
    }
    public Bakery() {
        this("", 0.0);
    }
    public String getflaver(){
        return this.flavor;
    }
    public double getUnitPrce(){
        return this.unitPrce;
    }
    public int getPackingCost() {
        return this.getPackingCost();
    }
    public double calculateTotalPrice() {
        return this.unitPrce + this.packingCost;
    }
    public String toString(){
        return "่Thank you for your order!";
    }
}




