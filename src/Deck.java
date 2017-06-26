import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by hannakamperud on 26/06/2017.
 */
public final class Deck {
    private Deck(){}

    public static Stack<Card> createNew(String [] fileInput) {
        return fileInput.length > 0 ? extractDeck(fileInput[0]) : getRandomDeck();
    }

    // TODO, fix this exception generator
    private static Stack<Card> extractDeck(String fileName) {
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            List<String> strings = stream.flatMap(string -> Arrays.stream(string.split(",")))
                    .collect(Collectors.toList());

        } catch (Exception e) {
            System.out.println("Input deck seems to be broken");
            throw new RuntimeException(e);
        }
        return new Stack<>();
    }

    private static Stack<Card> getRandomDeck(){
        final Suit [] suits = Suit.values();
        final Value [] values = Value.values();

        Stack<Card> deck = new Stack<>();

        // TODO, make more prettier
        for(int i = 0; i < suits.length; i++) {
            for(int j = 0; j < values.length; j++) {
                deck.push(new Card(values[j], suits[i]));
            }
        }

        Collections.shuffle(deck);

        return deck;
    }
}
