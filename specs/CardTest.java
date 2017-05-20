import static org.junit.Assert.*;
import org.junit.*;
import game.*;
import java.util.*;

public class CardTest {

  Card card;
  CardRank rank;
  
  @Before 
  public void before() {
    card = new Card(CardSuit.DIAMONDS, CardRank.ACE);
  }

  @Test
  public void canGetSuit() {
    assertEquals(CardSuit.DIAMONDS, card.getSuit());
  }

  @Test
  public void canGetRank() {
    assertEquals(CardRank.ACE, card.getRank());
  }

  @Test
  public void canGetAnotherSuit() {
    card = new Card(CardSuit.HEARTS, CardRank.FIVE);
    assertEquals(CardSuit.HEARTS, card.getSuit());
  }

  @Test
  public void canGetAnotherRank() {
    card = new Card(CardSuit.SPADES, CardRank.JACK);
    assertEquals(CardRank.JACK, card.getRank());
  }

  @Test
  public void canCheckCardValue() {
    rank = CardRank.KING;
    assertEquals(10, rank.getValue());
  }

}