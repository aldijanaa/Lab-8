public class CD implements ToBeStored{
    private String artist;
    private String name;
    private int publishingYear;
    private double weight;

    //constructor
    public CD(String artist, String name,  int publishingYear){
        this.artist = artist;
        this.name = name;
        this.publishingYear = publishingYear;
        this.weight = 0.1;

    }

    //all CD weight 0.1 kg
    //WHEN IMPLEMENTING INTERFACE METHOD, ALWAYS HAVE TO OVERRIDE
    @Override
    public double weight(){
        return weight;
    }


    public String toString(){
        return this.artist + ": " + this.name + " (" + this.publishingYear + ")";
    }

}
