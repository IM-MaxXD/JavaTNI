public class Product {
    public String name;
    public double price = 0;
    public int quantity = 0;

    public void addStock (int amount){
        if (amount > 0){
            quantity += amount;
            System.out.println("\nAdded " + amount + " items to stock");
        }

    }
    public void sell (int amount){
        if (amount <= quantity){
            quantity -= amount;
            System.out.println("Sold " + amount + " item");
        }
        else {
            System.out.println("Not enough items in stock…");
        }

    }

    public void changePrice (double newPrice){
        if(newPrice > 0){
            price = newPrice;
            System.out.println("Change price to " + newPrice + " Bath.\n");
        }
    }
    public double stockValue (){
        return quantity * price;

    }
    public void  showInfo (){
        System.out.println("Name        : " + name);
        System.out.println("Prine       : " + price + " Bath/item");
        System.out.println("Stock       : " + quantity + " item");
        System.out.println("Stock Value : " + stockValue() + " Baht.");
    }
}
