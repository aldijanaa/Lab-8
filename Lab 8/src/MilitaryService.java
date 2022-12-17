public class MilitaryService implements  NationalService{
    private int daysLeft;

    //CONSTRUCTOR
    public MilitaryService(int daysLeft){
        this.daysLeft = daysLeft;
    }

    //getdaysleft method body
    @Override
    public int getDaysLeft(){
        return this.daysLeft;
    }

    public void work(){
        if(this.daysLeft > 0){
            this.daysLeft--; //reducing work days by one

        }
    }


}
