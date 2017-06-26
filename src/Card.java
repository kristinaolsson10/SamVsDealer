import java.util.Collections;
import java.util.Stack;

/**
 * Created by hannakamperud on 26/06/2017.
 */
public class Card {
	private final Value value;
	private final Suit suit;

	public Card(Value value, Suit suit){
	    this.value = value;
	    this.suit = suit;
    }

    public Card(String name) {
		this.suit = Suit.getSuitByName(name.substring(0, 1)).get();
		this.value = Value.getValueByName(name.substring(1)).get();
	}

    public int getValue(){
	    return value.getValue();
    }

	public String toString() {
    	return String.format("%s%s", suit.getName(), value.getName());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Card card = (Card) o;

		if (value != card.value) return false;
		return suit == card.suit;
	}

	@Override
	public int hashCode() {
		int result = value != null ? value.hashCode() : 0;
		result = 31 * result + (suit != null ? suit.hashCode() : 0);
		return result;
	}
}
