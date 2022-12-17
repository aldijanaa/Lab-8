
public class CivilService implements NationalService{
    private int daysLeft;

    //constructor
    public CivilService(){
        int daysLeft = 362;
    }

    //getdays
    @Override
    public int getDaysLeft(){
        return this.daysLeft;
    }

    //reduce days
    public void work(){
        while(this.daysLeft > 0){
            this.daysLeft--;
            break;
        }

    }

}
