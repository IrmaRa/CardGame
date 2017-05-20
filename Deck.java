import java.util.*;
import cards.*;

public class Deck {
  public ArrayList<Card> deck;

  public Deck() {
    this.deck = new ArrayList<Card>();
  }

  public int cardCount(){
    return this.deck.size();
  }

  public void buildDeck() {
    for (CardSuit suit : CardSuit.values()){
      for (CardValue value : CardValue.values()){
        this.deck.add(new Card(suit, value));
      }
    }
  }

  public void dealCard(Player player) {
    Card card = this.deck.remove(0);
    player.getCard(card);

  }

}