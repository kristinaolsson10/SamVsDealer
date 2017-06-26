import java.util.Arrays;
import java.util.Optional;

/**
 * Created by hannakamperud on 26/06/2017.
 */
public enum Suit {
    CLUBS("C"),
    DIAMONDS("D"),
    HEARTS("H"),
    SPADES("S");

    private final String name;

    Suit(String name){
    	this.name = name;
    }

    public String getName() {
    	return name;
    }

    public static Optional<Suit> getSuitByName(String name){
        return Arrays.stream(Suit.values())
                .filter(suit -> suit.getName().equals(name))
                .findAny();
    }
}
