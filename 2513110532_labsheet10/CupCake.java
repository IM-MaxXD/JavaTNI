public class CupCake extends Bakery{
    private int piece;

    public CupCake(int piece, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.piece = piece;
    }
    public boolean isPackingBox() {
        return piece >= 6;
    }
    public int getBoxNumber() {
        if (isPackingBox()){
            return piece / 6;
        }
        return 0;
    }
    public int getBagNumber() {
        return this.piece % 6;
    }
    @Override
    public int getPackingCost(){
        if(isPackingBox())
        return getBoxNumber() * super.getPackingCost();
        return 0;
    }

    public double calculateTotalPrice() {
        return (this.piece * getUnitPrce()) + getPackingCost() + (getBagNumber() * 0.5);
    }

    public String toString(){
        return super.toString() + "\n" + " Cup Cake ( " + super.getflaver() + " )"
                + " with " + (isPackingBox() ? getBoxNumber() + " Box " : "") + getBagNumber() + " Bag "
                + "\nTotal price of Cup Cake = " + (this.piece * getUnitPrce());
    }
}
