import java.util.Random;

public class Player {

    private int win;
    private int currentRoll;

    public Player() {
        this.win = 0;
        this.currentRoll = 0;
    }

    public void roll() {
        Random random = new Random();
        this.currentRoll = random.nextInt(6) + 1;
    }
    public void setWin (){
        this.win++;
    }
    public int getRoll ()
    {
        return this.currentRoll;
    }
    public int getWin (){
        return this.win;
    }
}
