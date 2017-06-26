import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by hannakamperud on 26/06/2017.
 */
public class Hand {
    private ArrayList<Card> cards;

    public Hand(Card first, Card second){
        cards = new ArrayList(Arrays.asList(first, second));
    }

    public boolean hasBlackJack() {
        return getScore()==21;
    }

    public int getScore(){
        return cards.stream().mapToInt(Card::getValue).sum();
    }


    public boolean shouldDraw(int scoreToBeat) {
        return getScore() < scoreToBeat;
    }

    public void drawCard(Card card) throws ScoreOutOfBoundsException {
        cards.add(card);
        if (getScore() > 21) {
            throw new ScoreOutOfBoundsException();
        }
    }

    public String toString(){
        List names = cards.stream().map(Card::toString).collect(Collectors.toList());
        return String.join(",", names);
    }

}
