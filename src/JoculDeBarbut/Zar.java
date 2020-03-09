package JoculDeBarbut;

import java.util.Arrays;
import java.util.Random;

public class Zar {
    private  int sir [];

    public Zar() {
        this.sir = new int[]{1, 2, 3, 4, 5, 6};
    }

    public int  getDiceValue(){
        Random random=new Random();
        int min = sir[0];
        int max = sir[sir.length-1];
int x=7;
        while (x < min || x > max) {
            x = (int) (Math.random() * max) + min;
            System.out.println(x);
            if (x < min || x >= max) {
                break;
            }

        }
        return x ;
    }
}
