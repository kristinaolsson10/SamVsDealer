import java.util.Arrays;
import java.util.Optional;

/**
 * Created by hannakamperud on 26/06/2017.
 */
public enum Value {
    TWO(2,"2"),
    THREE(3,"3"),
    FOUR(4,"4"),
    FIVE(5,"5"),
    SIX(6,"6"),
    SEVEN(7,"7"),
    EIGHT(8,"8"),
    NINE(9,"9"),
    TEN(10,"10"),
    JACK(10,"J"),
    QUEEN(10,"Q"),
    KING(10,"K"),
    ACE(11,"A");

    private final Integer value;
    private final String name;

    Value(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Optional<Value> getValueByName(String name){
        return Arrays.stream(Value.values())
                .filter(value -> value.getName().equals(name))
                .findAny();
    }

    public int getValue() {
        return value;
    }

    public String getName() {
    	return name;
    }
}
