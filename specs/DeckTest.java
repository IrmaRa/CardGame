import static org.junit.Assert.*;
import org.junit.*;
import game.*;
import java.util.*;

public class DeckTest {
  Deck deck;
  Player player1;
  Player player2;

  @Before 
  public void before() {
    deck = new Deck();
    player1 = new Player("Louise");
    player2 = new Player("Louise");
  }

  @Test
  public void deckHasAllCards() {
    deck.buildDeck();
    assertEquals(52, deck.cardCount());
  }

  @Test
  public void canDealCardsToPlayers() {
    deck.buildDeck();
    deck.dealCard(player1);
    deck.dealCard(player2);
    assertEquals(1, player1.cardCount());
    assertEquals(1, player2.cardCount());
  }
}