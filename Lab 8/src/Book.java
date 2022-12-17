public class Book implements ToBeStored{
    private String writer;
    private String name;
    private double weight;


    //constructor
    public Book(String writer, String name, double weight){
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    //
    @Override
    public double weight(){
        return this.weight;
    }


    public String toString(){
        return this.writer + ": " + this.name;
    }



}
