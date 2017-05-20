import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class DeckTest {
  Deck deck;

  @Before 
  public void before() {
    deck = new Deck();
  }

  @Test
  public void deckHasAllCards() {
    deck.addCard();
    assertEquals(52, deck.cardCount());
  }
}