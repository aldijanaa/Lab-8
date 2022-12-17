import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    Map<String, Purchase> basket;  // shopping basket stores its products as Purchase objects

    //constructor
    public ShoppingBasket(){
        basket = new HashMap<String, Purchase>();  //creating object of hashmap
    }


    //adds a purchase to the shopping basket
    public void add(String product, int price){
        if(basket.containsKey(product)){
            basket.get(product).increaseAmount();
        }else {
            Purchase purchase = new Purchase(product, 1, price);
            basket.put(product, purchase);
        }
    }

    // returns the shopping basket total price
    public int price(){
        int total_price = 0;

        for(Purchase p : basket.values()){
            total_price = total_price + p.price();
        }

        return total_price;
    }

    public void print(){
        for(Purchase p : basket.values()){
            System.out.println(p);
        }
    }

}
