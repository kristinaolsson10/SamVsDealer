import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by hannakamperud on 26/06/2017.
 */
class CardTest {

    @Test
    public void testConstructorByName(){
        Card cardByName = new Card("C2");
        Card card = new Card(Value.TWO, Suit.CLUBS);

        assertEquals(card, cardByName);

        cardByName = new Card("CA");
        card = new Card(Value.ACE, Suit.CLUBS);

        assertEquals(card, cardByName);

        cardByName = new Card("D5");
        card = new Card(Value.FIVE, Suit.DIAMONDS);

        assertEquals(card, cardByName);

        cardByName = new Card("H9");
        card = new Card(Value.NINE, Suit.HEARTS);

        assertEquals(card, cardByName);

        cardByName = new Card("HQ");
        card = new Card(Value.QUEEN, Suit.HEARTS);

        assertEquals(card, cardByName);

        cardByName = new Card("S8");
        card = new Card(Value.EIGHT, Suit.SPADES);

        assertEquals(card, cardByName);
    }



}