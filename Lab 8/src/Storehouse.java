
import java.util.HashMap;
import java.util.Map; //importing the interface
import java.util.Set;



public class Storehouse {
    //creating hashmap through the interface
    Map<String, Integer> prices;
    Map<String, Integer> stocks;

    //constructor
    public Storehouse(){
        this.prices = new HashMap<String, Integer>();   //creating hashmap object
        this.stocks = new HashMap<String, Integer>();  //hashmap object
    }

    public void addProduct(String product, int price, int stock){
        prices.put(product, price);

        stocks.put(product, stock);
    }

    // returns the price of the parameter product;
    // if the product is not available in the storehouse, the method returns -99

    public int price(String product){
        if(prices.containsKey(product)){
            return prices.get(product);
        }else{
            return -99;
        }
    }

    //part 2 - returns the stock of the parameter product.
    public int stock(String product){
        if(stocks.containsKey(product)){
            return stocks.get(product);
        }else{
            return 0;
        }
    }


    public boolean take(String product){
        if(stocks.containsKey(product)){
            if(stocks.get(product) > 0){
                stocks.put(product, stocks.get(product)-1);
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }


    //generic - returns a name set of the products contained in the storehouse
    public Set<String> products(){
        return prices.keySet();
    }












}
