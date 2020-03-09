package JoculDeBarbut;

import java.util.Scanner;

public class BarbutGame {

    private JucatorDeBarbut player11;
    private JucatorDeBarbut player22;
    Scanner input=new Scanner(System.in);

    public BarbutGame() {
        this.player11 = player11;
        this.player22 = player22;
    }
   public JucatorDeBarbut startGame(){
        JucatorDeBarbut player1=new JucatorDeBarbut();
        JucatorDeBarbut player2=new JucatorDeBarbut();
        Zar zar1=new Zar();
       Zar zar2=new Zar();
       System.out.println("Player 1 ready ?");
       String a=input.next();

          player1.rollDice(zar1,zar2);
           System.out.println("Player 1 rolled " + player1.getDicesResult());

       System.out.println("Player 2 ready ?");
       a=input.next();

           player2.rollDice(zar1,zar2);
           System.out.println("Player 2 rolled " + player2.getDicesResult());

       checkWinner(player1,player2);
       return player1;
    }
    public void checkWinner(JucatorDeBarbut player1,JucatorDeBarbut player2){
        if(player1.getDicesResult()>player2.getDicesResult()){
            System.out.println("Player 1 wins");
        }else if(player1.getDicesResult()<player2.getDicesResult()){
            System.out.println("Player 2 wins");
        }else{
            System.out.println("Is a draw!!!");
        }

    }
}
