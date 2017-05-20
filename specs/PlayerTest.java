import static org.junit.Assert.assertEquals;
import org.junit.*;
import cards.*;
import java.util.*;

public class PlayerTest {
  Player player;
  Card card;
  Deck deck;

  @Before
  public void before() {
    player = new Player("Louise");
    card = new Card(CardSuit.DIAMONDS, CardValue.TWO);
    deck = new Deck();
  }

  @Test
  public void hasName() {
    assertEquals("Louise", player.getName());
  }

  @Test
  public void canAddCard() {
    player.getCard(card);
    assertEquals(1, player.cardCount());
  }

  @Test
  public void canGetCardsFromDeck() {
    player.getCard(card);
    assertEquals(1, player.cardCount());
  }
}