import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //task 2
        Book  book1 = new Book("Fjodor  Dostojevski", "Pride and Prejudice", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

        CD cd1 = new CD("Pink Floyd", "Dark Side of The moon",1973);
        CD cd2 = new CD("Bon Jovi", "It's MY life", 1999);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);


        //task 2
        Box box = new Box(10);

        box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box.add( new Book("Robert Martin", "Clean Code", 1) );
        box.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

        box.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );

        System.out.println( box );

        //task 3
        GenericClass<Integer> g1 = new GenericClass(10);
        System.out.println("Integer: " + g1.getValue());
        GenericClass<String> g2 = new GenericClass("Hello");
        System.out.println("String: " + g2.getValue());


         //ONLINE SHOP
        //PART 1
        Storehouse store = new Storehouse();
        store.addProduct("milk", 3, 10);
        store.addProduct("coffee", 5, 7);
        System.out.println("prices:");
        System.out.println("milk:  " + store.price("milk"));
        System.out.println("coffee:  " + store.price("coffee"));
        System.out.println("sugar: " + store.price("sugar"));


        //PART 2
        Storehouse store1 = new Storehouse();
        store1.addProduct("coffee", 5, 1);

        System.out.println("stocks:");
        System.out.println("coffee:  " + store1.stock("coffee"));
        System.out.println("sugar: " + store1.stock("sugar"));

        System.out.println("we take a coffee " + store1.take("coffee"));
        System.out.println("we take a coffee " + store1.take("coffee"));
        System.out.println("we take sugar " + store1.take("sugar"));

        System.out.println("stocks:");
        System.out.println("coffee:  " + store1.stock("coffee"));
        System.out.println("sugar: " + store1.stock("sugar"));


        //PART 3
        Storehouse store2 = new Storehouse();
        store2.addProduct("milk", 3, 10);
        store2.addProduct("coffee", 5, 6);
        store2.addProduct("buttermilk", 2, 20);
        store2.addProduct("jogurt", 2, 20);

        System.out.println("products:");
        for (String product : store2.products()) {
            System.out.println(product);
        }

        //PART 4
        Purchase purchase = new Purchase("milk", 4, 2);
        System.out.println( "the total price of a purchase containing four milks is " + purchase.price() );
        System.out.println( purchase );
        purchase.increaseAmount();
        System.out.println( purchase );

        //PART 5
        ShoppingBasket basket1 = new ShoppingBasket();
        basket1.add("milk", 3);
        basket1.add("buttermilk", 2);
        basket1.add("cheese", 5);
        System.out.println("basket price: " + basket1.price());
        basket1.add("computer", 899);
        System.out.println("basket price: " + basket1.price());

        basket1.print();

        //PART 6
        ShoppingBasket basket = new ShoppingBasket();
        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        basket.add("buttermilk", 2);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        //PART 7
        Storehouse store3 = new Storehouse();
        store3.addProduct("coffee", 5, 10);
        store3.addProduct("milk", 3, 20);
        store3.addProduct("milkbutter", 2, 55);
        store3.addProduct("bread", 7, 8);

        Shop shop = new Shop(store, new Scanner(System.in));
        shop.manage("Pekka");

    }
}