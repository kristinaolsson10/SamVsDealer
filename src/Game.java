import java.util.*;

public class Game {
    private static Stack<Card> deck;
    private static Hand samsHand;
    private static Hand dealersHand;


    // TODO, make more prettier
  public static void main (String [] args){

  	deck = Deck.createNew(args);

  	samsHand = new Hand(deck.pop(), deck.remove(deck.size()-2));
    dealersHand = new Hand(deck.pop(), deck.pop());

    if (samsHand.hasBlackJack()) {
        samWins();
        return;
    }
    else if (dealersHand.hasBlackJack()) {
        dealerWins();
        return;
    }

    try {
        while(samsHand.shouldDraw(17)) {
            samsHand.drawCard(deck.pop());
        }
    } catch (ScoreOutOfBoundsException e) {
        dealerWins();
        return;
    }

    try {
      while(dealersHand.shouldDraw(samsHand.getScore()+1)) {
          dealersHand.drawCard(deck.pop());
      }
    } catch (ScoreOutOfBoundsException e) {
      samWins();
      return;
    }

    // Since it wasn't mentioned, artistic freedom deemed that Sam should win if there is a tie
    if (samsHand.getScore() >= dealersHand.getScore()) {
        samWins();
    } else {
        dealerWins();
    }

  }

  public Stack<Card> readDeckFromInputStream(String [] args){
      return new Stack<Card>();
  }

  public static void samWins(){
      printWinner("sam");
  }

  public static void dealerWins(){
    printWinner("dealer");
  }


  public static void printWinner(String winnerName) {
      System.out.println(winnerName);
      System.out.println(String.format("sam: %s", samsHand.toString()));
      System.out.println(String.format("dealer: %s", dealersHand.toString()));
  }


}



