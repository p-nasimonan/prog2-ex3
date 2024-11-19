package prog2.ex3;
import java.util.Random;

public class Dice {
    private int value;
    Random rand = new Random();
    public Dice(){
        this.value = play();
    }
    public int play(){
        
        return rand.nextInt(6);
    }
    public int getValue(){
        return this.value;
    }
}
