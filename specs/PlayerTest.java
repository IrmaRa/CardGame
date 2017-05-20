import static org.junit.Assert.assertEquals;
import org.junit.*;
import game.*;
import java.util.*;

public class PlayerTest {
  Player player;
  Card card;
  Deck deck;

  @Before
  public void before() {
    player = new Player("Louise");
    card = new Card(CardSuit.DIAMONDS, CardRank.KING);
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
  public void canGetValueOfCardInHand() {
    player.getCard(card);
    assertEquals(10, player.getHandValue());
  }

}