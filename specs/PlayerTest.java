import static org.junit.Assert.assertEquals;
import org.junit.*;
import cards.*;

public class PlayerTest {
  Player player;
  Card card;

  @Before
  public void before() {
    player = new Player("Louise");
    card = new Card(CardSuit.DIAMONDS, CardValue.TWO);
  }

  @Test
  public void hasName() {
    assertEquals("Louise", player.getName());
  }

  @Test
  public void canAddCard() {
    player.addCard(card);
    assertEquals(1, player.cardCount());
  }
}