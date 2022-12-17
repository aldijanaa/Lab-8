public class Purchase {

    private String product;
    private int amount;
    private int unitPrice;

    //constructor
    public Purchase(String product, int amount, int unitPrice){
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    //returns the purchase price
    public int price(){
        return this.amount * this.unitPrice;
    }

    //increases by one the purchase unit amount
    public void increaseAmount(){
        this.amount++;
    }

    //purchase in a string form
    public String toString(){
        return this.product + ": " + this.amount;
    }



}
