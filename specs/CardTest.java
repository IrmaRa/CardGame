import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class CardTest {

  Card card;
  
  @Before 
  public void before(){
    card = new Card(CardSuit.DIAMONDS, CardValue.ACE);
  }

  @Test
  public void canGetSuit(){
    assertEquals(CardSuit.DIAMONDS, card.getSuit());
  }

  @Test
  public void canGetValue(){
    assertEquals(CardValue.ACE, card.getValue());
  }

  @Test
  public void canGetAnotherSuit() {
    card = new Card(CardSuit.HEARTS, CardValue.FIVE);
    assertEquals(CardSuit.HEARTS, card.getSuit());
  }

  @Test
  public void canGetAnotherValue() {
    card = new Card(CardSuit.SPADES, CardValue.JACK);
    assertEquals(CardValue.JACK, card.getValue());
  }

}