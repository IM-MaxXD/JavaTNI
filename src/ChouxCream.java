public class ChouxCream extends Bakery {
    private int box;

    public ChouxCream(int box, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.box = box;
    }
    public boolean isGetDiscount(){
        return box >= 2;
    }
    @Override

    public double calculateTotalPrice(){
        if(this.box >= 2)
            return getUnitPrce() * this.box * 0.5;
        return getUnitPrce() * this.box;
    }

    public String toString(){
        return super.toString() + "\n" + " ChouxCream ( " + super.getflaver() + " )"
                + " with " + this.box + " Box" + (isGetDiscount() ? " get discount!!" : "")
                + "\nTotal price of ChouxCream = " + calculateTotalPrice();
    }
}