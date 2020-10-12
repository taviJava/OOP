package JoculDeBarbut;

import java.util.Random;

public class JucatorDeBarbut {
    private Zar dice1;
    private Zar dice2;
    private int dicesResult;
   private int dice1Result ;
    private int dice2Result;

    public JucatorDeBarbut() {
        this.dice1 = dice1;
        this.dice2 = dice2;
        this.dicesResult =dice1Result;
        this.dice1Result = dice1Result;
        this.dice2Result = dice2Result;
    }

    public Zar getDice1() {
        return dice1;
    }

    public void setDice1(Zar dice1) {
        this.dice1 = dice1;
    }

    public Zar getDice2() {
        return dice2;
    }

    public void setDice2(Zar dice2) {
        this.dice2 = dice2;
    }

    public int getDicesResult() {
        return dicesResult;
    }

    public void setDicesResult(int dicesResult) {
        this.dicesResult = dicesResult;
    }

    public Zar rollDice(Zar dice1, Zar dice2) {
      this.dicesResult=  dice1.getDiceValue()+dice2.getDiceValue();

return dice1;
    }
}
